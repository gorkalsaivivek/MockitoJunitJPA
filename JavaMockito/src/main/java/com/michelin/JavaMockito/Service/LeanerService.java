package com.michelin.JavaMockito.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michelin.JavaMockito.Repository.LearnerRepository;

@Service
public class LeanerService {

	@Autowired
	LearnerRepository learnerRepository;
	
	public String findData(int id) {
		 String result= learnerRepository.findById(id).get().getName();
		 return result;
	}
	
}
