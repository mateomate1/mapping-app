package io.github.mateomate1.Errors;

public class ArrayLengthException extends IllegalArgumentException {
    public ArrayLengthException(byte dimensions) {
        super("The array must have " + dimensions + " dimensions");
    }
}
