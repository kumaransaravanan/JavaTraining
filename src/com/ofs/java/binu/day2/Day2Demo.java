package com.ofs.java.binu.day2;

import com.ofs.java.binu.day2.inheritance.MathDemo;
import com.ofs.java.binu.day2.inheritance.MathDemo1;

/**
 * 
 * @author vinitha.r
 *
 */
public class Day2Demo {

	public static void main(String args[]) {

		MethodDemo methodDemo = new MethodDemo();
		
		// call method one;
		methodDemo.add(5, 6);
		// call method two and print the return value;
		System.out.println(methodDemo.addReturns(10, 20));
	
		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		
		// call lhs and rhs and compare the value;
		System.out.println("value a = 2 value b = 3 formula:ac + bc = c(a + b)");
		System.out.println("LFH is "+methodOverLoadDemo.calculateLHS(2, 3));//calling calculateLHS function with two values
		System.out.println("RHS is "+methodOverLoadDemo.calculateRHS(2, 3));//calling calculateRHS function with two values
		
		if (methodOverLoadDemo.calculateLHS(2, 3) == methodOverLoadDemo.calculateRHS(2, 3)) {
			System.out.println("Values Matching");
		}
		
		System.out.println("value a = 2 value b = 3 value c = 4 formul a : a3 + b3 = (a + b)(a2 - ab + b2)");
		System.out.println("LFH is "+ methodOverLoadDemo.calculateLHS(2, 3, 4));//calling calculateLHS function with three values
		System.out.println("RFH is "+ methodOverLoadDemo.calculateRHS(2, 3, 4));//calling calculateRHS function with three values
		if (methodOverLoadDemo.calculateLHS(2,3,4) == methodOverLoadDemo.calculateRHS(2,3,4)) {
			System.out.println("Values Matching");
		}

		MathDemo mathDemo = new MathDemo();
		MathDemo.demoNumberCheck();
		MathDemo.demoNumberCheck();
		mathDemo.add(0, 0);
		
		// call methods and print the result
		MathDemo1 mathDemo1 = new MathDemo1();
		mathDemo1.add(0, 0);
		System.out.println("value 1 is 6 value 2 is 5");
		System.out.println("Sum is "+mathDemo1.add(6,5));
		System.out.println("Sub is "+mathDemo1.sub(6,5));
		System.out.println("Mul is "+mathDemo1.mul(6,5));
		System.out.println("Div is "+mathDemo1.div(6,5));
		mathDemo1.sub1(2,3);
		
		// call methods and print the result;
		MathDemo mathDemo2 = new MathDemo();
		mathDemo2.add(0, 0);
		System.out.println("value 1 is 10 value 2 is 5");
		System.out.println("Sum is "+mathDemo2.add(10,5));
		System.out.println("Sub is "+mathDemo1.sub(10,5));
		System.out.println("Mul is "+mathDemo1.mul(10,5));
		System.out.println("Div is "+mathDemo1.div(10,5));

	}
}
