package business.abstracts;

import java.util.List;

import entities.concecretes.Product;

public interface ProductService {
public void add(Product product);
public void update(Product product);
public void delete(Product product);
List<Product> getAll();
Product getById(int id);

}
