package com.shubham.restws;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.shubham.restws.entities.Product;
import com.shubham.restws.repos.ProductRepository;

public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repository;

	@Override
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@Override
	public Product getProduct(int id, String name) {
		return repository.findByIdAndName(id,name);
	}

	@Override
	public Response createProduct(Product product) {
		Product savedProduct = repository.save(product);
		return Response.ok(savedProduct).build();
	}

	@Override
	public Response updateProduct(Product product) {
		Product savedProduct = repository.save(product);
		return Response.ok(savedProduct).build();
	}

}
