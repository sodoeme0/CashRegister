/**
 * By Succes Odoemena
 * */
import java.util.*; 

public class CashRegister {
  
/**
   * @author Success Odoemena
   * Main method
   * */
  public static void main(String[] args) {
    Transactions transaction= new Transactions();
    Scanner scan = new Scanner(System.in);
    int selection = 0;
    double amount=0;
    //create items here
    Items bookBag = new Items( "Book Bag" ,  50.5);
    Items journal = new Items( "Journal" ,  20.75);
    Items pencils = new Items( "pencil pack" ,  10.75);
    
    
    //add items here
    transaction.addItem(bookBag);
    transaction.addItem(journal);
    transaction.addItem(pencils);
    
    transaction.printItems();

    System.out.println("Total: "+transaction.calcTotal());
    
    do{
      System.out.println("Please eneter payment type.");
      System.out.println("1. Cash\n2. Debit Card\n3. Credit Card\n4. Check");
      selection = Integer.parseInt(scan.nextLine());
      System.out.println("Enter the amount to pay with this type.");
      amount = Double.parseDouble(scan.nextLine());
      transaction.addPayment(selection, amount);
      System.out.println("Total after payment: "+transaction.updatedTotal());
    }while(transaction.isPaymentComplete()==false);

transaction.printOutReceipt();

  }

}