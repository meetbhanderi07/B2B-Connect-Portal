package com.grownited;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class B2BPortal1Application {

	public static void main(String[] args) {
		SpringApplication.run(B2BPortal1Application.class, args);
	}

	@Bean    //use this annotation for making singleton class.(now we can use autowired in controller for this method)
	PasswordEncoder encoder() {
		return new BCryptPasswordEncoder(5);
	}
}
