package com.wipro.flowcontrol;

/*
 * Write a program to check if the program has received command line arguments or not.

If the program has not received arguments then print "No Values", else print all the 
values in a single line separated by ,(comma)

Example1) java Example
O/P: No values

Example2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore
 */

public class Example_3 {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("No Values");
		}
		else
		{
			for(String i:args)
			{
				System.out.print(i);
			}
		}

	}

}
