package com.practice.restapplication2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.restapplication2.service.RESTApplication2Service;

@RestController
public class RESTApplication2Controller {
	@Autowired
	RESTApplication2Service rSer;
	
	@GetMapping(value = "/RESTApplication/status")
	public String status() {
		return rSer.status();
	}
	
	@GetMapping(value = "/display")
	public String display() {
		return "REST Application 2 is running from REST Application 1";
	}
}
