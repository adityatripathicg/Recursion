public class binaryStrings {
    public static void print(int n, int lp, StringBuilder str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // Work
        StringBuilder str1 = new StringBuilder(str);
        StringBuilder str2 = new StringBuilder(str);
        str1.append("0");
        print(n - 1, 0, str1);
        if (lp == 0) {
            str2.append("1");
            print(n - 1, 1, str2);
        }
    }

    public static void main(String[] args) {
        int n = 3; // Example: printing binary strings of length 3
        StringBuilder str = new StringBuilder();
        print(n, 0, str);
    }
}
