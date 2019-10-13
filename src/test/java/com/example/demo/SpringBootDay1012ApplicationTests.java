package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDay1012ApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	public void contextLoads() {
		logger.trace("this is trace ...................");
		logger.debug("this is debug ...................");
		logger.info("this is info ...................");
		logger.warn("this is warn ...................");
		logger.error("this is error ...................");
		
	}
	
	
	/*@Autowired
	Person Person;
	
	@Test
	public void contextLoads() {
		System.out.println(Person);
	}*/

}
