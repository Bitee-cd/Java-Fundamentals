package com.itbulls.operations;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name: ");
		String name = sc.nextLine();
		System.out.println("Your name is "+ name);
		String[] length = name.split("\\s");
		
		System.out.print("How old are you : ");
		int i= sc.nextInt();
		System.out.println("you are : "+ i +" years old");	
		
		
	}

}
