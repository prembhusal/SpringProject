package org.first;

public class Organization {
	HotItem hotItem;
	/*//constructor method
	Organization(HotItem hotDrink) {
		this.hotItem = hotDrink;
	}*/
	
	//setter method
	public  void setHotItem(HotItem hotDrink) {
		this.hotItem = hotDrink;
	}
	public void prepareHotDrink() {
		hotItem.prepareHotDrink();
	}
}
