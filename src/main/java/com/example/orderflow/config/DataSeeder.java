package com.example.orderflow.config;

import com.example.orderflow.model.Store;
import com.example.orderflow.repository.StoreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
class DataSeeder {
    @Bean
    CommandLineRunner initDB(StoreRepository storeRepository) {
        return args -> {
            if(storeRepository.count()==0){
                System.out.println("Seeding initial data...");
                Store store = Store.builder()
                        .address("123 Main St, City")
                        .openHour(LocalDateTime.now().withHour(8).withMinute(0))
                        .closeHour(LocalDateTime.now().withHour(22).withMinute(0))
                        .build();
                storeRepository.save(store);
            }
            else{
                System.out.println("Database already contains data, skipping seed.");
            }
        };

    }
}
