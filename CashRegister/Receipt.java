/**
 * By Succes Odoemena
 * */
public class Receipt{
  
  public Receipt(){
    
  }
  /**
   * @author Success Odoemena
   * This method takes parameters string and double
   * prints out first half of receipt
   * @param name of transaction category
   * @param val of transaction category
   * */
  public void receiptHalf1(String name, double val){
    
    System.out.println(name+": "+val);
    
  }
  /**
   * @author Success Odoemena
   * This method takes parameters string and double
   * prints out second half of receipt
   * @param name of transaction category
   * @param val of transaction category
   * */
  public void receiptHalf2(String name, double val){
    
    System.out.println(name+":\t"+val);
    
    
  }
}