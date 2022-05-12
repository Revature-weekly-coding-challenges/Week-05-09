package com.revature.main;

// find the magic index, if it exists
public class MagicIndex {
	
	// doesn't work on on array with non-distinct values
	public static int findBinarySearch(int[] A) {
		int start = 0;
		int end = A.length;
		
		while (start < end) {
			int pos = start + (end - start) / 2;
			
			System.out.printf("%d, %d, %d\n", pos, start, end);
			
			if (A[pos] == pos) {
				return pos;
			} else if (A[pos] > pos) {
				end = pos;
			} else {
				start = pos + 1;
			}
		}
		
		return -1;
	}
	
	// works with any array, just slower than findBinarySearch
	public static int findLinearSearch(int[] A) {
		int i = 0;
		
		while (i < A.length) {
			if (i == A[i]) {
				return i;
			}
			
			i = Math.max(i, A[i]);
		}
		
		return -1;
	}
}
