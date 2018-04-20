package com.nanara.springtest;

import com.nanara.springtest.FileUpload.StorageProperties;
import com.nanara.springtest.FileUpload.StorageService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling //  Schedule 작업에 필요
@EnableConfigurationProperties(StorageProperties.class)
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

    @Bean
    public CommandLineRunner fileControllerInit(StorageService storageService)
    {
        return(args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }
}
