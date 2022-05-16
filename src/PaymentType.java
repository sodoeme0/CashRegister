/**
 * By Succes Odoemena
 * */
public class PaymentType{
  
 private String name=null;
 private double amount=0;
  
  public PaymentType(){
    
  }
  
  /**
   * @author Success Odoemena
   * Creates custom constructor for PaymentType class.
   * Uses String and double as parameters
   * @param name of payment type
   * @param amount of payment type
   * */
   public PaymentType(String name, double amount){
     this.name = name;
     this.amount = amount;
    
  }
   
   /**
   * @author Success Odoemena
   * This method returns name
   * @return name of payment type
   * */
   public String getName(){
     return name;
     
   }
   
   /**
   * @author Success Odoemena
   * This method returns amount
   * @return amount of payment type
   * */
   public double getAmount(){
     return amount;
     
   }
   /**
   * @author Success Odoemena
   * This method sets amount. Takes as parameter as value.
   * @param x amount to be set for payment type
   * */
  public void setAmount(double x){
     this.amount = x;
     
   }
  
 
        
        
        
    
    
  }
 
 
 

