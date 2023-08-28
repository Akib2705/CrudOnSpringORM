package com.springAdvance.springORMCrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springAdvance.springORMCrud.entites.Product;

@Component("Compo")
public class ProductImpl implements ProductDao {
	int a;

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	public Product findById(int id) {
		Product product = hibernateTemplate.get(Product.class, 1);
		return product;
	}

	public List<Product> loadAll(Product product) {
		List<Product> loadAll = hibernateTemplate.loadAll(Product.class);
		return loadAll;
	}


}
