import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("Student");

    System.out.println("Enter name:");
    // String input
    String name = myObj.nextLine();
    
    System.out.println("Enter last name:");
    // String input
    String lastname = myObj.nextLine();

    
    System.out.println("Enter MI:");
    // String input
    String mi = myObj.nextLine();

    System.out.println("Enter Age:");
    // Numerical input
    int age = myObj.nextInt();
    
    System.out.println("Enter Year Level (1, 2, 3, 4):");
    // Numerical input
    int yl = myObj.nextInt();


    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Last Name: " + lastname);
    System.out.println("Middle: " + mi);
    System.out.println("Age: " + age);
    System.out.println("Year Level: " + yl);
  }
}
