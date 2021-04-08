package com.cportal.interview;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] arg) {
		String str, rev="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		str= sc.nextLine();
		
		int length=str.length();
		if(str.length()==0 || str.length()==1) {
			System.out.println("Given String i sPalindrome");
		}else
		{
			for(int i=length-1;i>=0;i--) {
				rev= rev+str.charAt(i);	
			}
		}
		if(str.equals(rev)) {
			System.out.println(str + " Given String is Palindrome");
		}else
		{
			System.out.println(str + " given String is not Palindrome");
		}
		
		
		
	}
	
	
}
