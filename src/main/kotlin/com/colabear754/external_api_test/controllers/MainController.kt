package com.colabear754.external_api_test.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import springfox.documentation.annotations.ApiIgnore

@ApiIgnore
@Controller
class MainController {
    @GetMapping("/")
    fun redirectToSwagger() = "redirect:/swagger-ui/index.html"
}