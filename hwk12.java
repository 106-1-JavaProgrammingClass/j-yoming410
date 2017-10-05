import java.util.Scanner;

public class hwk12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println((float) Math . round ( p * Math . pow ( 10, n) ) / Math . pow ( 10 , n ) );
    }
}