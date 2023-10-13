public class RegEX {
    public static void main(String[] args) {
        String str1 = "a";
        System.out.println(str1.matches(".")); // true

        String str2 = "abcd";
        System.out.println(str2.matches(".")); // false since it has more than one char

        String str3 = "a";
        System.out.println(str3.matches("[abc]")); // true checks exactly for a or b or c

        String str4 = "abc";
        System.out.println(str4.matches("[abc]")); // false because string has abc, which is more than one char it has to check

        String str5 = "p";
        System.out.println(str5.matches("[a-z]")); // true
        System.out.println(str5.matches("[a-z0-9A-Z]")); // true  a-z/0-9/A-Z

        String str6 = "p23";
        System.out.println(str6.matches("[a-z][0-9][0-9]")); //true

        //Quantifiers
        String var1 = "hello world";
        System.out.println(var1.matches(".*")); // true

        String var2 = "abcdef";
        System.out.println(var2.matches("[a-z]*")); // true

        String var3 = "abc";
        System.out.println(var3.matches("[abc]*")); // true only either a/b/c

        String var4 = "accb";
        System.out.println(var4.matches("[abc]{4}")); // a/b/c exactly 4 times

        String var5 = "jhon@gmail.com";
        System.out.println(var5.matches(".*gmail.*"));

        System.out.println(var5.matches("\\w*@gmail.*")); //true only alphabet or digit


        String var6 = "programmer@gmail.com"; // check if email is on gmail
        System.out.println(var6.matches(".*gmail.*"));

        //find username and domain
        int index = var6.indexOf('@');
        String user = var6.substring(0, index);
        String domain = var6.substring(index+1, var6.length());
        System.out.println(user);
        System.out.println(domain);

        // Q.Find if number is binary or not
        String binary = "1010";
        System.out.println(binary.matches("[10]*"));

        // Q.Find if number is hexadecimal or not
        String hex = "018934AB";
        System.out.println(hex.matches("[0-9]*[A-Z]*")); // true
        System.out.println(hex.matches("[0-9A-Z]*")); //true

        // Q.Find date is in this format or not dd/mm/yyyy
        String date = "22/03/2022";
        System.out.println(date.matches("[0-3][1-9]/[0-1][0-9]/[0-9]{4}"));

        // Q.Remove special chars from string
        String s = "wert!fnjfn@";
        System.out.println(s.replaceAll("[^0-9a-zA-Z]", ""));

        // Q.Remove extra space from string
        String s2 = "nfjfn fmkfn kkf";
        System.out.println(s2.replaceAll("\\s", ""));

        // Q. Find number of words in a string
        String s3 = "nvjvn mvkmf";
        String []words = s3.split("\\s");
        System.out.println(words.length);

    }
}
