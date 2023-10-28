package com.study.daniel.apiping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ping")
public class PingController {

    @GetMapping
    public String ping() {
        String p = "Everything working perfectly!!";
        System.out.println(p);
        return p;
    }
}
