package com.christianoette.localsettingsoverride;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LocalSettingsOverrideApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LocalSettingsOverrideApplication.class, args);
        SayHelloService bean = context.getBean(SayHelloService.class);
        bean.printWelcome();
    }

}
