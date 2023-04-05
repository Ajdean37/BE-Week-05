package src.Videos;

public class Videos {
    /*
   * Object Oriented Programming - OOP
   * 
   * DVD Player
   * -Properties
   *  -height
   *  -weight
   *  -width
   *  -color
   * -Functionality
   *  -Play
   *  -Fast forward
   *  -Rewind
   *  Pause
   * 
   * DVD
   * -Properties
   *  -Movie Length
   *  -Image
   *  -Size
   * -Functionality
   *  -Store
   * 
   * Four Pillars of OOP
   * 1. Abstraction 
   *  -Triangle- dont know angles of corners or length of sides but we do know it has 3 sides and 3 angles
   *  -Table- dont know the color or size but know it has a flat top with 4 legs
   * 2. Encapsulation
   *  -Driving a car- Only need to know how to turn the wheel, hit the break etc- dont need to know how those things are actually happening
   * 3. Inheritance 
   *  -just like inhereting from genes, the child class will inherent their parent class
   * 4. Polymorphism
   *  -something that can take different forms- Like animal communication- cat meows, dog barks etc
   * 
   * Class- is how we structure code in OOP
   * Class is like a blueprint
   * Object is the actual product developed (Instance) from the blueprint (Class)
   * An Object is an Instance of a Class
   */

   public static void main(String[] args) {
    
//    StringBuilder /*Class*/ name /*Object*/ = new StringBuilder() /*Instance*/;

   Student student1 = new Student();
   student1.setFirstName("Tom");
   student1.setLastName("Smith");
   student1.setGradeLevel(12);
   student1.setPhoneNumber("123-456-7890");

   student1.introduce();

   Student student2 = new Student("Sammy", "Jones");
   student2.introduce();

   Student student3 = new Student("Tom", "Riddle", "651-938-0928", 7);
   student3.introduce();

   Student student = new Student();
   student.setFirstName("Sally");
   student.setPhoneNumber("1234567890");
   student.introduce();

   Rectangle rec = new Rectangle(10, 15);
   rec.setLength(10);
   System.out.println(rec.getArea());
  }
   /*
    * Access Modifiers
    * Public-      accesible everywhere
    * Private-     only accessinle within the class itself
    * Protected-   only accessible within the class, other classed in the same package, and all subclasses
    * No Modifier- basically same as protected except not accessable in a subclass in different packages
    */



}
