package com.example.springboot_kotlin_thyme.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class HelloController {

    @GetMapping("/hello")
    fun hello(model: Model): String {
        model.addAttribute("message", "Hello hosono's thyme !!")

        val list = listOf("Bon", "jo", "vi")
        model.addAttribute("list", list)

        val userList = listOf(User(1, "Bonjovi"), User(2, "Nonjovi"), User(3, "Sonjovi"))
        model.addAttribute("userList", userList)

        return "hello"
    }

    @PostMapping("/next")
    fun next(@RequestParam id: Long, model: Model): String {
        model.addAttribute("id", id)
        return "next"
    }

}

data class User(
        val id: Long,
        val name: String
)