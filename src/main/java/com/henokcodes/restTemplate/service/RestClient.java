package com.henokcodes.restTemplate.service;


import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;


@Service
public class RestClient {

    private static final String GET_ALL_COUNTRIES = "https://restcountries.com/v3.1/name/peru";
    
    static RestTemplate restTemplate = new RestTemplate();

    public static ResponseEntity<String> getCountries(){
        
        HttpHeaders httpHeaders = new HttpHeaders();
    //    httpHeaders.setAccept(MediaType.APPLICATION_JSON);
       
       HttpEntity<String> entity = new HttpEntity<>("parameters", httpHeaders);
       
       ResponseEntity<String> result =restTemplate.exchange(GET_ALL_COUNTRIES, HttpMethod.GET, entity, String.class);
       System.out.println(result); 
       return result;
    }
}