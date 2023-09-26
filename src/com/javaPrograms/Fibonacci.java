package com.javaPrograms;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		int num, a=1, b=2,c=1;
		
		System.out.println("Enter the number of times: ");
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		System.out.println("Fibonacii Series of number is: ");
		for (int i=0; i<num; i++)
		{
			a = b;
			b = c;
			c = a + b;
			System.out.print(a +" ");
		}
	}
}
