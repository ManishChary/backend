package com.Manish.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.Manish.entity.ProductCategory;

@RepositoryRestResource(path="product-category")//this is for custom name, thats it nothing is important 
@CrossOrigin("http://localhost:4200")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> 
{
	
}
