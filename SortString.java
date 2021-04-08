package com.cportal.interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SortString {
	public static void main(String arg[]) {
		String[] names= {"arthi","mani","sai","nitin"};
		int size = names.length;
		
		for(int i=0; i<=size-1;i++) {
			for (int j=1+i;j<size;j++) {
				if(names[i].compareTo(names[j])<0) {
					String temp = names[i];
					names[i]=names[j];
					names[j]=temp;
					
				}
				
			}
		}
		System.out.println(Arrays.toString(names));
		
		
	}

}
