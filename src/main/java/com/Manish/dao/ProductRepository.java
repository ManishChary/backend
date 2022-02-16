package com.Manish.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.Manish.entity.Product;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> 
{
	Page<Product> findByCategoryId(@RequestParam("id") Long id,Pageable pageable);
	
	//http://localhost:8080/api/products/search/findByCategoryId?id=1(for books)
	//http://localhost:8080/api/products/search/findByCategoryId?id=2(for coffee mugs)
	
	Page<Product> findByNameContaining(@RequestParam("name") String name,Pageable pageable);
	//Containing is similar to SQL "like" keyword  
	
	//http://localhost:8080/api/products/search/findByNameContaining?name=Java
}
