package com.springAdvance.springORMCrud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springAdvance.springORMCrud.dao.ProductDao;
import com.springAdvance.springORMCrud.entites.Product;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springAdvance/springORMCrud/config.xml");
		ProductDao productDao = context.getBean("Compo",ProductDao.class);
		
		
		Product product = new Product();
		product.setId(1);
		product.setName("Hp pavilion Laptop");
		product.setPrice(65000);
		product.setFeatures("High Performance");

		Product product2 = new Product();
		product2.setId(3);
		product2.setName("Dell");
		product2.setPrice(65000);

		int create = productDao.create(product);
		System.out.println("added");
		
	}
}
