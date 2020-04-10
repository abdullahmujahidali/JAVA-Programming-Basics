/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author Addy
 */
class Book {
    /**
     * @param args the command line arguments
     */
    private String title;  
    private double price;
    public Book(){
        // intialize by empty space and 0
        title="";
        price=0.0;
    }
    public Book(String i,double d){
       // setter constructor
        title=i;
        price=d;
    }
    public void setTitle(String s){
        // setter function for title prvate variable
        title=s;
    }
    public void setPrice(double d){
        //setter function for price private variable
        price=d;
    }
    public String getTitle(){
        //this will return the value of title
        return title;
    }
    public double getPrice(){
        // this will return the value of price
        return price;
    }
    
    @Override
    public String toString(){
       //overriding the toString() method 
       // this function returns a string  which consist of both Book class member s concatenated. 
      return title+" "+ price;  
    }  
     
}
public class BookApp{
        public static void main(String[] args) {
     
            Book b1= new Book();
            b1.setTitle("John Doe");
            b1.setPrice(8.5);
            System.out.println(b1.toString());
            
            Book b2= new Book("Ann Smith",9.7);
            System.out.println(b2.toString());
    }
    
}
