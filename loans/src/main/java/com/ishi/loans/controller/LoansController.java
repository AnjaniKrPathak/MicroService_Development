package com.ishi.loans.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LoansController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome to Ishi World Bank Loan Section !!!";
    }
    @GetMapping("/{userId}")
    public List<String> getAllLoans(){
        return new ArrayList<>();

    }
}
