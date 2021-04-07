package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct (Product product) {
		return repository.save(product);
	}
	
	public List <Product> saveProducts(List<Product>products) {
		return repository.saveAll(products);
	}
	
	public List <Product> getProducts(){
		return repository.findAll();
	}
	
	public Product getProductById(int id) {
		return repository.findById(id);
	}
	
	public Product getProductByName(String name) {
		return repository.findByName(name);
	}
	
	public String deleteProduct (int id) {
		repository.deleteById(id);
		return "product removed !!"+id;
	}
	
	public Product updateProduct(Product product) {
		Product existinProduct=repository.findById(product.getId());
		existinProduct.setName(product.getName());
		existinProduct.setQuantity(product.getQuantity());
		existinProduct.setPrice(product.getPrice());
		return repository.save(existinProduct);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
