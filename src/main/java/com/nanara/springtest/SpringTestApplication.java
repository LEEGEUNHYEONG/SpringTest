package com.nanara.springtest;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringTestApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringTestApplication.class, args);
    }

    @Bean
    public ApplicationRunner run()
    {
        return args -> System.out.println("Application Runner");
    }
}
