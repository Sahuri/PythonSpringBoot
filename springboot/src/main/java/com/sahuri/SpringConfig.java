package com.sahuri;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.sahuri.service.CustomerService;
import com.sahuri.service.CustomerServiceImpl;

@Configuration
public class SpringConfig {
    @Bean
    CustomerService productService(){return new CustomerServiceImpl();
    }
}
