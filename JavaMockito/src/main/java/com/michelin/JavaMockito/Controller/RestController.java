package com.michelin.JavaMockito.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.michelin.JavaMockito.Entity.LearnerEntity;
import com.michelin.JavaMockito.Repository.LearnerRepository;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	LearnerRepository learnerrepository;
	
	@GetMapping(path="/data")
	public Optional<LearnerEntity> getdata() {
		return learnerrepository.findById(10001);
	}
	
}
