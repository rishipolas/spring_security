package com.sp.security.test.spSecurityTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

    @GetMapping(value = "/test")
    public String m1 (){
        return "public method access";
    }
}
