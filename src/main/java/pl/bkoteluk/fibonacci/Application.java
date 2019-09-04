package pl.bkoteluk.fibonacci;

import pl.bkoteluk.service.FibonacciService;

public class Application {
    public static void main(String[] args) {
        int maxNumber = 4_000_000;
        FibonacciService fibonacci = new FibonacciService();
        System.out.println("Suma liczb parzystych w ciągu Fibonacziego ( dla liczb do "
                + maxNumber+ " ) wynosi: " + fibonacci.sumEvenFromFibonacci(maxNumber));
    }
}
