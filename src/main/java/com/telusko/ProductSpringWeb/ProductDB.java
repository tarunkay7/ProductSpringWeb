package com.telusko.ProductSpringWeb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
    Product findByNameContainsIgnoreCase(String name);

    Product findByPlaceContainsIgnoreCase(String pl);

}
