package com.darakthon.healthmatch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        log.info("access");
        return "home";
    }
}
