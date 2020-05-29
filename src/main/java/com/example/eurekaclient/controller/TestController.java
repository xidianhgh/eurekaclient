package com.example.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/a")
    public Map<String,Object> test(){
        System.out.println("come in test");
        Map<String,Object> map= new HashMap<>();
        map.put("success",true);
        return map;
    }
}
