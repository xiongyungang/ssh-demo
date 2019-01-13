package com.xyg.dao;

import java.util.List;

import com.xyg.pojo.Product;

public interface ProductDAO {
	public List<Product> list();
	public void add(Product product);
}
