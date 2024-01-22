package com.example.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com"}) // export-util ve exception-library kütüphanelerindeki component'lerin initialize edilmesi için gerekli
public class SamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamplesApplication.class, args);
    }

}
