package com.shubham.restws.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shubham.restws.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByIdAndName(int id, String name);

}

