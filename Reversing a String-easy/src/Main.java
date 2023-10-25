import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = getStr();
        System.out.println(reverse(str));
    }

    public static String getStr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        return sc.nextLine();
    }


    public static String reverse(String str){
        StringBuilder newStr = new StringBuilder();
        for (int i = (str.length() - 1); i >= 0; i--)
            newStr.append(str.charAt(i));
        return newStr.toString();
    }
}