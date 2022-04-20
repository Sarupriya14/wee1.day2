package week1.day2.assignments;

import week1.day2.MyCalculator;

public class MyCalculator {
	public static void main(String[] args) {
		
		
		Calculator obj = new Calculator();
		int addition = obj.addNum(2,3,3); //object for storing added num
		System.out.println(addition);
		
		int subtraction = obj.subNum(8,2); // object for storing subtracted num
		System.out.println(subtraction);
		
		double multiplication = obj.mulNum(6.1236,2.2345); //object for storing multiplied num
		System.out.println(multiplication);
		
		float division = obj.divide(6.234f, 2.789f); //object for storing divided num
		System.out.println(division);

	}


}
