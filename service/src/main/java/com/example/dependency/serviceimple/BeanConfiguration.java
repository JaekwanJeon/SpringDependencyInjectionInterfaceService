package com.example.dependency.serviceimple;

import com.example.dependency.ISampleService;
import com.example.dependency.serviceimple.SampleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    ISampleService sampleService () {
        return new SampleService();
    }
}
