package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HalloController {
    @GetMapping("")
    public String hello() {
        System.out.println("hello world");
        return "成功";
    }
}
