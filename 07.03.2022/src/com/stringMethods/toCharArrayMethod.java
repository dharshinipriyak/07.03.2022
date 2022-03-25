package com.stringMethods;

public class toCharArrayMethod {

	public static void main(String[] args) {

		//toCharArray
		String Sentence="Java Fullstack development course";
		char characters[]=Sentence.toCharArray();
		for(char char1:characters)
		{
			System.out.println(char1);
		}
	}

}
