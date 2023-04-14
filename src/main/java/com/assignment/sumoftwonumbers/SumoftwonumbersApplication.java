package com.assignment.sumoftwonumbers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumoftwonumbersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SumoftwonumbersApplication.class, args);
	}

	public Long sumOfTwoNumbers(int num1_p, int num2_p) {
		return Long.valueOf(num1_p + num2_p);
	}
}
