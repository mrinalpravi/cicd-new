package com.example.springdemo.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    @GetMapping("/greet")
    public String getGreet() {
        return "Good Morning";
    }

}
