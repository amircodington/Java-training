import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int max = 0;
    private static int min = 0;

    public static void main(String[] args) {
        boolean play = true;

        int level = getLevel();
        switch (level){
            case 1:
                max = 20;
                break;
            case 2:
                max = 60;
                break;
            case 3:
                max = 100;
                break;
            default:
                play = false;
                System.out.println("Wrong input");

        }

        int number = generateRandomNumber(max, min);

        while (play){
            int userGuess = input("Guess number: ");
            if (userGuess > number)
                System.out.println("Number is lower");
            else if (userGuess < number)
                System.out.println("Number is upper");
            else {
                play = false;
                System.out.println("Bravo 👏");
            }
        }
    }

    public static int generateRandomNumber(int max, int min){
        Random randNum = new Random();
        return randNum.nextInt(max - min + 1) + min;
    }

    public static int input(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        return sc.nextInt();
    }

    public static int getLevel(){
        System.out.println("1. easy(0-20)\n2. normal(0-60)\n3. Hard(0-100)");
        return input("Choose level: ");
    }
}