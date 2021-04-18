import java.util.Scanner;

public class ConSec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the seconds: ");
        double seconds = in.nextDouble();
        double sec = seconds % 60;
        double hours = seconds / 60;
        double x = hours % 60;
        hours = hours / 60;
        System.out.print(hours + ":" + x + ":" + sec);

    }
}
