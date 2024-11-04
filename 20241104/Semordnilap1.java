public class Semordnilap1 {
  static String getFront(String[] st){
    String a ="";
    for(int i = 0;i< st.length;i++){
    String v = "st[i]";
    a = a + v;
  }
  return a;
    System.out.print(a);
  }
  static String getBack(String[] st){
    String b ="";
    for(int u =st.length-1;u<=0;u--){
      String c = "st[u]";
      b = b + c;
    }
    System.out.print(b);
    return b;
  }

}