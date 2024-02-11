import java.util.Scanner;

public class poweroftwo {

    public static boolean is (int n) {
        if ((n & n - 1) == 0) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(is(n));
    
        scan.close();
    }
}
