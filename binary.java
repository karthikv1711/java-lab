//program to perform binary search using java
 import java.util.Scanner;

class BinarySearch {
    int[] a = {1, 2, 3, 4, 5, 6};
    int low = 0;
    int high = a.length - 1;
    int mid;
    int key;

    void search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key:");
        key = sc.nextInt();
        
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == key) {
                System.out.println("Your key is found at index: " + mid);
                return; 
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Your key is not found");
    }
}

public class binary {
    public static void main(String[] args) {
        BinarySearch s = new BinarySearch();
        s.search();
    }
}

