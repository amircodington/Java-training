import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = getNumber("A");
        int b = getNumber("B");
        System.out.println("A + B = " + (a + b));
    }

    public static int getNumber(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + msg + ": ");
        int number = Integer.parseInt(sc.nextLine());
        return number;
    }
}