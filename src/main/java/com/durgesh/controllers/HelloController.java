package com.durgesh.controllers;

@org.springframework.web.bind.annotation.RestController
public class HelloController {
    @org.springframework.web.bind.annotation.GetMapping("/hello")
    public String hello(){
        return "hello people!";
    }
}
