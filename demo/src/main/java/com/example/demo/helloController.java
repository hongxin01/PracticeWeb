package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping("/sys")
    public String index(){
        System.out.println("enter controller...");
        return "hi:hongxin.shao,welcome to spring boot!";
    }
}
