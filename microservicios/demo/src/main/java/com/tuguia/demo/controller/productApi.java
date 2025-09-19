package com.tuguia.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuguia.demo.entities.Product;

@RestController
@RequestMapping("/api/v1/Product")
public class productApi {
    private List<Product> listP = new ArrayList<>();

    @GetMapping
    public List<Product> getAllProducts(){
        return listP;
    }

    @PostMapping
    public Product addProduct(Product p){
        listP.add(p);
        return p;
    }
}
