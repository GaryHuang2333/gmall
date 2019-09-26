package com.gary.gmall.controllers;

import com.gary.gmall.domain.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @PostMapping("/upload")
    public String uploadProduct(@RequestBody Product product) {
        return "upload product [" + product.getName() + "]";
    }

    @PostMapping("/setup")
    public String setupProduct(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        String[] ids = parameterMap.get("id");
        String[] prices = parameterMap.get("price");
        String[] quantities = parameterMap.get("quantity");

        String id = Arrays.asList(ids).stream().collect(Collectors.joining(";"));
        String price = Arrays.asList(prices).stream().collect(Collectors.joining(";"));
        String quantity = Arrays.asList(quantities).stream().collect(Collectors.joining(";"));

        return "setup product id=[" + id + "] price[" + price + "] quantity[" + quantity + "]";
    }
}
