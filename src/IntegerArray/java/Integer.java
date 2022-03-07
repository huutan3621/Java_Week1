package IntegerArray.java;
import java.util.Scanner;

public class Integer {
	public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        // khoi tao array
        int [] arr = new int [n];
        System.out.print("Nhap vao cac phan tu: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhap phan tu k = ");
        int k = scanner.nextInt();
        // sap xep day so theo thu tu tang dan
        sortASC(arr);
        System.out.print("Sap xep mang tang dan: ");
        show(arr);
        System.out.printf("\nChan phan tu %d vao mang.", k);
        arr = insert(arr, k);
        System.out.print("\nMang sau khi chen: ");
        show(arr);
        sumary(arr);
        average(arr);
        
    }

    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
     

    public static int [] insert(int [] arr, int k) {
        int arrIndex = arr.length - 1;
        int tempIndex = arr.length;
        int [] tempArr = new int [tempIndex + 1];
        boolean inserted = false;
         
        for (int i = tempIndex; i >= 0; i--) {
            if (arrIndex > -1 && arr[arrIndex] > k) {
                tempArr[i] = arr[arrIndex--];
            } else {
                if (!inserted) {
                    tempArr[i] = k;
                    inserted = true;
                } else {
                    tempArr[i] = arr[arrIndex--];
                }
            }
        }
        return tempArr;
    }
    
    public static void sumary(int [] arr) {
    	int sum = 0;
    	for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
    	System.out.println("\nTong cua mang la: "+sum);
    }
    
    public static void average(int [] arr) {
    	int sum = 0;
    	for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
    	double average = (double)(sum/ arr.length);
    	System.out.println("Trung binh cua mang la: "+average);
    }
     
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
