package com.Surya.simpleWebApp.service;

import com.Surya.simpleWebApp.model.Product;
import com.Surya.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//following the MVC pattern - Model
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts()
    {
        return repo.findAll();
    }

    public Product getProductById(int prodId)
    {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod)
    {
        repo.save(prod);
    }

//    public int getIndex(Product prod)
//    {
//        int index = 0;
//        for(int i = 0; i < products.size(); i++)
//        {
//            if(products.get(i).getProdId() == prod.getProdId())
//            {
//                index = i;
//            }
//        }
//
//        return index;
//    }

    public void updateProduct(Product prod)
    {
//        products.stream().filter(p -> p.getProdId() == prod.getProdId()).findFirst().get()
//        int index = getIndex(prod);
//        products.set(index, prod);
        repo.save(prod);
    }


    public void deleteProduct(int prodId) {
//        int index = 0;
//        for(int i = 0; i < products.size(); i++)
//        {
//            if(products.get(i).getProdId() == prodId)
//            {
//                index = i;
//            }
//        }
//
//        products.remove(index);

        repo.deleteById(prodId);

    }
}
