package com.christianoette.localsettingsoverride.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfig {

    @Bean(name = "conditionalText")
    @ConditionalOnProperty(prefix = "output.condition.selection", name = "value", havingValue = "one")
    public String conditionalText1() {
        return "Conditional Option A1";
    }

    @Bean(name = "conditionalText")
    @ConditionalOnProperty(prefix = "output.condition.selection", name = "value", havingValue = "two")
    public String conditionalText2() {
        return "Conditional Option B2";
    }
}
