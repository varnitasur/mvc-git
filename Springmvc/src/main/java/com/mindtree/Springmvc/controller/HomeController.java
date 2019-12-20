package com.mindtree.Springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String getLink() {
		return "index";
	}
	
	@GetMapping("/post")
	public String PostGet() {
		
		return "post";
	}
	

	@PostMapping("/add")
	public String PostGet(@RequestParam String name) {
		System.out.println(name);
		return "index";
	}

}
