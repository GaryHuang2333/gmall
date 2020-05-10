package com.gary.gmall.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/admin")
    public String adminLogin() {
        return "welcome back ";
    }

    @GetMapping("/customer")
    public String customerLogin() {
        return "customer login";
    }

    @GetMapping("/seller")
    public String sellerLogin() {
        return "seller login";
    }
}
