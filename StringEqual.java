public class StringEqual {
  public static void main(String[] args) {
  String str1 = "abcd";
  String str2 = "abcdefg";
  String str3 = str1 + "efg";
  System.out.println("str2 = " + str2);
  System.out.println("str3 = " + str3);
  if (str2.equals(str3))
    System.out.println("The strings are equal");
  else
    System.out.println("The strings are not equal");
  }
}
