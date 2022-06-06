package dataAccess.concretes.jdbcImpls;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ProductRepository;
import entities.concecretes.Product;

public class JdbcProductRepository implements ProductRepository {
	List<Product> products;
	public JdbcProductRepository()  {
		products = new ArrayList<Product>();
		
	}

	@Override
	public void add(Product product) {
		products.add(product);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAll() {
		return products;
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}