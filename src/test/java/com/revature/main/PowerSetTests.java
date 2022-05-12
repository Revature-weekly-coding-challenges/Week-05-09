package com.revature.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.revature.main.PowerSet.powerSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PowerSetTests {
	
	private List<Integer> A;
	
	@BeforeEach
	public void setup() {
		A = new ArrayList<>();
	}
	
	@Test
	public void testEmpty() {
		Set<List<Integer>> expected = new HashSet<>();
		expected.add(A);
		
		assertEquals(expected, powerSet(A));
	}
	
	@Test
	public void testOne() {
		A.add(1);
		
		List<Integer> sub1 = new ArrayList<>();
		
		Set<List<Integer>> expected = new HashSet<>();
		expected.add(A);
		expected.add(sub1);
		
		Set<List<Integer>> actual = powerSet(A);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTwo() {
		A.add(1);
		A.add(2);
		
		List<Integer> sub1 = A.subList(0, 1);
		List<Integer> sub2 = A.subList(1, 2);
		List<Integer> sub3 = new ArrayList<>();
		
		Set<List<Integer>> expected = new HashSet<>();
		expected.add(A);
		expected.add(sub1);
		expected.add(sub2);
		expected.add(sub3);
		
		Set<List<Integer>> actual = powerSet(A);
		
		assertEquals(expected, actual);
	}
}
