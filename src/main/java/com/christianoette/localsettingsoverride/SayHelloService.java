package com.christianoette.localsettingsoverride;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SayHelloService {

    static final Logger log = LoggerFactory.getLogger(SayHelloService.class);

    @Value("${output.text}")
    private String outputText;

    @Value("${output.dynamic-base-property}")
    private String dynamicProperty;

    private final String conditionalText;
    private final Environment environment;

    public SayHelloService(final Environment environment, final String conditionalText) {
        this.environment = environment;
        this.conditionalText = conditionalText;
    }


    public void printWelcome() {

        log.info("dynamic-property: "+dynamicProperty);
        log.info("conditionalText: "+conditionalText);
        log.info(outputText + " / Active Profiles: {}", (Object[]) environment.getActiveProfiles());
    }
}
