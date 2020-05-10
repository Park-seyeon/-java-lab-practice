package practice;

public class StringMethod {

    public static void main(String[] args) {
        System.out.println(addString("0123456", 3, "-"));
        System.out.println(reverse("abc"));
        System.out.println(removeString("01001000", "00"));
    }

    public static String addString(String s1, int index, String s2) {
        return s1.substring(0, index + 1) + s2 + s1.substring(index + 1);
    }

    public static String reverse(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) result.insert(0, s.charAt(i));

        return result.toString();
    }

    public static String removeString(String s1, String s2) {
        return s1.replace(s2, "");
    }

}
