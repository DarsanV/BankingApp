package com.negative.Spring_Boot_App.component;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class H2Component implements DBComponent{
    @Override
    public void performDBoperation() {
        System.out.println("Using H2 DB");
    }
}
