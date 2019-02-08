package org.first;

public class Restaurant {
	HotDrink hotDrink;
	Restaurant(HotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}
	public void prepareHotDrink() {
		hotDrink.prepareHotDrink();
	}
}
