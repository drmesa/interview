package com.nothingtothetable.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesAnswer {
	
	public static String removeDuplicates(final String input)
	{
		String outputString = "";
		Map<Character, Integer> duplicates = new HashMap<Character, Integer>();
		
		for(char c : input.toCharArray())
		{
			if(duplicates.get(c) == null)
			{
				outputString += c;
				duplicates.put(c, 1);
			}
			else
			{
				
				duplicates.put(c, duplicates.get(c) + 1);
			}
		}
		
		return outputString;
	}
}
