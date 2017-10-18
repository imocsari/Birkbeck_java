import java.util.*;
public class StringCompare {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first word:");
    String first = scan.next();
    System.out.println("Enter the second word:");
    String second = scan.next();
    System.out.println("Enter the third word:");
    String third = scan.next();


    int num1 = first.compareTo(second);
    int num2 = first.compareTo(third);
    int num3 = second.compareTo(third);

    if (num1 >= num2 && num2 >= num3 && num1 >= num2)
      System.out.println("The middle word is: " + first);
    else if (num1 >= num3 && num2 <= num3)
      System.out.println("The middle word is: " + second);
    else
      System.out.println("The middle word is: " + third);



    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
  }


}
