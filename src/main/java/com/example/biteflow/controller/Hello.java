package com.example.biteflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
class Hello {
    @GetMapping("/hello")
    String hello() {
        return "Hello World!";
    }
}
