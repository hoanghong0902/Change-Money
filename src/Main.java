import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 23000;
        System.out.println("Enter USD: ");
        float usd = scanner.nextFloat();
        long vnd = (long) (usd * rate);
        System.out.println("VND = " + vnd);
    }
}