package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Hello {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}