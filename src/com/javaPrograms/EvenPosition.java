package com.javaPrograms;

import java.util.Scanner;

public class EvenPosition {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements: ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Even position of an array: ");
		for (int i=1; i<size; i=i+2)
		{
			System.out.println(arr[i]);
		}
	}
}
