class ArrayList {
  public static void main(String[] args) {

  int[] array = {8,4,5,21,7,9,18,2,100};

  System.out.println(array.length);
  System.out.println(array[0]);
  System.out.println(array[array.length - 1]);

  for(int i = 0;i < array.length; i++) {
    System.out.println(array[i]);
  }

  for(int i = 0;i < array.length; i++) {
    System.out.println("array["+ i + "] = " + array[i]);
  }

  for(int i = (array.length - 1);i > 0; i--) {
    System.out.println("array["+ i + "] = " + array[i]);
  }
  for(int i: array ){
    int number = i;
    System.out.println(number);
  }
  }
}
