# Demo project to test spring application.yml features

When the application starts it prints out some properties. Based on the profile config, you have a different result.
See https://docs.spring.io/spring-boot/docs/2.7.x/reference/htmlsingle/ for more information

There are three levels of configuration
- Main default config: config/application.yml
  - Profile specific config: config/application-prod.yml
    - Additional local override:  config/override/additional-custom.yml



## How to start the application

Run LocalSettingsOverrideApplication with one of the following VM options 
and you receive a different output after the start. 

1. -Dspring.profiles.active=prod
```
Hello Default configuration / Active Profiles: prod
``` 
 
2. -Dspring.profiles.active=local
```
Hello Local Configuration / Active Profiles: local
```

3. -Dspring.profiles.active=prod -Dspring.config.additional-location=classpath:config/override/additional-custom.yml
```
Hello Custom configuration / Active Profiles: prod
```
4. -Dspring.profiles.active=local -Dspring.config.additional-location=classpath:config/override/additional-custom.yml
```
Hello Custom configuration / Active Profiles: local
```
