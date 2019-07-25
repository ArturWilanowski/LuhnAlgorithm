package pl.wilanowskiartur.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  Number validator
 */
public class NumberValidator implements Validator {

    static final Pattern ONLY_DIGITS_PATTERN = Pattern.compile("^[0-9]+");

    /**
     * @param inputNumber the number coming from the user
     */
    @Override
    public void verifyInputNumber(String inputNumber) {
        Matcher matcher = ONLY_DIGITS_PATTERN.matcher(inputNumber);
        if (!matcher.matches()) {
            throw new NumberException("[ERROR]: Only digits [0-9]!");
        }
    }
}
