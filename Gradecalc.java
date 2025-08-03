import java.util.Scanner;

public class Gradecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter numbers of subjects");
        int n = sc.nextInt();
        
        float sum = 0;
        for(int i =1;i<=n;i++){
            System.out.print("enter marks of subject"+" "+i+" "+":");
            float marks = sc.nextFloat();
            sum+=marks;
        }
        float avg = (sum/n);
        if (avg>=89&&avg<100){
            System.out.println(avg+" "+"A+");
        } else if (avg>=79&&avg<89) {
            System.out.println(avg+" "+"A");
        } else if (avg>=70&&avg<79) {
            System.out.println(avg+" "+"B+");
        }else if (avg>=60&&avg<69){
            System.out.println(avg+" "+"B");
        } else if (avg>=55&&avg<59) {
            System.out.println(avg+" "+"C+") ;
        } else if (avg>=50&&avg<54) {
            System.out.println(avg+" "+"C");
        }else {
            System.out.println(avg+" "+"F");
            System.out.println("you have failed your exam");
        }

    }
}

