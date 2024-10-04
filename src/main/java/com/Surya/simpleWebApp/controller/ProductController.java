package com.Surya.simpleWebApp.controller;

import com.Surya.simpleWebApp.model.Product;
import com.Surya.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts()
    {
        System.out.println(service.getProducts());
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId)
    {
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod)
    {
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProd(@RequestBody Product prod)
    {
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProd(@PathVariable int prodId)
    {
        service.deleteProduct(prodId);
    }
}
