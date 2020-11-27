package com.michelin.JavaMockito.Service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.michelin.JavaMockito.Entity.LearnerEntity;
import com.michelin.JavaMockito.Repository.LearnerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class LearnerServiceTest {

	@Mock
	LearnerRepository learnerRepositoryMock;
	
	@InjectMocks
	LeanerService leanerService;
	
	
	@Test
	public void getDataTest() {
		
		when(learnerRepositoryMock.findById(10001)).thenReturn(Optional.of(new LearnerEntity(10001,"Shravani","A123456")));
		
	String resilt=leanerService.findData(10001);
	System.out.println("value of result"+resilt);
	
	assertEquals("Vivek", resilt);
		
	}

}
