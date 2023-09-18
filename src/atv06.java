import java.util.Scanner;
public class atv06 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scan.nextInt();
        System.out.println("Digite um número: ");
        int n2 = scan.nextInt();
        System.out.println("Digite um número: ");
        int n3 = scan.nextInt();

        if (n2 > n1) {
            n1 = n2;
        }
        if (n3 > n1) {
            n1 = n3;
        }
        System.out.println("O maior numéro é o: " + n1);

    }
}