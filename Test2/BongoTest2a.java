public class BongoTest2a 
{
 public static void main(String[]args) 
 {
  BongoTest2a a = new BongoTest2a();
  Car c = a.new Car();
  System.out.println("Car has "+ c.set_num_of_wheels()+" wheels "+c.set_num_of_passengers()+" passengers and Gas status: "+c.has_gas()+".");
  Plane p = a.new Plane();
  System.out.println("Plane has "+ p.set_num_of_wheels()+" wheels "+p.set_num_of_passengers()+" passengers and Gas status: "+p.has_gas()+".");
 }
 interface Vehicle 
 {
  int set_num_of_wheels();
  int set_num_of_passengers();
  boolean has_gas();
 }
 public class Car implements Vehicle 
 {
  public int set_num_of_wheels() 
  {
   return 4;
  }
  public int set_num_of_passengers() 
  {
   return 5;
  }
  public boolean has_gas() 
  {
   return true;
  }
 }
 public class Plane implements Vehicle 
 {
  public int set_num_of_wheels() 
  {
   return 14;
  }
  public int set_num_of_passengers() 
  {
   return 900;
  }
  public boolean has_gas() 
  {
   return true;
  }
 }
}
 // Vehicle is an interface class so I created 2 classes named Car and Plane which implements the Vehicle class and override the methods
