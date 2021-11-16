package com.henokcodes.restTemplate.service;


import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class RestClient {

    private static final String GET_ALL_COUNTRIES = "https://restcountries.com/v3.1/name/peru";

    static RestTemplate restTemplate = new RestTemplate();

    public static void getCountries(){
        
        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setAccept(Array.asList(MediaType.APPLICATION_JSON));
       
       HttpEntity<String> entity = new HttpEntity<>("parameters", httpHeaders);
       
       ResponseEntity<String> result =restTemplate.exchange(GET_ALL_COUNTRIES, HttpMethod.GET, entity, String.class);
       System.out.println(result); 
    }
}