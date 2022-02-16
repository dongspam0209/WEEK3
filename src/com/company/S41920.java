package com.company;
//1920번 수 찾기


import java.util.Arrays;
import java.util.Scanner;

public class S41920 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N= scanner.nextInt();
        int[]arr=new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int M= scanner.nextInt();

        for (int i = 0; i < M; i++) {
            if(binarySearch(arr,scanner.nextInt())>=0){
                System.out.println('1');
            }
            else{
                System.out.println('0');
            }
        }
    }
    public static int binarySearch(int[] arr,int key){
        int lo=0;
        int hi=arr.length-1;

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(key<arr[mid]){
                hi = mid - 1;
            }
            else if(key>arr[mid]){
                lo = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
