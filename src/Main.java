import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /**
        String str = "Java";

        char []c = {'a', 'b', 'c'};
        String str1 = new String(c); // object will be created in heap

        byte []b = {65, 66, 67};
        String str2 = new String(b);
        System.out.println(str2);

        String str3 = new String("JAVA");
         **/

        String str1 = "Python";
        String str2 = new String ("python");
        System.out.println(str1 == str2);

        String str3 = "Python";

        System.out.println(str1 == str3);

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java").intern();
        System.out.println((s1 == s2)+", String are equal."); // true
        System.out.println((s1 == s3)+", String are not equal."); // false
        System.out.println((s1 == s4)+", String are equal."); // true
    }
}