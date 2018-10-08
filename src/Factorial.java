// Factorial.java
// Recursive factorial method

public class Factorial {
   
   // Recursive definition of method factorial
   public static int fact( int n )
   {      
      if ( n == 1 || n == 0 )  // base case
         return 1;
      else {
         int result1 = fact(n-1); 
         int result2 = n * result1;
         return result2;
         //return n * fact(n-1);
      }
   }
}
