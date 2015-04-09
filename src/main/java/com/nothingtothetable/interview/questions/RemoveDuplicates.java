package com.nothingtothetable.interview.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {
	
	public static String removeDuplicates(final String input)
	{
		HashSet<Character> set = new HashSet<Character>();
		StringBuilder str = new StringBuilder();
		if(input==null||input.length()==0) return "";
		for(int i=0; i<input.length(); i++)
		{
			if(!set.contains(input.charAt(i)))
			{
				set.add(input.charAt(i));
				str.append(input.charAt(i)); // TODO change to string builder
			}
		}
		return str.toString(); 
	}
}
