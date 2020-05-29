package com.assignment.question1;

@FunctionalInterface
interface Converter<F,T> 
{
	 T convert(F from);
}
