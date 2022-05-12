package com.revature.main;

// multiplies two numbers together using recursion
public class RecursiveMultiply {
	public static int multiply(int a, int b) {
		if (b == 0 || a == 0) {
			return 0;
		}
		
		int result = (b & 0x1) == 1 ? a: 0;
		
		return result + 2 * multiply(a, b >> 1);
	}
}
