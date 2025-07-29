import java.util.Scanner;
import java.util.Random;
public class NUMBERGUESS {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("guess the number in between 1 to 100"  );
        int x =rand.nextInt(100)+1 ;

        while(true) {
            Scanner sc = new Scanner(System.in);
            int y = sc.nextInt();

            if (x == y) {
                System.out.println("you guessed it correctly");
                break;
            } else if (y > x) {
                System.out.println("you are guessing to high");
            } else if ((y / x) <= 0) {
                System.out.println("you are guessing to low");
            }
        }
 
