package com.telusko.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

    @Autowired
    ProductService ps;


    @GetMapping("/allproducts")
    public List<Product> getAllProducts() {
        return ps.getAllProducts();
    }

    @GetMapping("/productsbyname/{name}")
    public List<Product> getProductsByName(@PathVariable String name){
        return ps.getProductsByname(name);
    }
    @GetMapping("/productsbytype/{type}")
    public List<Product> getProductsByType(@PathVariable String type){
        return ps.getProductsBytype(type);
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product product){
        ps.addProduct(product);
        return "New Product Added Successfully";
        }

   @GetMapping({"/productsbyplace/{place}"})
   public List<Product> getProductByPlace(@PathVariable String place){
        return ps.getProductByPlace(place);
    }

    @GetMapping({"/productsbywarranty/{warranty}"})
    public List<Product> getProductsByWarranty(@PathVariable int warranty){
        return ps.getProductsByWarranty(warranty);
    }




}
