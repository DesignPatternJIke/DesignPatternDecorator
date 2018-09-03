package com.week1.decorator;

public class CakeBase implements VillaCake {
	
	//Empty Constructor
	public CakeBase() {
		System.out.println("Preparing the cake base....");
		
	}

	@Override
	public double price() {
		// Return the price of the cake base.
		return 1.00;
	}
	

}
