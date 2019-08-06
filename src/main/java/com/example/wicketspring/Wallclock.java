package com.example.wicketspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Example Spring Bean which is accessed from Wicket
 */
@Component
public class Wallclock {

    public Wallclock(@Value("${random.value}") String dummy) {
    }

    public String getTime() {
        return new Date().toString();
    }

}
