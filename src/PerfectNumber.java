public class PerfectNumber {
    public static void main(String[] args) {

        // test cases
        isPerfectNumber(8128);
        isPerfectNumber(6);
        isPerfectNumber(-1);
        isPerfectNumber(1);
        isPerfectNumber(24);

    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) { // testing the number as it must be greater than 1
            System.out.println("The number must be greater than 1.");
            return false;
        }


        int isPerfectNumber = 0;
        for(int i = 1; i < number; i++) { // loop to find all divisors not including the number

            if (number % i == 0){ // tests if divisor is a whole number
                isPerfectNumber += i; // adds the divisor and continues the loop
            }
        }

        if (isPerfectNumber == number) { // tests if all divisors equal the original number
            System.out.println(number + " is a perfect number!");
            return true;
        }
        System.out.println(number + " is not perfect number!");
        return false;
    }
}
