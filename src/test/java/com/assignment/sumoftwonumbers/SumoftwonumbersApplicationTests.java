package com.assignment.sumoftwonumbers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.* ;

@SpringBootTest
class SumoftwonumbersApplicationTests {
	@Autowired
	SumoftwonumbersApplication _appInstance;

	@Test
	void contextLoads() {
		assertEquals(220L, _appInstance.sumOfTwoNumbers(200, 20));
	}

}
