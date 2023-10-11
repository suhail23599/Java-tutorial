import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + "" + b);

        System.out.println("sum" + a + b ); // sum1020

        System.out.println(a + b + "sum" ); // 30sum

        // formatted output
        float f = 2.4f;
        char c = 'a';
        int num = 10;
        System.out.printf("hello %f \n", f);

        System.out.printf("%1$d %1$d \n", num); // 1$ -> first argument

        int num1 = 5;
        System.out.printf("%5d \n", 5); // width -5
        System.out.printf("%05d \n", 5); // flag - 0, fill the empty space w zero

        int neg = -10;
        System.out.printf("%(5d \n", neg); // flag - (, if num is neg it will be enclosed in (), for positive no ()

        System.out.printf("%+5d \n", neg); // flag - +, it will print the sign of number

        float f_num = 12.453f;
        System.out.printf("%6.3f \n", f_num); // precision .2 places,only 5 digits
    }
}