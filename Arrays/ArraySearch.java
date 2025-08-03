package com.mustafa.july22.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter the "+i+"position element");
			arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("enter the element for search: ");
		int select=sc.nextInt();
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			
			if(select==arr[i]) {
				System.out.println("element fount at "+i+" index");
				found=true;
			}
			
			
		}

        if (!found) {
            System.err.println("Element not found.");
        }

		
		
		

	}

}
