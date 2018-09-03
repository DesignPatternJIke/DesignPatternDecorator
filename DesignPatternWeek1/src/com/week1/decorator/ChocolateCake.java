package com.week1.decorator;

public class ChocolateCake extends VillaCakeDecorator{

	
	public ChocolateCake(VillaCake villaCake) {
		
		super(villaCake);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.week1.decorator.VillaCakeDecorator#price()
	 */
	
	@Override
	public double price() {

		// Returns the price for Chocolate cake + Cake base price 
		return 1.50;
	}
	
	

}
