public class tilingProblem {
    public static int tilingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //Work
        //Vertical Choice
        int fnm1 = tilingProblem(n-1);
        //horizontal Choice
        int fnm2 = tilingProblem(n-2);

        //total
        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingProblem(n));
    }
}
