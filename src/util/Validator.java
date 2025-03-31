package util;

import java.util.regex.Pattern;

public class Validator {

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isFloat(String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isBoolean(String input) {
        return "true".equalsIgnoreCase(input) || "false".equalsIgnoreCase(input);
    }

    public static boolean isValidString(String input, int min, int max) {
        if (input == null) {
            return false;
        }
        input = input.trim();
        return !input.isEmpty() && input.length() >= min && input.length() <= max;
    }

    public static boolean isValidEmail(String input) {
        if (input == null) {
            return false;
        }
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.matches(emailRegex, input);
    }

    public static boolean isValidPhone(String input) {
        if (input == null) {
            return false;
        }
        String phoneRegex = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[1-9]|9[0-9])[0-9]{7}$";
        return Pattern.matches(phoneRegex, input);
    }
}