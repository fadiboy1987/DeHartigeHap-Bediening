package dehartigehapbediening.entity.entitys;
// Generated Nov 22, 2011 3:55:37 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Gerecht generated by hbm2java
 */
public class Gerecht  implements java.io.Serializable {


     private int productBarCode;
     private Product product;
     private Date bereidingsTijd;
     private String bereidingsWijze;
     private Set ingredients = new HashSet(0);

    public Gerecht() {
    }

	
    public Gerecht(int productBarCode, Product product) {
        this.productBarCode = productBarCode;
        this.product = product;
    }
    public Gerecht(int productBarCode, Product product, Date bereidingsTijd, String bereidingsWijze, Set ingredients) {
       this.productBarCode = productBarCode;
       this.product = product;
       this.bereidingsTijd = bereidingsTijd;
       this.bereidingsWijze = bereidingsWijze;
       this.ingredients = ingredients;
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
    public Date getBereidingsTijd() {
        return this.bereidingsTijd;
    }
    
    public void setBereidingsTijd(Date bereidingsTijd) {
        this.bereidingsTijd = bereidingsTijd;
    }
    public String getBereidingsWijze() {
        return this.bereidingsWijze;
    }
    
    public void setBereidingsWijze(String bereidingsWijze) {
        this.bereidingsWijze = bereidingsWijze;
    }
    public Set getIngredients() {
        return this.ingredients;
    }
    
    public void setIngredients(Set ingredients) {
        this.ingredients = ingredients;
    }




}

