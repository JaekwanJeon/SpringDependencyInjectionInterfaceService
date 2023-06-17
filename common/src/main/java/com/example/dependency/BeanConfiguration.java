package com.example.dependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    ISampleService sampleService () {
        return new SampleService();
    }
}
