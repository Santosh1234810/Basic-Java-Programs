package com.javaPrograms;

import java.util.Scanner;

public class UpperTrinagleMatrix {
	Scanner sc = new Scanner(System.in);
	int row, cols;
	int sum = 0;
	
	int [][] input(){
		System.out.println("Enter the number of rows: ");
		row = sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		cols = sc.nextInt();
		
		int arr[][] = new int[row][cols];
		return arr;
	}
	
	int [][] elements(int arr[][]) {
		
		System.out.println("Enter the elememnts in matrix: ");
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	
	public void display(int arr[][])
	{
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
	public void upper(int arr[][])
	{
		System.out.println("Upper Triangular Matrix: ");
		for (int i=0; i<row; i++)
		{
			for (int j=0; j<cols; j++)
			{
				if (i < j)
				{
					System.out.println("0 ");
				}
				else {
					System.out.print(arr[i][j] +" ");
				}
			}
			System.out.println();
		}
		System.out.println("================================================================");
	}
	public void addition(int arr[][])
	{
		for (int i=0; i<row; i++)
		{
			for (int j=0; j<cols; j++)
			{
				if (i < j)
				{
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println("Sum of Triangular matrix is: "+sum);
	}
	
	public static void main(String[] args) {
		UpperTrinagleMatrix utm = new UpperTrinagleMatrix();
		int inp[][] = utm.input();
		utm.elements(inp);
		utm.display(inp);
		utm.upper(inp);
		utm.addition(inp);
	}
}
