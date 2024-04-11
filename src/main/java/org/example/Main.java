package org.example;

public class Main {
    public static void main(String[] args) {
    int n = 100;//Starting value in this case 100 because we are looking for the sum between 0 and 100
    SinglyLinkedList allPrimes = new SinglyLinkedList();
    SinglyLinkedList primesWithThree = new SinglyLinkedList();
        //These each initizalize their own lists with one being all the prime numbers and the other only tallying the primes with 3
    for (int i = 2; i <= n; i++) {
        if (isPrime(i)) {
            allPrimes.add(i);
            //Checks if it is prime and adds to the main list, then if it is it checks if it has a 3 digit and if yes adds to the 3digit list
            if (containsDigit(i, 3)) {
                primesWithThree.add(i);
            }
        }
    }

    int sumOfPrimesWithThree = primesWithThree.sum();//Makes an integer of the sum using a new int and the sum method to print it out
    System.out.println("Sum of prime numbers with digit 3 between 0 and " + n + ": " + sumOfPrimesWithThree);
        //Prints out a statement and the total
    }
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }//Method used to check if a number is prime
        return true;
    }

    private static boolean containsDigit(int num, int digit) {
        while (num > 0) {
            if (num % 10 == digit) {
                return true;
                //Checks if it has the three digit
            }
            num /= 10;
        }
        return false;
    }
}
