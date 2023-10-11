import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;
        float f = 4.2f;
        char c = '2';
        double d = 10;
        boolean bl = false;

//       b = s; not possible
        s = b;
        f = i;
        i = c;
//        c = b; not possible, character we can assign only interger/character, they are not compatible
        System.out.println(i);

    }
}