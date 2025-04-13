package com.suffu.ProductNest_Api.controller;

import com.suffu.ProductNest_Api.model.Product;
import com.suffu.ProductNest_Api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Project";
    }

    @GetMapping("/products")
    public List<Product> getProduct(Product product){
        return service.getProduct(product);
    }

//    @GetMapping("/products/{productId}")
//    public Product getProductById(@PathVariable int product){
//        return service.getProductById(product);
//    }

    @PostMapping("/products")
    public void addProduct(@RequestBody  Product product){
        System.out.println("Product Added");
         service.addProduct(product);
    }
}
