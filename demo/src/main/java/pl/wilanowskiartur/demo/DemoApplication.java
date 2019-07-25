package pl.wilanowskiartur.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @author      Artur Wilanowski
 * @version     1.0
 * @since       1.0
 */
@SpringBootApplication
public class DemoApplication {

	/**
	 * This method is used which start method
	 * @param args arguments forwarded when the program started
	 */
	public static void main(String[] args) throws IOException {

		SpringApplication.run(DemoApplication.class, args);
		NumberValidator numberValidator = new NumberValidator();

		IOUtil.printToConsole("Please, enter the digit: ");
		String input = IOUtil.getInputNumber();
		numberValidator.verifyInputNumber(input);
		int controlNumber = LuhnAlgorithmUtil.isValidNumber(input);

		IOUtil.printToConsole("Digit with control number: " + input + "" + controlNumber);

	}

}
