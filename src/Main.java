import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
//        int x = 0b1010;
//        int y = 0b0110;
//        int z = x & y;
//        System.out.println(z);
//
//        int orOp = x | y;
//        System.out.println(orOp);
//
//        int xOr = x ^ y;
//        System.out.println(xOr);
//
//        int a = 10;
//        int leftShift = a<<1; // double the value by 2^1
//        System.out.println(leftShift);
//
//        int rightShift = a>>1; // divide the value by 2^1
//        System.out.println(rightShift);
//
//        System.out.println(String.format("%32s", Integer.toBinaryString(a)));

        // swap 2 variables without third variable
        int var1 = 12;
        int var2 = 10;
        var1 = var1 ^ var2; // result will not be maximum of these 2 numbers
        var2 = var1 ^ var2;
        var1 = var1 ^ var2;
        System.out.println(var1);
        System.out.println(var2);
    }
}