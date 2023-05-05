package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    @Value("${initial.message}")
    private String name;


    // expose '/' endpoint that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return name;
    }

}
