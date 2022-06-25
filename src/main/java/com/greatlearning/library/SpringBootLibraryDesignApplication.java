package com.greatlearning.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.library.model.GreatLearning;

@SpringBootApplication
public class SpringBootLibraryDesignApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		System.out.println("Hello");
		
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * GreatLearning greatLearning = new GreatLearning();
		 * greatLearning.setCourseName("Designing Microservices with Spring Boot");
		 * greatLearning.setCourseType("Information Technology");
		 * greatLearning.setInstructorName("Vishakha Suryawanshi");
		 * System.out.println("Great Learning object:----"+greatLearning);
		 * //System.out.println("Get method for coursename "+greatLearning.getCourseName
		 * ());
		 */		
		
		GreatLearning greatLearning = new GreatLearning("Designing Microservices with Spring Boot","Information Technology",
				"Vishakha Suryawanshi");
		System.out.println("Great Learning:----"+greatLearning);
	}

}
