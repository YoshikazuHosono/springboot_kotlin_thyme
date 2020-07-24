package com.example.springboot_kotlin_thyme

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.example.springboot_kotlin_thyme.controller")
class SpringbootKotlinThymeleafApplication

fun main(args: Array<String>) {
    runApplication<SpringbootKotlinThymeleafApplication>(*args)
}
