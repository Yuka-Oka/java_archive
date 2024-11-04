
public class MyArray2{

    static void countOddEven(int[] table){
      int count =0;
      for(int i :table)
      if(i%2 ==0){
        count++;
      }
      System.out.println("奇数は"+ (int [].length)-count)+"個、" + "偶数は"count);
  
    }
  
  }