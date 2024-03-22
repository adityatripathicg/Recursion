public class xpown {
    public static double xn(double x, double n){
        if(n==0){
            return 1;
        }
        return x * xn(x,n-1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(xn(2, 10));
    }
}
