/*

        This contains the first two questions that are not coding related
        so it's all a big comment of binary notation and integers.



       Question 1:
       -Write integers in binary notation
       -Power of 2:
       1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, etc.
       2^1, 2^2, 2^3, 2^4, 2^5, 2^6, 2^7, .......                               2^15 etc.


       1 = 1;
       8 = 1000;
       33 = 100001;
       78 = 1001110;
       787 = 1100010011;
             (example: 787 - 512 = 275 - 256 = 19 - 16 = 3 - 2 - 1 = 0)
       33,987 = 1000010011000011;
             (example: 33987 - 32768 = 1219 - 1024 = 195 - 128 = 67 - 64 = 3 - 2 - 1 = 0)





        Question 2:

        -Convert binary to integers
        -Power of 2:

        2^0, 2^1, 2^2, 2^3, 2^4, 2^5, 2^6, 2^7, 2^8 etc.

        0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, etc.

        0010 = 2^4,2^3,2^1,2^0 focusing only on 2^1 = 2;
        1001 = 9;
        0011 0100 = 34;
        0111 0010 = 72;
        0010 0001 1111 = 543;
        0010 1100 0110 0111 = 2^13, 2^12, 2^11, 2^10, 2^9...2^0 focusing only on 1 and the 2^# will get you a sum of 11367;

        */

package com.perscholas.java_basics.operators;

public class JavaQuestion3 {
    public static void main(String[] args) {

        // write a program that prints out binary string version of the number
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        // this prints 10

        // now use a shift operator to shift by 1 and assign to x
        x = x << 1;
        // i'm guessing if we shift to the left, we append a 0 to the left at the end of shift
        // binary would be 100...and decimal/int is 4.
        System.out.println(x);
        // yay got it right!
        // doing it again with 9, 17, 88...
        int nine = 9;
        int seventeen = 17;
        int eightyEight = 88;

        nine = nine << 1;
        seventeen = seventeen << 1;
        eightyEight = eightyEight << 1;

        System.out.println(nine);
        // prints 18
        System.out.println(seventeen);
        // prints 34
        System.out.println(eightyEight);
        // prints 176

    }

}
