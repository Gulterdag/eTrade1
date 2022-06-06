package business.concrertes;

import java.util.List;

import business.abstracts.ProductService;
import dataAccess.abstracts.ProductRepository;
import entities.concecretes.Product;

public class ProductManager implements ProductService {
	private ProductRepository productRepository;
	public ProductManager(ProductRepository productRepository) {
		this.productRepository= productRepository;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Product product) {
      productRepository.add(product);
		
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
		// TODO Auto-generated method stub
		return productRepository.getAll();
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
