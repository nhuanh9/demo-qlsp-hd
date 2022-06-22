package com.example.demo.serivce.product;

import com.example.demo.model.Product;
import com.example.demo.serivce.GeneralService;

import java.util.List;

public interface IProductService extends GeneralService<Product> {
    List<Product> findAllByPriceGreaterThan300();

    List<Product> findAllByNameContaining(String name);
}
