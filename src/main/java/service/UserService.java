package service;

import DAO.ProductRepo;
import model.Product;

import java.util.List;

public class UserService {
    ProductRepo userRepository = new ProductRepo();
    private  static  UserService instance = new UserService();

    public static UserService Instance(){
        return instance;
    }

    public List<Product> findAllProduct() {
        return userRepository.findAllProduct();
    }


}
