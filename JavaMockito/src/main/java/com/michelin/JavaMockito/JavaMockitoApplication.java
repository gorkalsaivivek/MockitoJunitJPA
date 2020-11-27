package com.michelin.JavaMockito;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.michelin.JavaMockito.Repository.LearnerRepository;

@SpringBootApplication
public class JavaMockitoApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	LearnerRepository learnerRepository;

	public static void main(String[] args) {
		SpringApplication.run(JavaMockitoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("All users -> {}", learnerRepository.findById(10001));
		logger.info("All users -> {}", learnerRepository.findAll());
		System.out.println(learnerRepository.findById(10001));
		
	}

}
