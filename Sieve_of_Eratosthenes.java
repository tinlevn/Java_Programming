//Sieve of Eratosthenes homework
import java.util.Scanner;
import java.util.Arrays;
public class Sieve_of_Eratosthenes {

    public static void main(String [] args) {

        int startVal;
        int stopVal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Sieve of Eratosthenes program! ");

        if(args.length == 1) {
            startVal = Integer.parseInt(args[0]);;
            System.out.print("Please enter the stop value: ");
            stopVal = scanner.nextInt();
        }
        else if (args.length == 2) {
            startVal = Integer.parseInt(args[0]);
            stopVal = Integer.parseInt(args[1]);

        }
        else {
            System.out.print("Please enter the start value (greater than 1): ");
            startVal = scanner.nextInt();
            System.out.print("Please enter the stop value: ");
            stopVal = scanner.nextInt();
        }
        if(startVal>3 && stopVal>startVal){
            int num1=sieveOfEratosthenes(startVal);
            int num2=sieveOfEratosthenes(stopVal);
            System.out.printf("Primes betweeen %d and %d is %d:", startVal,stopVal,num2-num1);
        }
        else if(stopVal>2){
            System.out.printf("Primes between 2 and %d: %d",stopVal,sieveOfEratosthenes(stopVal));
        }
        else
            System.exit(0);
    }

    public static int sieveOfEratosthenes(int end){

        boolean[] sieveArray = new boolean[end+1];
        Arrays.fill(sieveArray, true);

        for (int num = 2; num * num <= end; num++) {
            if (sieveArray[num]) {
                for (int i = num*num; i <= end; i+=num)
                    sieveArray[i] = false;
            }
        }
        // count primes
        int primes = 0;
        for (int i = 2; i <= end; i++) {
            if (sieveArray[i]) primes++;
        }
        return primes;
    }
}
