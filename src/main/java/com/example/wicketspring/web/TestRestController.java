package com.example.wicketspring.web;

import com.example.wicketspring.Wallclock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A Spring WebMVC REST Controller, which can be used alongside Wicket
 */
@RestController
public class TestRestController {

    @Autowired
    Wallclock wallclock;

    @GetMapping("/rest/test")
    public String hello() {
        return "Hello World: " + wallclock.getTime();
    }

}
