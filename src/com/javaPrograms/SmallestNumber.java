package com.javaPrograms;

import java.util.Scanner;

public class SmallestNumber {
	
	void smallest(int arr[], int n)
	{
		int min = arr[0];
		
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Smallest number is: "+min);
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
		
		SmallestNumber sn = new SmallestNumber();
		sn.smallest(arr, 0);
	}
}
