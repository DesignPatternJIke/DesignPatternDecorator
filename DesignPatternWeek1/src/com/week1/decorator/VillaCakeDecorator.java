package com.week1.decorator;

public class VillaCakeDecorator implements VillaCake {
	
	// Private instance variable
	 private VillaCake villaCake;

	    public VillaCakeDecorator(VillaCake villaCake) {
	    	//Initialize the instance variable
	        this.villaCake = villaCake;
	    }

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return this.villaCake.price();
	}

}
