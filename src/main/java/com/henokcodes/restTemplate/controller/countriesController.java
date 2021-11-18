package com.henokcodes.restTemplate.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.henokcodes.restTemplate.service.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping(path = "/countries")
public class countriesController {

    @Autowired
    private RestClient restClient;
   
    @GetMapping("/all")
    public ResponseEntity<String> countries(){
        return this.restClient.getCountries();
    }
}