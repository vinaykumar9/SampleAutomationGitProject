package com.load.testing.pages;

import java.util.Scanner;

public class HomePage {
	
	
	static int length;
	static char ch;
	
	public static char filterVowels(String str)
	{
		
		length = str.length();
		for(int i=0;i<length;i++)
		{
			ch =str.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
			{
				System.out.println("String after filtiering Vowels :"+ch);
			}
		}
		return ch;
	}
	
	
	public static char filterConsonants(String str)
	{
		length = str.length();
		for(int i=0;i<length;i++)
		{
			ch =str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("String after filtiering consonants :"+ch);
			}
		}
		return ch;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println("Enter the String:");
	Scanner obj = new Scanner(System.in);
	
   String str=obj.nextLine();
   
       filterVowels(str);
       filterConsonants(str);
       
	}
	
	


}
