import java.time.temporal.ValueRange;
import java.util.Arrays;
import java.util.Scanner;

public class Converter {


    static int fromBinaryToDecimal(String binaryInput){
        double deciNumberOutput = 0;
        for (int i = 0; i < binaryInput.length(); i++) {
            deciNumberOutput = Integer.parseInt(String.valueOf(binaryInput.charAt(i))) * Math.pow(2,i) + deciNumberOutput;
        }
        return (int) deciNumberOutput;
    }



/*
    static String fromDeciToBinary(int inputDeci) {
            boolean isDone = false;
            String binaryStr = "";
            for (int i = 0; !isDone; i++) {
                int binaryCalc = (int) (Math.pow(2, i)+i);
                if ( i+inputDeci == binaryCalc ) {
                    binaryStr += 1;
                    isDone = true;
                }  else if ( i+inputDeci != binaryCalc) {
                    binaryStr += 0;
                    isDone = true;
                } else {
                    binaryStr += 1;

                }
        }
        return binaryStr;

    }

 */

    public static void main(String[] args) {
        System.out.println(fromBinaryToDecimal("00000001"));
       // System.out.println(fromDeciToBinary(5));
    }

}
