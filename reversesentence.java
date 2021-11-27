import java.util.Scanner;

public class reversesentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split(" ");
        String r = "";
        for (int i = a.length - 1; i >= 0; i--) {
            r += a[i] + " ";
        }
        System.out.println(r);

    }

}
