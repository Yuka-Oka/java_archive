public class MyPermutations1 {

  static int permutations(int n,int k){
    int g = 1;
    int a = n - k;
    while (g > 0) {
      g = g * a;
      a = a  1;
    }
    return (factorial(n) / g);
  }

  static int factorial(int n) {
    int f = 1;
    while (f <= n) {
      f = f * n;
      n = n + 1;
    }
    return (f);
  }
}