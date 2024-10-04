package com.Surya.simpleWebApp.repository;

import com.Surya.simpleWebApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>
{

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"iPhone",1000),
//            new Product(102,"iPad",1500),
//            new Product(103, "Watch",700)));
}
