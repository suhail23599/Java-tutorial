import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a = 2;
//        int b = 3;
        String str = "abc";
//        System.out.println(str + a + b);

        int num1 = 25;
        float num2 = 3.2f;
//        System.out.println(num1+num2);

        String w = "1";
        char ch = '2';
        String ab = ch + w;
        System.out.println(ab);

        float f1 = 2.5f;
        double d1 = 3.2;
//        double d = f1 + d1;

        int num3 = 4;
        int num4 = 5;
        float ans = (float)num3/num4;
        System.out.println(ans);

        // area of triangle
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter base:");
//        float base = sc.nextFloat();
//        System.out.println("enter height:");
//        float height = sc.nextFloat();
//        System.out.println("Area is:" + (1f/2f)*base*height);

        //area of triangle using 3 sides
//        float s1, s2, s3, s;
//        double area;
//        System.out.println("Enter 3 sides value");
//        s1 = sc.nextFloat();
//        s2 = sc.nextFloat();
//        s3 = sc.nextFloat();
//        s = (s1 + s2 + s3)/2f;
//        area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)); // sqrt will return double, hence area should be declared as double.
//        System.out.println("area of triangle:" + area);

        // post and pre increment
        int abc = 2;
        int y = abc++;
        System.out.println(y);
    }
}