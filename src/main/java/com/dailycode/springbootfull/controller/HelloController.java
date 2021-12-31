package com.dailycode.springbootfull.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @GetMapping("/")
    public String helloWorld(){
        return "Hello dailyCode full course for learning spring-boot!";
    }
}
