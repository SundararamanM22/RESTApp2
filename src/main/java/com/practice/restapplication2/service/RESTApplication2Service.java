package com.practice.restapplication2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RESTApplication2Service {
	@Autowired
	RestTemplate rt;
	
	public String status() {
		String url = "http://3.25.187.251/display";
		ResponseEntity<String> response = rt.exchange(url, HttpMethod.GET, null, String.class);
		String status = response.getBody();		
		return status;
	}
}
