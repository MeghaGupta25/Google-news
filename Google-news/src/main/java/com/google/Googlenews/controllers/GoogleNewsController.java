package com.google.Googlenews.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.Googlenews.models.Root;
import com.google.Googlenews.service.Service;


@RestController
@RequestMapping("/news")
public class GoogleNewsController {
	
	private Service service;
	
	@GetMapping
	@ResponseBody
	public Root getFoos(@RequestParam String title) {
		
		String url=Service.prepareUrl(title,"b79b0e97b59f48fabd223c474920399c");
		System.out.print(url);
		RestTemplate restTemplate= new RestTemplate();
		Root root=restTemplate.getForObject(url, Root.class);
	    return root;
	}
}
