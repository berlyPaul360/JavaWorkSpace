package service;

import java.util.List;

import dao.ProductDao;
import dao.ProductDaoCollectionImpl;
import exceptiom.EmptyStoreException;
import model.ProductPojo;

public class ProductServiceImpl implements ProductService {
	
	ProductDao productDao;
	
	

	public ProductServiceImpl() {
		
		productDao = new ProductDaoCollectionImpl();
	}

	@Override
	public ProductPojo addProduct(ProductPojo productPojo) {
		
		return productDao.addProduct(productPojo);
	}

	@Override
	public ProductPojo updateProduct(ProductPojo productPojo) {
		
		return productDao.updateProduct(productPojo);
	}

	@Override
	public void deleteProduct(int productId) {
		productDao.deleteProduct(productId);
		
	}

	@Override
	public List<ProductPojo> getAllProducts()throws EmptyStoreException{
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	@Override
	public ProductPojo getAProduct(int productId) {
		// TODO Auto-generated method stub
		return productDao.getAProduct(productId);
	}
	
	

}
