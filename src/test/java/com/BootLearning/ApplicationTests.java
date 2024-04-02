package com.BootLearning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	public static Logger logger  = LoggerFactory.getLogger(ApplicationTests.class); 
	
	@Test
	void contextLoads() {
		logger.info("Inside test case...");
		logger.info("Krishna's application test *****\n Test again ");
		assertEquals(true, true);
	}
}
