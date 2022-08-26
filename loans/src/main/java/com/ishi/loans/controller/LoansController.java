package com.ishi.loans.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome to Ishi Bank World Loan Section !!!";
    }
}
