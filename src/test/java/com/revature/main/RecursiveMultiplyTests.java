package com.revature.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.revature.main.RecursiveMultiply.multiply;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RecursiveMultiplyTests {
	@Test
	public void testZeroA() {
		int a = 0;
		int b = 7;
		
		assertEquals(0, multiply(a, b));
	}
	
	@Test
	public void testZeroB() {
		int a = 7;
		int b = 0;
		
		assertEquals(0, multiply(a, b));
	}
	
	@Test
	public void testSmall() {
		int a = 3;
		int b = 7;
		
		assertEquals(21, multiply(a, b));
	}
	
	@Test
	public void testPow2() {
		int a = 6;
		int b = 8;
		
		assertEquals(48, multiply(a, b));
	}
	
	@Test
	public void testLarge() {
		int a = 1045;
		int b = 854;
		
		assertEquals(892430, multiply(a, b));
	}
}
