package NhiPhanDeQuy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new LinkedList<>();
        System.out.println("nhap so phan tu cua mang");
        int num = scanner.nextInt();
        int i = 0;
        do {
            System.out.println("nhap phan tu thu" + i);
            int n = scanner.nextInt();
            integers.add(n);
            i++;
        } while (i < num);

        Collections.sort(integers);
        for(Integer in:integers){
            System.out.print(in);
        }
        System.out.println(findNumber(3, 0, 7, integers));
    }

    public static boolean findNumber(int number, int left, int right, List<Integer> integers) {
        int mid = (left + right) / 2;
        if(left>right){
            return  false;
        }
        if (mid == number) {
          return  true;
        }
        if(number > integers.get(mid)){
            return findNumber( number, mid+1, right,  integers);
        }else {
            return findNumber( number, left, mid-1,  integers);
        }
    }
}
