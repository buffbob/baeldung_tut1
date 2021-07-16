package com.lastgulch.baeldung_tut1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage(Model m) {
        m.addAttribute("appName", appName);
        return "home";


    }

}
