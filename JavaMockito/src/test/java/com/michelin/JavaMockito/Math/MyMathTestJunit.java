package com.michelin.JavaMockito.Math;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MyMathTestJunit {

	
	//MyMath myMath=new MyMath();
	
	@Autowired
	MyMath myMath;
	
	@Test
	public void test() {
		
	}

@Test
	public void mutiplyTest() {
		assertEquals(myMath.multiply(), 9);
	}
	
}
