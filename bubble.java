import java.util.*;
class Bubblesort{
    public static void main(String []args){
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.print("Enter value "+i+" into array: ");
            a[i] = sc.nextInt();
        }
        int loop = 0;
        while(loop<=a.length){
            for(int j = 0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j+1] = temp;
                }
            }
            loop++;
        }
        for(int k = 0;k<a.length;k++){
            System.out.print(a[k] + "\t");
        }
        System.out.println();
    }
}



