package com.example.customer_service;

import com.example.customer_service.entities.Customer;
import com.example.customer_service.repository.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    @Bean
CommandLineRunner start(CustomerRepo customerRepo)
    {
        return args ->{
            customerRepo.save(new Customer(null,"nouhaila","nouhaila@gmail.com"));
            customerRepo.save(new Customer(null,"hajar","hajar@gmail.com"));
            customerRepo.save(new Customer(null,"simo","simo@gmail.com"));
            customerRepo.findAll().forEach(c->{
                System.out.println(c.toString());
            });
        };
    }
}
