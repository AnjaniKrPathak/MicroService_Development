package com.ishi.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome in Ishi Bank World Accounts Section !!!";
    }
}
