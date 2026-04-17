package src.week1.day3;

import java.util.Scanner;

/**
 * @author wangwei
 * @createTime 2026/4/17 15:56
 * @description
 */
public class Solution59 {



        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scanner.nextInt();
            }
            int[] sums = new int[n];
            int count = 0;
            while(scanner.hasNext()){
                int left = scanner.nextInt();
                int right = scanner.nextInt();
                sums[count++] = subSum(arr,left,right);
            }


            for(int i=0;i<sums.length;i++){
                System.out.println(sums[i]);
            }


        }

        private static int subSum(int[] arr,int left,int right){
            int sum = 0;
            while (left<right){
                sum +=arr[left];
                sum +=arr[right];
                left ++ ;
                right--;
            }
            if (left == right){
                sum+=arr[left];
            }
            return sum;
        }


}
