public class tilingProblem {
    public static int tilingPro(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //Work
        //Vertical Choice
        int fnm1 = tilingPro(n-1);
        //horizontal Choice
        int fnm2 = tilingPro(n-2);

        //total
        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingPro(n));
    }
}
