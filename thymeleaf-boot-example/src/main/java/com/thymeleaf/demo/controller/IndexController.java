package com.thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String user(){
        return "userlogin";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    
    @GetMapping("/about")
    public String about() {
    	return "about";
    }
}
