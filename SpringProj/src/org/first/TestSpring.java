package org.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
public static void main( String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
	//ApplicationContext context = new ClassPathXmlApplicationContext("testConfig.xml");
	Organization objRest = (Organization) context.getBean("helloBean");
	objRest.prepareHotDrink();
}
}
