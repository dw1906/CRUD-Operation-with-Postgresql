package com.example.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.example.objects.Product;
import com.example.repository.ProductRepository;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ProductService
{
	@Autowired
	ProductRepository productRepo;
	public List<Product> getAllProducts(){
		List<Product> products = new ArrayList<Product>();
		productRepo.findAll().forEach(pro->products.add(pro));
		return products;
	}
	public Product getProductById(int id)
	{
		return productRepo.findById(id).get();
	}
	public void Save(Product product)
	{
		productRepo.save(product);
	}
	public void delete(int id) {
		productRepo.deleteById(id);
	}
	public void update(Product product, int productid) {
		productRepo.save(product);
	}
}
