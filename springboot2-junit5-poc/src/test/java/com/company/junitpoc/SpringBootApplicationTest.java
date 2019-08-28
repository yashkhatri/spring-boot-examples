package com.company.junitpoc;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SpringBootApplicationTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	@DisplayName("Testing Message REST API ")
	void testGreeting() {
		String greeting = this.restTemplate.getForObject("/greeting/Yash", String.class);
		assertEquals("Hello Yash", greeting);
	}


}