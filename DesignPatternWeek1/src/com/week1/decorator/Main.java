package com.week1.decorator;

import com.week1.decorator.VillaCake;
import com.week1.decorator.StrawberryCake;
import com.week1.decorator.CoffeeCake;
import com.week1.decorator.CakeBase;



/**
 * @author Justice Ike
 * Object Oriented Design Pattern Course
 * Week 1: Decorator Pattern
 * References: 
 * JAVA:
 *	https://www.udemy.com/design-patterns-in-java-concepts-hands-on-projects/learn/v4/t/lecture/9587884?start=0
 *	https://www.udemy.com/java-design-patterns-the-complete-masterclass/learn/v4/t/lecture/8749924?start=0
 *	C++:
 *	https://www.udemy.com/patterns-cplusplus/learn/v4/t/lecture/7926714?start=0 
 */
public class Main {

	public static void main(String[] args) {

		//
		VillaCake cakeBase = new CakeBase();
		System.out.println("\nThe price for cake base is :  $" + cakeBase.price());

		// Add Strawberry to the order
		VillaCake strawberry = new StrawberryCake(cakeBase);
		System.out.println("\nExtra strawberry fruit price is: $" + strawberry.price()
				+ ". Strawberry fruit + cake base is: $" + (strawberry.price() + cakeBase.price()));

		// Add Chocolate to the order
		VillaCake chocolate = new ChocolateCake(cakeBase);
		System.out.println("\nExtra chocolate flavor price is: $" + chocolate.price()
				+ ". Chocolate flavor + cake base is: $" + (chocolate.price() + cakeBase.price()));

		// Add Coffee to the order
		VillaCake coffee = new CoffeeCake(cakeBase);
		System.out.println("\nExtra coffee flavor price is: $" + coffee.price() + ". Coffee flavor + cake base is: $"
				+ (coffee.price() + cakeBase.price()));

		System.out
				.println(
						"\nTotal price is : $"
								+ (double) ((strawberry.price() + cakeBase.price())
										+ (chocolate.price() + cakeBase.price()) + (coffee.price() + cakeBase.price()))
								+ " , When you are ready....");

	}
}
