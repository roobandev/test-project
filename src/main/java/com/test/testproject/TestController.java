package com.test.testproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/api")
    public String responseString(){
        return "{\"status\":\"ok\"}";
    }
}
