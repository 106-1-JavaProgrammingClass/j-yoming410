import java.util.Scanner;

public class hwk15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int w = Integer.valueOf(str,16);
        System.out.println((char)w);
    }
}
