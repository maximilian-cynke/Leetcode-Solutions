public class RomanToInteger {

    public static void main(String[] args) {

        System.out.println(task("MCMXCIV"));

    }


    public static int task(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {

            char s1 = roman.charAt(i);
            if (i + 1 < roman.length()) {
                char s2 = roman.charAt(i + 1);
                if (value(s2) > value(s1)) {
                    result = result + (value(s2) - value(s1));
                    i++;
                } else {
                    result = result + value(s1);
                }
            } else {
                result = result + value(s1);
            }

        }


        return result;
    }

    static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

}
