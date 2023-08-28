package com.springAdvance.springORMCrud.dao;

import java.util.List;

import com.springAdvance.springORMCrud.entites.Product;

public interface ProductDao {

	int create(Product product);

	void delete(Product product);

	void update(Product product);

	Product findById(int id);

	List<Product> loadAll(Product product);

}
