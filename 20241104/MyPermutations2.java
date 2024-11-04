public class MyPermutations {

  static int permutations(int n,int k){
  int n2=0;
  if(k==1)
  n2=n;
   else {for(int i=n;i>=n-k+1; i--)
{n2=n*i;}}
return n2;


//書き直し breakを使う
int n2=0
factorial(n)
if(i==)
break;
  }

  static int factorial(int n) {
     int n1=0;
for(int i=n-1; i>0; i--)
{n1=n*i;}
    return n1;
  }
}