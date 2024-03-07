public class power {
    public static int optimizedPower(int x,int n){
        if (n==0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq =  halfPower * halfPower;
        //long halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);

        //n is odd
        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(optimizedPower(x, n));
    }
}


