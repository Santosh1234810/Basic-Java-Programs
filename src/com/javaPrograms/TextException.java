package com.javaPrograms;

import java.util.Scanner;

public class TextException {
	public static void checked(int num) {
		if (num > 0) {
			System.out.println("Number is positive");
		}
		else {
			try {
				throw new ArithmeticException("Negative number exception");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		checked(num);
	}
}
