import java.util.Scanner;

public class usBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k,n;
        int total=1;

        System.out.println("Üssünü almak istediğiniz sayıyı giriniz: ");
        n = input.nextInt();

        System.out.println("Üs olacak sayıyı giriniz: ");
        k = input.nextInt();

        for (int i=1; i<=k; i++) {
            total *= n;
        }

        System.out.println(n + "'in "  + k + "'ninci kuvveti " + total + "'dir.");
    }
}
