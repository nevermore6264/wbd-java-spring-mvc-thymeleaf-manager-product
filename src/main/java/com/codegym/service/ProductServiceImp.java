package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImp implements ProductService {
    private  static  Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone X", 1000, "Apple"));
        products.put(2, new Product(2, "Iphone 8", 2000, "Apple"));
        products.put(3, new Product(3, "Xiaomi 5", 5000, "Xiaomi"));
        products.put(4, new Product(4, "Samsung Note 8", 700, "Samsung"));
        products.put(5, new Product(5, "Sony Z1", 100, "Sony"));
        products.put(6, new Product(6, "Nokia 6", 2000, "Nokia"));
    }

    @Override
    public List<Product> findAll(){
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product){

        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id){
        return products.get(id);
    }

    @Override
    public  void update(int id, Product product){
        products.put(id, product);

    }

    @Override
    public void remove(int id){
        products.remove(id);
    }
}