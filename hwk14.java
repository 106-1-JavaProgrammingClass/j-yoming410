import java.util.Scanner;

public class hwk14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int x = (int) ch;
        System.out.println(Integer.toHexString(x));
    }
}