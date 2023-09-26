package com.javaPrograms;

import java.util.Scanner;

public class LargestNumber {
	public void largest(int arr[])
	{
		int max = arr[0];
		
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] > max) 
			{
				max = arr[i];
			}
		}
		System.out.println("Largest Number is: "+max);
	}
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
		
		LargestNumber ln = new LargestNumber();
		ln.largest(arr);
	}
}
