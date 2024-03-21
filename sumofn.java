public class sumofn {
        public static int fact(int n){
            if (n==1) {
                return 1;
            }
            int fn1= fact(n-1);
            int fn = n + fn1;
            return fn;
        }
        public static void main(String[] args) {
            int n = 10;
            System.out.println(fact(n));
        }
}
