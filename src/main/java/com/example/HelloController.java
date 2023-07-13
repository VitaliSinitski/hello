package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld(Model model) {
        String name = "World";
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
