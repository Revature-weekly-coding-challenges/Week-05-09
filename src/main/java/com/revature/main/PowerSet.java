package com.revature.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {
	
	// calls a helper function for powerSet
	public static <E> Set<List<E>> powerSet(List<E> A) {
		Set<List<E>> results = new HashSet<>();
		
		powerSet(results, A);
		
		return results;
	}
	
	// finds the power set of a list recursively
	public static <E> void powerSet(Set<List<E>> results, List<E> A) {
		if (A.size() == 0) {
			results.add(new ArrayList<E>());
			return;
		}
		
		if (!results.add(A) || A.size() == 1) {
			results.add(new ArrayList<E>());
			return;
		}
		
		for (int i = 0; i < A.size(); i++) {
			List<E> temp = new ArrayList<>();
			
			for (int j = 0; j < A.size(); j++) {
				if (j == i) continue;
				
				temp.add(A.get(j));
			}
			
			powerSet(results, temp);
		}
	}
}
