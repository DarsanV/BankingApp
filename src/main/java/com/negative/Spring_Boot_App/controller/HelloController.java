package com.negative.Spring_Boot_App.controller;

import com.negative.Spring_Boot_App.component.HelloComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloComponent hellocomponent;



    @GetMapping("/hello")
    public String hello()
    {

         return hellocomponent.say_hello();
    }
@GetMapping("/yaml")
    public String newWorld()
    {
        return hellocomponent.new_hello();
    }
}
