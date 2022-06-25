package com.greatlearning.library.serviceImpl;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.service.ExampleService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ExampleServiceImpl implements ExampleService {
	public GreatLearning get() {
		log.info("Inside get() method");

		GreatLearning greatLearning = new GreatLearning();
		
		  greatLearning.setCourseName("Learn Controllers in spring boot");
		  greatLearning.setCourseType("Information Technology");
		  greatLearning.setInstructorName("Vishakha Suryawanshi");
		 
		return greatLearning;

	}
	@PostMapping("/customInfo")
	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
		log.info("Inside custominfo() method");
		
		  GreatLearning greatLearning = new GreatLearning();
		  greatLearning.setCourseName(courseName);
		  greatLearning.setCourseType(courseType);
		  greatLearning.setInstructorName(instructorName);
		 
		return greatLearning;
	}

}
