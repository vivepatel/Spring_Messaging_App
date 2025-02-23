package com.messagingapp.Spring_Messaging_App;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class HelloRestController {
    @RequestMapping("Hello")
    public String sayHello()
    {
        return "Hello from Bridgelabz";
    }
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name)
    {
        return  "Hello"+" " + name +"!";
    }
    @RequestMapping(value = "/param/{name}")
    public String sayHelloParam(@PathVariable String name)
    {
        return "Hello" + name + " !";
    }
}
