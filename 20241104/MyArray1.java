
public class MyArray1{

    static void countOddEven(int[] table){
      int count = 0;
      int Count = 0;
      for (int i = 0; i < table.length; i++){
        int number = countOddEven(table);
        if (number % 2 == 0){
           count ++;
        }else{
           Count ++;
        }
      }
      System.out.println("奇数は"+count+"個、偶数は"+Count+"個");
  
    }
  
  }