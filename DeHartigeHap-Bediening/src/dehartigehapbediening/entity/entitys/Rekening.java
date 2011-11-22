package dehartigehapbediening.entity.entitys;
// Generated Nov 22, 2011 3:55:37 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rekening generated by hbm2java
 */
public class Rekening  implements java.io.Serializable {


     private int rekeningNr;
     private Restaurant restaurant;
     private Tafel tafel;
     private Integer statusCode;
     private Date datumTijdBetaling;
     private Set bestellings = new HashSet(0);

    public Rekening() {
    }

	
    public Rekening(int rekeningNr, Restaurant restaurant, Tafel tafel) {
        this.rekeningNr = rekeningNr;
        this.restaurant = restaurant;
        this.tafel = tafel;
    }
    public Rekening(int rekeningNr, Restaurant restaurant, Tafel tafel, Integer statusCode, Date datumTijdBetaling, Set bestellings) {
       this.rekeningNr = rekeningNr;
       this.restaurant = restaurant;
       this.tafel = tafel;
       this.statusCode = statusCode;
       this.datumTijdBetaling = datumTijdBetaling;
       this.bestellings = bestellings;
    }
   
    public int getRekeningNr() {
        return this.rekeningNr;
    }
    
    public void setRekeningNr(int rekeningNr) {
        this.rekeningNr = rekeningNr;
    }
    public Restaurant getRestaurant() {
        return this.restaurant;
    }
    
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    public Tafel getTafel() {
        return this.tafel;
    }
    
    public void setTafel(Tafel tafel) {
        this.tafel = tafel;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }
    
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
    public Date getDatumTijdBetaling() {
        return this.datumTijdBetaling;
    }
    
    public void setDatumTijdBetaling(Date datumTijdBetaling) {
        this.datumTijdBetaling = datumTijdBetaling;
    }
    public Set getBestellings() {
        return this.bestellings;
    }
    
    public void setBestellings(Set bestellings) {
        this.bestellings = bestellings;
    }




}


