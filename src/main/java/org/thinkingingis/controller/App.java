package org.thinkingingis.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.thinkingingis.dao.JdbcTemplateCustomerDAO;
import org.thinkingingis.model.Customer;

public class App {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		JdbcTemplateCustomerDAO jdbcTemplateCustomerDao = (JdbcTemplateCustomerDAO) context.getBean("jdbcTemplateCustomerDAO");
//		Customer customer = new Customer(2, "Maps", 26);
//		jdbcTemplateCustomerDao.insert(customer);
		
		//Customer findCustomer = jdbcTemplateCustomerDao.findByCustomerId(1);
		
		int rowCount = jdbcTemplateCustomerDao.CountRowNumber();
		//Customer findCustomerByName = jdbcTemplateCustomerDao.findCustomerByName("ThinkingInGIS");
		System.out.println(rowCount);
		//System.out.println(findCustomerByName.getName() + "-" + findCustomerByName.getAge());
	}
}
