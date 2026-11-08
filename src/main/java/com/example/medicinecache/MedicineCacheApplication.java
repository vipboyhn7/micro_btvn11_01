package com.example.medicinecache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MedicineCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicineCacheApplication.class, args);
    }
}
