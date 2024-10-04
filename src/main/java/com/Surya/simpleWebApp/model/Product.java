package com.Surya.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@Component
@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;

    public Product()
    {

    }

    @Override
    public String toString() {
        return "Product {prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + "}";

    }
}
