package com.javaPrograms;

import java.util.Scanner;

public class OddPosition {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Odd position of arrays: ");
		for (int i=0; i<size; i = i+2)
		{
			System.out.println(arr[i]);
		}
	}
}
