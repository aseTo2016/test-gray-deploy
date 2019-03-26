package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        StringBuffer sb = new StringBuffer(100);
        sb.append("test");
        String b = sb.toString();
        return b;
    }
}