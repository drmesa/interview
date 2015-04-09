package com.nothingtothetable.interview.executable;

import java.math.BigDecimal;

import com.nothingtothetable.interview.questions.RemoveDuplicates;
import com.nothingtothetable.interview.questions.RemoveDuplicatesAnswer;

public class Interview1 {

	public static void main(String[] args) {
		System.out.println("Your removeDuplicates");
		System.out.println(RemoveDuplicates.removeDuplicates("AABBCCDDAACCDDAB"));
		System.out.println(RemoveDuplicates.removeDuplicates(""));
		System.out.println(RemoveDuplicates.removeDuplicates("1234512312312312345"));
		System.out.println(RemoveDuplicates.removeDuplicates("a1B2A3"));
		System.out.println(RemoveDuplicates.removeDuplicates("está duplicado?"));
		System.out.println(RemoveDuplicates.removeDuplicates("$¥¥¥¥¥¥¥¥¥$$$$$$€€€€€₤₤₤₤₤"));
		System.out.println(RemoveDuplicates.removeDuplicates(null));
		
		System.out.println("\nMy removeDuplicates");
		System.out.println(RemoveDuplicatesAnswer.removeDuplicates("AABBCCDDAACCDDAB"));
		System.out.println(RemoveDuplicatesAnswer.removeDuplicates(""));
		System.out.println(RemoveDuplicatesAnswer.removeDuplicates("1234512312312312345"));
		System.out.println(RemoveDuplicatesAnswer.removeDuplicates("a1B2A3"));
		System.out.println(RemoveDuplicatesAnswer.removeDuplicates("está duplicado?"));
		System.out.println(RemoveDuplicatesAnswer.removeDuplicates("$¥¥¥¥¥¥¥¥¥$$$$$$€€€€€₤₤₤₤₤"));
		System.out.println(RemoveDuplicatesAnswer.removeDuplicates(null));
		
	}

}
