package com.example.biteflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BiteFlowApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiteFlowApplication.class, args);
    }

}
