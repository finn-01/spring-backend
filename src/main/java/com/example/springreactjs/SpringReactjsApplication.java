package com.example.springreactjs;

import com.example.springreactjs.model.User;
import com.example.springreactjs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringReactjsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringReactjsApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Ramesh", "Nguyen", "nguyensam576@gmail.com"));
        this.userRepository.save(new User("Sam", "Nguyen", "nguyensam577@gmail.com"));
        this.userRepository.save(new User("Sam", "Finn", "nguyensamfinn@gmail.com"));
    }
}
