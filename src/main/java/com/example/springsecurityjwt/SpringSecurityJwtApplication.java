package com.example.springsecurityjwt;

import com.example.springsecurityjwt.Model.AuthenticationRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityJwtApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
		AuthenticationRequest authenticationRequest = new AuthenticationRequest();
		authenticationRequest.setUsername("foo");
		authenticationRequest.setPassword("foo");
		System.out.println(new ObjectMapper().writeValueAsString(authenticationRequest));
	}

}
