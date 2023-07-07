package com.jg.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jg.crud.models.ProductDTO;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {
	
	
}