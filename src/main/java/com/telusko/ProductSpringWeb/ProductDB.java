package com.telusko.ProductSpringWeb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
    List<Product>findByNameContainsIgnoreCase(String name);

    List<Product> findByPlaceContainsIgnoreCase(String pl);
    
    List<Product> findByTypeContainsIgnoreCase(String type);

    List<Product> findByWarranty(int warranty);
}
