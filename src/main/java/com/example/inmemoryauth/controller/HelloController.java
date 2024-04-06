package com.example.inmemoryauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HelloController {

    @GetMapping
    public String sayHello(){
        return "Her kese salam";
    }

}
