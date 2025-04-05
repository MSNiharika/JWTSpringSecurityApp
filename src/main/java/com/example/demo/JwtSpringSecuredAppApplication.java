package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.example.demo.entity.UserEntity;

import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class JwtSpringSecuredAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtSpringSecuredAppApplication.class, args);
	}
	

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner init(UserRepository repo, PasswordEncoder encoder) {
        return args -> {
            if (repo.findByUsername("john").isEmpty()) {
                UserEntity user = new UserEntity();
                user.setUsername("john");
                user.setPassword(encoder.encode("ThisIsA512BitSuperSecretKeyWith64Characters1234567890123456!"));
                user.setRole("USER");
                repo.save(user);
            }
        };
    }

}
