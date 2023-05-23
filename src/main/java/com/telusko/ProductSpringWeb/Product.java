package com.telusko.ProductSpringWeb;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="type")
    private String type;
    private String place;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int warranty;

    public Product() {
    }

    public Product(String name, String type, String place, int warranty) {
        this.name = name;
        this.type = type;
        this.place = place;
        this.warranty = warranty;
    }


}
