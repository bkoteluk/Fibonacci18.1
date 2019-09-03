package pl.bkoteluk.Service;

public class Fibonacci {
    public static int MAX_NUMBER = 4_000_000;

    public boolean isEven(int number) {
        return number%2 == 0;
    }

    public boolean isNumberSmallerThenMaxNumber(int number, int maxNumber) {
        return number < maxNumber;
    }

    public int nextFibonacciNumber(int prevNumber, int nextNumber) {
        return prevNumber+nextNumber;
    }

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

}
