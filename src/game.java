import java.util.Random;
import java.util.Scanner;

public class game {
    public static  void main(String[] args){
        int num1;
        int num2;
        boolean boo = true;


        Scanner input = new Scanner(System.in);
        Random rm = new Random();
        num2 = rm.nextInt(10);
        System.out.println("I am thinking about a number between 1 and 10...");
        System.out.println("Can you guess it?");
        num1 = input.nextInt();
        while (boo == true){
            if(num1 == num2){
                System.out.println("That's right! You are a good guesser.");
                boo = false;
            }
            else if(num1 > num2){
                System.out.println("It's too high. Guess again.");
                num1 = input.nextInt();
            }else{
                System.out.println("It's too low. Guess again.");
                num1 = input.nextInt();
            }
        }





    }
}
