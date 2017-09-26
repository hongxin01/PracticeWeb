package com.example.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("helloController.....");
        return "hello,this is a springboot demo";
    }
}
