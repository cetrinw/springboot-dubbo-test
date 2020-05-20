package com.cetrinw.mvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("msg", "hello world!");
        return "hello";
    }
}
