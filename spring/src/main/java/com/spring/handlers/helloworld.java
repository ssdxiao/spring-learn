package com.spring.handlers;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
 
@Controller
public class helloworld
{
    @RequestMapping("/click")   
    public String hello() 
    {
        System.out.println("hellowolrd");   
        return "result";
    }
}


