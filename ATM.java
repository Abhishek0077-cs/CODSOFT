import java.util.*;
public class ATM {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //taking sample data
        String Id ="codsoft123";
        String pin ="123";
        float balance = 1000;


        System.out.println("==== Welcome to codsoft banking system ====");
        System.out.print("Enter user id :- ");
        String Id1 = sc.next();
        System.out.print("Enter password :- ");
        String pin2 = sc.next();
        if (Id.equals(Id1) && pin.equals(pin2)){
            int choice;
            do {
                System.out.println("\n*Atm menu*");
                System.out.println("press 1 to check balance");
                System.out.println("press 2 for deposit");
                System.out.println("press 3 to withdraw");
                System.out.println("press 4 to exit");
                System.out.print("choose an option : ");
                choice = sc.nextInt();

                //using switch
                switch (choice) {
                    case 1:
                        System.out.println("current bankbalance : $" + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount you like to deposit : ");
                        float deposit = sc.nextFloat();
                        balance += deposit;
                        System.out.println("Thanks for choosing codsoft banking");
                        break;

                    case 3:
                        System.out.print("Enter amount you want to withdraw : ");
                         float withdraw = sc.nextFloat();
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("your withdraw was  suceesful. ");
                        } else {
                            System.out.println("Insufficient amount entered");

                        }
                        break;

                    case 4:
                        System.out.println("Thankyou for using codsoft ATM. ");
                        break;

                    default:
                        System.out.println("Invalid request had been made");
                }

            } while (choice !=4);

            }
        else{
            System.out.println("Invalid credentials had been entered");
        }
    }
}
