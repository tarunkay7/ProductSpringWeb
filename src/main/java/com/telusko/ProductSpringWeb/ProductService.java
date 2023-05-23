package com.telusko.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Component

public class ProductService {
    @Autowired
    ProductDB db;

    public Product addProduct(Product product) {
        return db.save(product);
    }

    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public Product getProductsByname(String name) {
        return db.findByNameContainsIgnoreCase(name);
    }

    public Product getProductByPlace(String pl){
        return db.findByPlaceContainsIgnoreCase(pl);
    }


}


