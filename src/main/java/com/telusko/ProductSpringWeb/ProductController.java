package com.telusko.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

    @Autowired
    ProductService ps;


    @GetMapping("/allproducts")
    public List<Product> getAllProducts() throws SQLException {
        return ps.getAllProducts();
    }

    @GetMapping("/productsbyname/{name}")
    public Product getProductsByName(@PathVariable String name){
        return ps.getProductsByname(name);
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product product){
        ps.addProduct(product);
        return "New Product Added Successfully";
        }

   @GetMapping({"/products/{place}"})
   public Product getProductByPlace(@PathVariable String place){
        return ps.getProductByPlace(place);
    }




}
