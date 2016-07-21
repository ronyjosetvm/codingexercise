package com.codingexercise;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.codingexercise.controller.MessageController;
import com.codingexercise.model.Greeting;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ExerciseApplication.class)
@WebIntegrationTest
public class ExerciseApplicationTests {	
	@Autowired
	MessageController messageController;	
	
	@Test
	public void controller_return_world() {	
		Greeting greeting = messageController.greeting();		
		Assert.assertEquals("world", greeting.getHello());
	}
	
	
}
