package com.yoesoff.pondasi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    public String hello() {
        return "helloworld";
    }
}
