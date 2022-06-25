package com.greatlearning.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.serviceImpl.ExampleServiceImpl;

//@Controller
@RestController
public class ExampleController {
	@Autowired
	ExampleServiceImpl exampleService;

	@GetMapping("/info")
	// @ResponseBody
	public GreatLearning get() {
		
		return exampleService.get();
	}

	@PostMapping("/customInfo")
	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
		 
		return exampleService.customInfo(courseName, courseType, instructorName);
	}

}
