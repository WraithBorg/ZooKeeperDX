package com.zkd.controller;


import com.zkd.client.HelloClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class GreetingController {
    @Resource
    private HelloClient helloClient;

    @GetMapping("/get-greeting")
    public String greeting(){
        return helloClient.hello();
    }

}
