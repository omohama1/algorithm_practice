package org.example.algos;

import org.example.Main;

public class BinaryConverter {

    public static String decimalToBinary(int num) {
        String binString = "";
        String result = "0x0000";
        if(num == 0) result+="0";
        while(num != 0){
            if(num % 2 ==0) {
                binString += "0";
            }
            else {
                binString += "1";
            }
            num /= 2;
        }
        for(int i = binString.length()-1; i>=0; i--) {
            result+=binString.charAt(i);
        }
        System.out.println(result);
        return  result;
    }

    public static int stringBinaryToDecimal(String numString) {
        int answer = 0;
        int i = 0;
        int p = 0;
        for( i = numString.length() - 1; i >= 0; i--) {
            if(numString.charAt(i) == '1') {
                System.out.println(Math.pow(2, p));
                answer += Math.pow(2, p);
            }
            p++;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main (String... args) {
        decimalToBinary(44);
        decimalToBinary(45);
        decimalToBinary(10);
        decimalToBinary(3);
        decimalToBinary(2);
        decimalToBinary(0);
        decimalToBinary(1);
        stringBinaryToDecimal("1010");
        stringBinaryToDecimal("1");
        stringBinaryToDecimal("10");
    }
}
