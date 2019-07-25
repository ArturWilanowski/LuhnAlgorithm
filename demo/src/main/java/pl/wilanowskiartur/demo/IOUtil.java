package pl.wilanowskiartur.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The utility class that retrieves and prints the message
 */
public class IOUtil {

    /**
     * The method accepts the value of the input number
     *
     * @return inputNumber
     * @since 1.0
     */
    public static String getInputNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputNumber = reader.readLine();
        reader.close();
        return inputNumber;
    }

    /**
     * The method print some message
     *
     * @param message The user message
     *
     */
    public static void printToConsole(String message) {
        System.out.print(message);
    }
}
