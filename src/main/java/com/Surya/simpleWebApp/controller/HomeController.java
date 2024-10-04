package com.Surya.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // means that we only return data and not ui
public class HomeController {

    @RequestMapping("/") // for routing?
    //@ResponseBody // don't create the page and show the text/body
    public String greet()
    {
        return "Welcome to Surya!!!";
    }

    @RequestMapping("/about")
    public String about()
    {
        return "We don't teach, we educate!";
    }
}
