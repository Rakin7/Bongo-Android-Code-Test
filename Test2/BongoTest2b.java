public class BongoTest2b 
{
  public static void main(String[] args) 
  {
    BongoTest2b a = new BongoTest2b();
    Car c = a.new Car();
    c.set_num_of_wheels(4);
    c.set_num_of_passengers(5);
    c.setGas(true);
    System.out.println(c);
    Plane p=a.new Plane(14,900,true);
    System.out.println(p);
  }
  public class Car 
  {
    private int wheels;
    private int passengers;
    private boolean gas;
    public void set_num_of_wheels(int wheels) 
    {
      this.wheels = wheels;
    }
    public void set_num_of_passengers(int passengers) 
    {
      this.passengers = passengers;
    }
    public void setGas(boolean gas) 
    {
      this.gas = gas;
    }
    public String toString()
    {
      return "Car has "+ get_num_of_wheels()+" wheels "+get_num_of_passengers()+" passengers and Gas status: "+has_gas()+".";
    }  
    public int get_num_of_wheels() 
    {
      return wheels;
    }  
    public int get_num_of_passengers() 
    {
      return passengers;
    }  
    public boolean has_gas() 
    {
      return gas;
    }
  }
  
  public class Plane
  {
    private int wheels;
    private int passengers;
    private boolean gas;
    public Plane(int wheels, int passengers, boolean gas)
    {
      this.wheels = wheels;
      this.passengers = passengers;
      this.gas = gas;
    }
    public String toString()
    {
      return "Plane has "+ get_num_of_wheels()+" wheels "+get_num_of_passengers()+" passengers and Gas status: "+has_gas()+".";
    }  
    public int get_num_of_wheels() 
    {
      return wheels;
    }  
    public int get_num_of_passengers() 
    {
      return passengers;
    }  
    public boolean has_gas() 
    {
      return gas;
    }
  }
}