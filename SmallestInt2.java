import java.util.*;
public class SmallestInt2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a value for x:");
    int x = scan.nextInt();
    int smallest = x; // x is the smallest value so far
    System.out.println("Enter a value for y:");
    int y = scan.nextInt();
    if (y < smallest) {
    smallest = y; // Update smallest if necessary
    }
    System.out.println("Enter a value for z:");
    int z = scan.nextInt();
    if (z < smallest) {
    smallest = z; // Update smallest if necessary
    }
    System.out.println("Enter a value for o:");
    int o = scan.nextInt();
    if (o < smallest) {
    smallest = o; // Update smallest if necessary
    }
    System.out.println("The smallest value was " + smallest);
  }
}
