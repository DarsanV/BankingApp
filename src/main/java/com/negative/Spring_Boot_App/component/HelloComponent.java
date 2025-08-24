package com.negative.Spring_Boot_App.component;

import com.negative.Spring_Boot_App.config.ConfigPrefix;
import com.negative.Spring_Boot_App.config.NewConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloComponent {
    Logger log = LoggerFactory.getLogger(HelloComponent.class);


    @Value("${custom.property.message}")
    private String message;

    @Value("${custom.yaml.message}")
    private String new_message;

    @Autowired
    private ConfigPrefix prefix;

    @Autowired
    private NewConfig yaml;

    @Autowired
    private DBComponent dbComponent;


    public String say_hello()
    {

        log.info("Info from the component");
        log.trace("traced from the component");
        log.debug("debug the component");

        dbComponent.performDBoperation();
        return "Hello Sir , Welcome to Fsociety " + message +" " +  prefix.getFirstname() + " " + prefix.getLastname() ;
    }



    public String new_hello() {
        return "Hello Sir , Welcome to Fsociety "+" " + new_message +" " +  yaml.getFirstname() + " " + yaml.getLastname() ;


    }
}
