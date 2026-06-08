public class StringCounter {

    public static int strCount(String str, char symbol) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(strCount("ooooHhgfhhgootrohoho", 'o'));
        System.out.println(strCount("Hello", 'l'));
        System.out.println(strCount("", 'z'));
    }
}