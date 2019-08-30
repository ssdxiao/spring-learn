package com.companyname.bank.controller;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloWorldController {
 
    @RequestMapping("/hello")
    public String say(){
        return "Spring Boot 你大爷！";
    }
}

