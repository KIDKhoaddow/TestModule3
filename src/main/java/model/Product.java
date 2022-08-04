package model;

public class Product {
    private  int id ;
    private  String productName;
    private  double productPrice;
    private  int productQuantity;
    private  String productColor;
    private  String productCategory;
    private  String productDescription;

    public Product(int id, String productName, double productPrice, int productQuantity, String productColor, String productCategory, String productDescription) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
    }

    public Product(String productName, double productPrice, int productQuantity, String productColor, String productCategory, String productDescription) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getProductColor() {
        return productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
