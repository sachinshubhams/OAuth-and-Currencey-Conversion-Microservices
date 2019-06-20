package com.shubham.restws;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.shubham.restws.entities.Product;

@Consumes("application/json")
@Produces("application/json")
@Path("/productservice")
public interface ProductService {
	
	@Path("/products")
	@GET
	List<Product> getProducts();
	
	@Path("/products/{id}/{name}")
	@GET
	Product getProduct(@PathParam("id") int id, @PathParam("name") String name);
	
	@Path("/products")
	@POST
	Response createProduct(Product product);
	
	@Path("/products")
	@PUT
	Response updateProduct(Product product);
	

}
