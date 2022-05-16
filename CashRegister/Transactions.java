/**
 * By Succes Odoemena
 * */

import java.util.*; 
public class Transactions{
  
  
  private double total = 0;
  private ArrayList<Items> shoppingCart = new ArrayList<>();
  
  
  private double subTotal = 0;
  private  double finalTotal;
  private PaymentType cash = new PaymentType("Cash", 0);
  private PaymentType debit = new PaymentType("Debit", 0);
  private PaymentType credit = new PaymentType("Credit", 0);
  private PaymentType check = new PaymentType("Check", 0);
  private ArrayList<PaymentType> payments = new ArrayList<>();
  
  private Receipt receipt = new Receipt();
  /**
   * @author Success Odoemena
   * This method  adds an item parameter to shoppinCart arraylist.
   * @param item to be added
   * */
  public void addItem(Items item){
    shoppingCart.add(item);
    
  }
  /**
   * @author Success Odoemena
   * This method calculates and stores the intial total.
   * @return finalTotal of double values stored inshoppingCart arraylist
   * */
  public double finalTotal(){
    double finalX=0;
    for(int x=0; x<shoppingCart.size();x++)
    {
      
      finalX = finalX + shoppingCart.get(x).getCost();
      
    }
    finalTotal = finalX+getTax();
    return finalTotal;
  }
  /**
   * @author Success Odoemena
   * This method  calculates total that will be later updated.
   * @return initial total
   * */
  
  public double calcTotal()
  {
    for(int x=0; x<shoppingCart.size();x++)
    {
      total = total + shoppingCart.get(x).getCost();
    }
    total=total+getTax();
    return total;
  }
  /**
   * @author Success Odoemena
   * This method returns updated total value.
   * @return updated total
   * */
  public double updatedTotal()
  {
    return total;
  }
  
  /**
   * @author Success Odoemena
   * This method  calculates subtotal and returns it.
   * @return subTotal
   * */
  public double getSubTotal(){
    
    for(int x=0; x<shoppingCart.size();x++)
    {
      subTotal = subTotal + shoppingCart.get(x).getCost();
      
    }
    return subTotal;
  }
  /**
   * @author Success Odoemena
   * This method  calculates tax and returns it.
   * @return tax
   * */
  public double getTax(){
    double tax=0;
    double totalForTax=0;
    for(int x=0; x<shoppingCart.size();x++)
    {
      totalForTax = totalForTax + shoppingCart.get(x).getCost();
      tax = (totalForTax*.07);
    }
    return tax;
  }
  
  /**
   * @author Success Odoemena
   * This method  calculates change and returns it.
   * @return change
   * */
  public double getChange(){
    double change=0;
    if(updatedTotal()<0){
      change=Math.abs(updatedTotal());
    }
    return change;
  }
  
  /**
   * @author Success Odoemena
   * This method prints out items within shoppingCart arraylist.
   * */
  public void printItems(){
    for(int x=0; x<shoppingCart.size();x++){
      System.out.println("Item "+ (x+1) +": "+shoppingCart.get(x).getName()+": "+
                         shoppingCart.get(x).getCost());
      
    }
  }
  /**
   * @author Success Odoemena
   * This method takes an int that represents payment type, takes double for amount.
   * then updates total and store payment in payment arraylist
   * @param x, decides which case will execute
   * @param amount that will be use to update remaining total
   * 
   * */
  public void addPayment(int x, double amount){
    
    switch(x){
      
      case 1: cash.setAmount(amount); payments.add(cash); total=total-amount; break;
      case 2: debit.setAmount(amount); payments.add(debit);total=total-amount;break;
      case 3: credit.setAmount(amount); payments.add(credit);total=total-amount;break;
      case 4: check.setAmount(amount); payments.add(check);total=total-amount;break;
      
    }
    
  }
  /**
   * @author Success Odoemena
   * This method checks if user has payed the sum of their balance.
   * @return true if updated total is less than or eqauul to 0
   * @return false if greater than 0
   * */
  public boolean isPaymentComplete(){
    if(total>0){
      return false;
    }
    else{
      return true;
    }
  }
  /**
   * @author Success Odoemena
   * This method prints out the receipt
   * */
  public void printOutReceipt(){
    for(int x=0; x<shoppingCart.size();x++){
      receipt.receiptHalf1(shoppingCart.get(x).getName(),shoppingCart.get(x).getCost());
    }
    System.out.println("---------------------------------------");
    receipt.receiptHalf1("Subtotal", getSubTotal());
    receipt.receiptHalf2("Tax", getTax());
    receipt.receiptHalf2("Total", finalTotal());
    for(int x=0; x<payments.size();x++){
      receipt.receiptHalf2(payments.get(x).getName(),payments.get(x).getAmount());
    }
    receipt.receiptHalf2("Change", getChange());
    
  }
  
  
  
}