package in.ashokit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.UserService;

public class MyApp {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring-beans.xml");
	    
		 UserService userService = ctxt.getBean(UserService.class);
	
	    userService.saveUser("ashok","ashok@123",123456l);
	}
}
