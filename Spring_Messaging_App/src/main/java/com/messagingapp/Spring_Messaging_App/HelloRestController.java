package com.messagingapp.Spring_Messaging_App;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
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
    @PostMapping("/post")
    public String sayHello(@RequestBody User user)
    {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "From BridgeLabz";
    }
}
