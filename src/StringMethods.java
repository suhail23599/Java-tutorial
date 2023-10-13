public class StringMethods {
    public static void main(String[] args) {
        String str = "Java";

        str = str.toLowerCase(); // str reference will be pointing to new object returned by toLowercase and this will be stored in heap
        System.out.println(str);

        System.out.println(str.length());

        System.out.println(str.charAt(0));

        System.out.println(str.indexOf("a"));

        String s1 = "aava";
        String s2 = "bython";
        char ch = 'j';
        System.out.println(+ch);
        System.out.println(s1.compareTo(s2));


        String strVal = "wall";
        System.out.println(strVal.contains("a"));
    }
}
