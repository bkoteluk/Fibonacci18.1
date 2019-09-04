package pl.bkoteluk.fibonacci.service;

public class FibonacciService {

    public int sumEvenFromFibonacci(int maxNumber) {
        int prevNumber = 1;
        int nextNumber = 2;
        int sum = 0;
        while (isNumberSmallerThenMaxNumber(nextNumber, maxNumber)) {
            if (isEven(nextNumber)) {
                sum += nextNumber;
            }
            int tempNumber = nextNumber;
            nextNumber = nextFibonacciNumber(prevNumber, nextNumber);
            prevNumber = tempNumber;
        }
        return sum;
    }

    protected boolean isEven(int number) {
        return number%2 == 0;
    }

    private boolean isNumberSmallerThenMaxNumber(int number, int maxNumber) {
        return number < maxNumber;
    }

    private int nextFibonacciNumber(int prevNumber, int nextNumber) {
        return prevNumber+nextNumber;
    }
}
