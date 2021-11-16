package com.henokcodes.restTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.henokcodes.restTemplate.service.RestClient;


@SpringBootApplication
public class RestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateApplication.class, args);
		RestClient rc = new RestClient();
		rc.getCountries();
	}

}
