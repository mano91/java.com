public class Vehicle {
 public void move()  {
   System.out.println("Vehicle is used to travel places");
 }

}


public class Car extends Vehicle {
  public void move() {
   System.out.println("Car is a vehicle");
  }

}



public class TestCar {
 public static void main(String args[]) {

  Vehicle obj1 = new Vehicle();
  obj1.move();

  Vehicle obj2 = new Car();
  obj2.move();
  
 }
}




