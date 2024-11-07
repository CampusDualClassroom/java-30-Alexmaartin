package com.campusdual.classroom;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Exercise30 {
    public static int divisionWithCustomException(int numerator, int denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("Error: El denominador no puede ser cero.");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            int result = divisionWithCustomException(10, 0);

            System.out.println("Resultado de la división: " + result);

        } catch (DivisionByZeroException e) {

            System.out.println("Se ha producido una excepción personalizada: " + e.getMessage());
        }
        System.out.println("El programa sigue ejecutándose evitando su propagación.");
    }
}
