package DAO;

import connect.ConnectionMySQL;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    ConnectionMySQL connectionMySQL = new ConnectionMySQL();

    private final String SELECT_ALL_PRODUCT = "select *  from product p inner join category c on p.category = c.id";

    public List<Product> findAllProduct() {
        List<Product> productList = new ArrayList<>();
        try {
            Connection connection = connectionMySQL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idProduct = resultSet.getInt("id");
                String productName= resultSet.getString("product_name");
                double productPrice= resultSet.getDouble("price");
                int productQuantity=resultSet.getInt("quantity");
                String productColor=resultSet.getString("color");
                String productCategory=resultSet.getString("category_name");
                String productDescription=resultSet.getString("description");
                Product product=new Product(idProduct,productName,productPrice,productQuantity,productColor,productCategory,productDescription);
                productList.add(product);
            }
            return productList;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return productList ;
        }
    }
}
