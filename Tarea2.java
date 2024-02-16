package com.mycompany.tarea2;

import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Matemática");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        try {
            switch (operacion) {
                case '+':
                    resultado = sumar(num1, num2);
                    break;
                case '-':
                    resultado = restar(num1, num2);
                    break;
                case '*':
                    resultado = multiplicar(num1, num2);
                    break;
                case '/':
                    resultado = dividir(num1, num2);
                    break;
                default:
                    System.out.println("Operación no válida");
                    return;
            }

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado.");
        } finally {
            scanner.close();
        }
    }

    private static double sumar(double a, double b) {
        return a + b;
    }

    private static double restar(double a, double b) {
        return a - b;
    }

    private static double multiplicar(double a, double b) {
        return a * b;
    }

    private static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }
}
