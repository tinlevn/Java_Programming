/*Tin Le 
CS533-Homework 2
*/
package gradleproject1;
import java.util.Scanner;
/**
 *
 * @author TinGiangVN
 */
public class Main {
    static final double PI=3.14159;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int radius;
        System.out.println("Please enter a circle's radius: ");
        radius=in.nextInt();//input radius as integer
        /*Printing the calculation and not storing the values
        in variables
        */
        System.out.printf("The diameter of this circle is: %d\n", 2*radius);
        System.out.printf("The circumference of this circle is: %.4f\n", 2*PI*radius);
        System.out.printf("The area of the circle is: %.4f\n", PI*radius*radius);
        in.close();
    }
    
}
