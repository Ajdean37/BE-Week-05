package src.Videos;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
  
  public static void main(String[] args) {

    int[] numbers = new int[3];
    System.out.println("hi");

    if (numbers.length > 3) {
      System.out.println(numbers[3]);
    }
    System.out.println("bye");

    /*
     * Checked Exception - explicitly checks for error in our code
     * try catch block- handles checked exceptions
     * 
     * Unchecked Exception - something the coder has control over and only occurs if we make mistakes in coding
     */

    try {
      FileReader fileReader = new FileReader("something.txt");
    } catch (FileNotFoundException e) {
      System.out.println(e.toString());
    } catch (Exception e) {

    } finally {
      System.out.println("Finally!");
    }

    System.out.println("after the try catch");

    try {
      openFile("Anotherfile.jpg");
    } catch ( FileNotFoundException e) {
      e.printStackTrace();
    }  

  }

  public static FileReader openFile(String fileName) throws FileNotFoundException {
    return new FileReader(fileName);
  }
}
