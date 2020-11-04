package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class DivisionByZeroException extends Exception {
    @Override
    public String getMessage() {
        return "Ділення на нуль забороненно!";
    }
}
class ExceptionDemo {
    private static double divide (double dividend, double divisor)
        throws DivisionByZeroException {

        if (divisor == 0)
            throw new DivisionByZeroException();
        return dividend / divisor;
    } // divide() method

    public static void main(String[] args) {
        try {
            divide (8, 0);
        } catch (DivisionByZeroException dz) {
            System.out.println(dz.getMessage());
        }
    } // main(String[]) method
} // ExceptionDemo class