package com.springAdvance.springORMCrud.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@Column(name = "productId")
	private int id;
	@Column(name = "productName")
	private String name;
	@Column(name = "price")
	private int price;
	@Column(name = "productFeatures")
	private String features;

	public Product() {
		super();
	}

	public Product(int id, String name, int price, String features) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.features = features;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", features=" + features + "]";
	}

}
