package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping("/sys")
    public String index(){
        System.out.println("enter controller...");
        String ss = "hongxin";
        String mingming = "pengfei";
        String str = ss+" he " +mingming;
        return str+"hi:hongxin.shao,welcome to spring boot!";
    }
}
