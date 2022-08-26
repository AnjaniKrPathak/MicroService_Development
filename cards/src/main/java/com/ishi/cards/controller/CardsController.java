package com.ishi.cards.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome to Ishi Bank World Cards Section !!!";
    }
}
