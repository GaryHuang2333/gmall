package com.gary.gmall.controllers;

import com.gary.gmall.domain.Order;
import com.gary.gmall.domain.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public String searchProduct(@RequestParam("name") String productName) {
        System.out.println("Search Product name : " + productName);
        // TODO do some DB stuff

        return "search product [" + productName + "]";
    }

    @PostMapping("/addCart")
    public String addIntoCart(@RequestBody Product product) {
        System.out.println("add product [" + product.getName() + "] into cart");
        // TODO do some DB stuff

        return "add product [" + product.getName() + "] into cart";

    }

    @PostMapping("/makeOrder")
    public String makeOrder(@RequestBody Order order) {
        System.out.println("customer make order , product [" + order.getProduct().getName() + "] quantity[" + order.getQuantity() + "] unitPrice[" + order.getProduct().getPrice() + "]");

        return "customer make order , product [" + order.getProduct().getName() + "] quantity[" + order.getQuantity() + "] unitPrice[" + order.getProduct().getPrice() + "]";
    }
}
