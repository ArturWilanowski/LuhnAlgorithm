package pl.wilanowskiartur.demo;

/**
 *  Class that throws an exception to numbers
 */
public class NumberException extends RuntimeException {

    /**
     * Method that throws an exception to numbers
     * @param  message the number coming from the user
     *
     */
    public NumberException(String message) {
        super(message);
    }
}
