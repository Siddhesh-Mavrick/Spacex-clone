import java.util.*; 

public class swapalternate {

    public static void printing(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap (int arr[] , int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};

        for (int i = 0; i < arr.length; i+=2) {
            if (i + 1 < arr.length) {
                swap(arr, i, i+1);
            }
        }

        printing(arr);
        
        scan.close();
    }
}
