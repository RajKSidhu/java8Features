package com.assignment.question1;

public class EffectiveFinalFeature {

	public static void main(String[] args) {
		
		// variable num does not have to be declared final. We can read final local variables from the outer scope of lambda expressions
		int num = 1;
		Converter<Integer, String> stringConverter =
		        (from) -> String.valueOf(from + num);

		System.out.println(stringConverter.convert(2));
		System.out.println(num);

	}

}
