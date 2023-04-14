package com.yoesoff.pondasi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {
    @GetMapping("/")
    public String hello() {
        return "helloworld";
    }
}
