public class Java {

    public static void main(String[] args) {
        int res = Java.myPowRecursive(2,5);
        System.out.println("Result of 2 to the power of 5 is " + res);
    }

    //Write a recursive version of pow function i.e.
    //public static int myPow(int x, int y)  where y an integer >= 0 // Returns the value of the first argument raised to the power of the second argument.

    public static int myPowRecursive(int x, int y) {
        int result = 0;

        if (y == 0){
            return 1;
        }

        else
            return x * myPowRecursive(x, y-1);
    }

    //Write an iterative version of myPow method. Profile both iterative and recursive version. Which is more efficient in terms of CPU time?
    public static int myPowIterative(int x, int y){
        return 0;
    }

}
