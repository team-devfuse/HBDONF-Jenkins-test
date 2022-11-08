package com.devfuse.jenkins.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("test")
class TestController{

    @GetMapping("")
    fun test() : String {
        return "Helle World"
    }

}