package com.nothingtothetable.interview.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicatesAnswer
{

	public static String removeDuplicates(final String input)
	{
		if(input == null || input.length() == 0)
		{
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> duplicates = new HashMap<Character, Integer>();

		for (char c : input.toCharArray())
		{
			if (duplicates.get(c) == null)
			{
				sb.append(c);
				duplicates.put(c, 1);
			} else
			{

				duplicates.put(c, duplicates.get(c) + 1);
			}
		}

		return sb.toString();
	}

}
