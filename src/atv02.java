import java.util.Scanner;
public class atv02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("1. Média aritmética");
        System.out.println("2. Média ponderada");
        System.out.println("3. sair");
        System.out.println("escolha uma altenativa acima: ");
        int op = scan.nextInt();

        switch (op){
            case 1:
                System.out.println("Digite  a primera nota: ");
                double nota1 = scan.nextDouble();
                System.out.println("Digite  a segunda nota: ");
                double nota2 = scan.nextDouble();
                double media1 = ((nota1 + nota2)/2);
                System.out.println("Sua média aritmética é igual: " + media1);
                break;

            case 2:
                System.out.println("Digite uma nota: ");
                double nota3 = scan.nextDouble();
                System.out.println("Digite outra nota: ");
                double nota4 = scan.nextDouble();
                System.out.println("Por ultimo digite mais uma nota: ");
                double nota5 = scan.nextDouble();
                double media2 = ((nota3 * 1) + (nota4 * 2) + (nota5 * 3)) / 6;
                System.out.println("A média ponderada é igual: " + media2);
                break;



            default:
                System.out.println("Fim do programa");


        }


    }
}
