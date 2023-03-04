package TimGiaTriNhoNhat;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[5];
        int i = 0;
        while (i < list.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            list[i] = input.nextInt();
            i++;
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(list));
//        for (int j = 0; j < list.length; j++) {
//            System.out.print(list[j] + "\t");
//        }
        int min = list[0];
        int j = 1;
        for (int k = 0; k < list.length; k++) {
            if (list[k]<min){
                min = list[k];
                k = j+1;
            }
        }
        System.out.println("giá trị nhỏ nhất trong mảng là : " + min + " ở vị trí " + j);
    }
}
