package com.messagingapp.Spring_Messaging_App;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class HelloRestController {
    @RequestMapping("Hello")
    public String sayHello()
    {
        return "Hello from Bridgelabz";
    }
}
