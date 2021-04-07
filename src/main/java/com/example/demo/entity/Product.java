package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "PRODUCT_TBL")
public class Product {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String quantity;
	private double price;
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
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int id, String name, String quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
