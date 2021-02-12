package com.example.demo.NumberByAdding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddNumber {

    public static void main(String[] args) {

        System.out.println("Enter number to transform");
        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();
        System.out.println(transform(numberInput));

        
        /*
        List<Integer> nums = new ArrayList<>();
        while (numberInput!=0){
            nums.add((numberInput%10)+1);
            numberInput=numberInput/10;
        }
        Collections.reverse(nums);
        for(Integer number : nums){
            System.out.print( number);
        }
         */

    }
    public static long transform(int number) {
        int divisor = 1;
        long multiply = 1, result = 0;
        while (divisor < number) {
            int digit = number / divisor % 10;
            if (digit < 9) {
                result = result + (digit + 1) * multiply;
                multiply = multiply * 10;
            } else {
                result = result + (digit + 1) * multiply;
                multiply = multiply * 100;
            }
            divisor = divisor * 10;
        }
        return result;
    }

}
