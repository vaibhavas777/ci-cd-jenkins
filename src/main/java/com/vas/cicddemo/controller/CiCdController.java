package com.vas.cicddemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiCdController {

    @GetMapping("/greetings/{name}")
    public String greetings(@PathVariable String name){
      return "Hi "  +name+ " welcome to the CI/CD demo project with jenkins.";
    }
}
