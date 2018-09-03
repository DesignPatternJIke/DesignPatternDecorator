package com.week1.decorator;

public class CoffeeCake extends VillaCakeDecorator {

	public CoffeeCake(VillaCake villaCake) {
		super(villaCake);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.week1.decorator.VillaCakeDecorator#price()
	 */
	@Override
	public double price() {
		// Returns the price for Coffee cake + Cake base price 
		return 1.80; 
	}
	
	

}
