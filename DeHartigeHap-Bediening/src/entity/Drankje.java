package entity;
// Generated Nov 22, 2011 3:55:37 PM by Hibernate Tools 3.2.1.GA



/**
 * Drankje generated by hbm2java
 */
public class Drankje  implements java.io.Serializable {


     private int productBarCode;
     private Product product;

    public Drankje() {
    }

    public Drankje(int productBarCode, Product product) {
       this.productBarCode = productBarCode;
       this.product = product;
    }
   
    public int getProductBarCode() {
        return this.productBarCode;
    }
    
    public void setProductBarCode(int productBarCode) {
        this.productBarCode = productBarCode;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }




}


