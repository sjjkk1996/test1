package com.example.test.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/watchtable/")
public class TestController {
    @GetMapping({"/myinfo","/login","/join","/manage","/detailed","/admin"})
    public void list(){
        log.info("exMain…….");
    }
}