package com.week1.decorator;

public class StrawberryCake extends VillaCakeDecorator {

	public StrawberryCake(VillaCake villaCake) {
		super(villaCake);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.week1.decorator.VillaCakeDecorator#price()
	 */
	@Override
	public double price() {
		//System.out.println("\nThe price is for strawberry  flavour");
		// Returns the price for Strawberry cake + Cake base price 
		return 2.00; 
	}
	
	

}
