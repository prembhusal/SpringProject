package org.first;

public class Organization {
	HotItem hotItem;
	Organization(HotItem hotDrink) {
		this.hotItem = hotDrink;
	}
	public void prepareHotDrink() {
		hotItem.prepareHotDrink();
	}
}
