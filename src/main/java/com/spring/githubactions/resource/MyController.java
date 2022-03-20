package com.spring.githubactions.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello-word")
    public String helloWord() {
        return "Hello Word";
    }

}
