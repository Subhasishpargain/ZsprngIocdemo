package com.gl.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.ioc.model.Car;

public class IOCTest {
public static void main(String[] args) {
	/*
	 * Resource resource = new ClassPathResource("com/gl/ioc/resource/spring.xml");
	 *BeanFactory factory = new XmlBeanFactory(resource);
	 *Student theStudent =  (Student) factory.getBean("student");theStudent.show();
	 */
    ApplicationContext context = new ClassPathXmlApplicationContext("com/gl/ioc/resource/spring.xml");		
    Car c = context.getBean(Car.class);
    System.out.println(c);
}
}
