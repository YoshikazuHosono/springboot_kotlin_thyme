package com.example.springboot_kotlin_thyme.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

    @GetMapping("/hello")
    fun hello(model: Model): String {
        model.addAttribute("message", "Hello hosono's thyme !!")
        return "hello"
    }

}