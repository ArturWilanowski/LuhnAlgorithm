package pl.wilanowskiartur.demo;


/**
 *  Luhn's algorithm
 */
public class LuhnAlgorithmUtil {

    /**
     * The maximum number value
     */
    public static final int LUHN_LIMIT = 9;

    /**
     *  Checking if the number provided is validated
     *
     * @param  inputNumber the number coming from the user
     * @return result number attached to the final result
     */
    public static int isValidNumber(String inputNumber) {
        int[] numberForValidation = convertStringToArrayOfDigits(inputNumber);

        for (int i = numberForValidation.length - 1; i >= 0; i--) {
            if (numberForValidation.length % 2 == 0) {
                if (i % 2 != 0) continue;
                numberForValidation[i] = modifyData(numberForValidation[i]);
            } else {
                if (i % 2 == 0) continue;
                numberForValidation[i] = modifyData(numberForValidation[i]);
            }
        }
        int sumOfDigits = 0;
        for (int digit : numberForValidation) {
            sumOfDigits += digit;
        }
        int result = sumOfDigits % 10;

        return result;
    }

    /**
     *  Replacing String with an int array
     *
     * @param  inputNumber the number coming from the user
     * @return numberBuffer converted number to int tables
     */
    private static int[] convertStringToArrayOfDigits(String inputNumber) {
        String[] tempStringArray = inputNumber.split("");
        int[] numberBuffer = new int[tempStringArray.length];
        int i = 0;
        for (String str : tempStringArray) {
            numberBuffer[i] = Integer.parseInt(str);
            i++;
        }
        return numberBuffer;
    }

    /**
     *  Modulating the number
     *
     * @param  digit single digit from the int array
     * @return digit after multiplying and modulating
     */
    private static int modifyData(int digit) {
        digit *= 2;
        if (digit > LUHN_LIMIT) {
            digit = digit % 10 + digit / 10;
        }
        return digit;
    }
}

