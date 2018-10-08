public class Java {
    public static double myPow(double a, int b){
        if (b == 0){
            return 1;
        }
        else
            return a * myPow(a,b-1);
    }
}
