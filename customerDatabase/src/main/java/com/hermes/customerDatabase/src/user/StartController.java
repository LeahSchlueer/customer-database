package com.hermes.customerDatabase.src.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {

    @GetMapping("/start")
    String start() {
        return "start";
    }
}
