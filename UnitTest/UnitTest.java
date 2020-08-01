import org.junit.Test;
import static org.junit.Assert.*;
public class UnitTest 
{
  //BongoTest1
  public void checkanagram() 
  {
    assertEquals(true, new BongoTest1().anagram("Hello", "eHllo"));
    assertEquals(false, new BongoTest1().anagram("Helo", "eHllo"));
  }
  //BongoTest2a 
  public void testVehicle1() 
  {
    int numOfWheels = 4;
    int numOfPassengers = 5;
    boolean hasGas = true;    
    BongoTest2a a= new BongoTest2a();
    BongoTest2a.Car car = a.new Car();
    assertEquals(numOfWheels, car.set_num_of_wheels());
    assertEquals(numOfPassengers, car.set_num_of_passengers());
    assertEquals(hasGas, car.has_gas());
    
    numOfWheels = 14;
    numOfPassengers = 900;
    hasGas = true;    
    BongoTest2a.Plane plane = a.new Plane();
    assertEquals(numOfWheels, plane.set_num_of_wheels());
    assertEquals(numOfPassengers, plane.set_num_of_passengers());
    assertEquals(hasGas, plane.has_gas());
  }
  //BongoTest2b
  public void testVehicle2() 
  {
    int numOfWheels = 4;
    int numOfPassengers = 5;
    boolean hasGas = true;    
    BongoTest2b b= new BongoTest2b();
    BongoTest2b.Car car = b.new Car();
    car.set_num_of_wheels(numOfWheels);
    car.set_num_of_passengers(numOfPassengers);
    car.setGas(hasGas);
    assertEquals(numOfWheels, car.get_num_of_wheels());
    assertEquals(numOfPassengers, car.get_num_of_passengers());
    assertEquals(hasGas, car.has_gas());
    
    numOfWheels = 14;
    numOfPassengers = 900;
    hasGas = true;
    BongoTest2b.Plane plane = b.new Plane(14,900,true);
    assertEquals(numOfWheels, plane.get_num_of_wheels());
    assertEquals(numOfPassengers, plane.get_num_of_passengers());
    assertEquals(hasGas, plane.has_gas());
  }
  //BongoTest3
  public void testVideoPlayer()
  {
    BongoTest3 vp = new BongoTest3();
    assertEquals(true, vp.forward(10));
    assertEquals(true, vp.rewind());
    assertEquals(true, vp.play());
  }
}
