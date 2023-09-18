import java.util.Scanner;

public class atv05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1 = 0, nota2 = 0, media = 0;

        System.out.println("Digite sua primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        nota2 = scan.nextDouble();

        media = ((nota1 + nota2) / 2);
        System.out.println("A nota parcial é igual a: " + media);

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 9) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
