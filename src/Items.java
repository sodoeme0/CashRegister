/**
 * By Succes Odoemena
 * */
public class Items {
 private double cost = 0;
 private String name = null;
 public Items()
 {
  
 }
 /**
   * @author Success Odoemena
   * Creates custom constructor for Item class.
   * Uses String and double as parameters
   * @param name of item
   * @param cost of item
   * */
 public  Items(String name, double cost) {
  this.cost = cost;
  this.name = name;
 }
 /**
   * @author Success Odoemena
   * This method returns cost
   * @return cost of item
   * */
 public double getCost() {
  return cost;
 }
 /**
   * @author Success Odoemena
   * This method returns name
   * @return name of item
   * */
 public String getName() {
  return name;
 }

}
