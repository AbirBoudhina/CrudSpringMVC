package com.training.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.persistance.model.Employe;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe c=new Employe();
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationcontext.xml");
		IEmployeService clientservice=beanFactory.getBean(IEmployeService.class);
		c.setId(66611);
		c.setName("Abir");
		c.setTel("93999");
		c.setAdress("Ariana");
		clientservice.add(c);
	}

}
