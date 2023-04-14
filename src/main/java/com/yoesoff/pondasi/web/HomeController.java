package com.yoesoff.pondasi.web;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * https://www.wimdeblauwe.com/blog/2023/01/24/using-google-login-with-spring-boot-3-and-thymeleaf/
 */

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(Model model,
                       @AuthenticationPrincipal OAuth2User user) {
        String name = user.getAttribute("name");
        String email = user.getAttribute("email");
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "index";
    }
}