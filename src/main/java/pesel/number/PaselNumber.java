package pesel.number;

import java.util.Scanner;

class PaselNumber {

    public static String NonrepeatingCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (str.indexOf(charAt) == str.lastIndexOf(charAt))
                return String.valueOf(charAt);
        }
        return "";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(NonrepeatingCharacter(s.nextLine()));
    }

}