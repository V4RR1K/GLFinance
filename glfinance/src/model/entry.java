package model;
import java.util.Date;
import java.text.Format;
import java.text.SimpleDateFormat;


/**
 * Entry defines the entry object
 * 
 * @author Greg Lynskey
 * @date   12-18-22
 */
public class Entry {
    
    private String transaction_date;
    private String transaction_name;
    private double transaction_total;
    private category transaction_category;
    private subcategory transaction_subcategory;

    public Entry (String date, String name, double total, category c, subcategory s){
        if (date == null){
            Format f = new SimpleDateFormat("MM-dd-yy");
            this.transaction_date = f.format(new Date());
        } else {
            this.transaction_date = date;
        }

        this.transaction_name = name;
        this.transaction_total = total;
        this.transaction_category = c;
        this.transaction_subcategory = s;
    }

    public String get_transaction_date(){
        return this.transaction_date;
    }
    public String get_transaction_name(){
        return this.transaction_name;
    }
    public double get_transaction_total(){
        return this.transaction_total;
    }
    public category get_transaction_category(){
        return this.transaction_category;
    }
    public subcategory get_transaction_subcategory(){
        return this.transaction_subcategory;
    }

    public void set_transaction_date( String date ){
        this.transaction_date = date;
    }
    public void set_transaction_name( String name ){
        this.transaction_name = name;
    }
    public void set_transaction_total( double total ){
        this.transaction_total = total;
    }
    public void set_transaction_category( category c ){
        this.transaction_category = c;
    }
    public void set_transaction_subcategory( subcategory s ){
        this.transaction_subcategory = s;
    }

    @Override
    public String toString(){
        return "{ " + this.transaction_date +
            ", " + this.transaction_name +
            ", " + String.format("%.2f", this.transaction_total) +
            ", " + this.transaction_category +
            ", " + this.transaction_subcategory;
    }
}
