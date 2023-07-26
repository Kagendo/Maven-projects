package com.amigoscode;

import com.amigoscode.entity.Customer;
import com.amigoscode.repository.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String [] args){
        SpringApplication.run(Main.class, args);
    }



}
