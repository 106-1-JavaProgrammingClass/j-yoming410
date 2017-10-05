
import java.util.Scanner;

public class hwk11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(Math.max(Math.max(x,y),z));
        System.out.println(Math.min(Math.min(x,y),z));
    }
}

