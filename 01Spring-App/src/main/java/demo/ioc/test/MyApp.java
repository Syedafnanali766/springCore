package demo.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.ioc.beans.DieselEngine;

public class MyApp {

	public static void main(String[] args) {
      ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
      
      DieselEngine dEngine=context.getBean(DieselEngine.class);
      dEngine.start();
	}

}
