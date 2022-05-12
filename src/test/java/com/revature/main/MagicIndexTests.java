package com.revature.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.revature.main.MagicIndex.findBinarySearch;
import static com.revature.main.MagicIndex.findLinearSearch;

@SpringBootTest
public class MagicIndexTests {
	@Test
	public void testEmpty() {
		int[] A = {};
		
		assertEquals(-1, findBinarySearch(A));
	}
	
	@Test
	public void testOneFail() {
		int[] A = {1};
		
		assertEquals(-1, findBinarySearch(A));
	}
	
	@Test
	public void testOneSuccess() {
		int[] A = {0};
		
		assertEquals(0, findBinarySearch(A));
	}
	
	@Test
	public void testSmallFail() {
		int[] A = {1, 2, 3, 4, 5};
		
		assertEquals(-1, findBinarySearch(A));
	}
	
	@Test
	public void testSmallSuccess() {
		int[] A = {0, 1, 4, 5, 6};
		
		assertEquals(1, findBinarySearch(A));
	}
	
	@Test
	public void testLargeFail() {
		int[] A = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		assertEquals(-1, findBinarySearch(A));
	}
	
	@Test
	public void testLargeSuccess() {
		int[] A = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21};
		
		assertEquals(21, findBinarySearch(A));
	}
	
	@Test
	public void duplicatesSucess() {
		int[] A = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		assertEquals(1, findLinearSearch(A));
	}
}
