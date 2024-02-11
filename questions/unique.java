import java.util.*; 

public class unique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = {4,2,7,78,4,2,7};

        int ans  = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);

        scan.close();
    }
}
