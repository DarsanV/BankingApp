package com.negative.Spring_Boot_App.component;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Primary
@Profile("qa")
public class MySqlComponent implements DBComponent{



    @Override
    public void performDBoperation() {
        System.out.println("Using MySql DB ");
    }
}
