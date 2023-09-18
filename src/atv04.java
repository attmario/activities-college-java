import java.util.Scanner;

public class atv04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double saque = 0, deposito = 0 ,saldo = 0;
        System.out.println("Qual o valor a ser sacado? ");
        saque = scan.nextDouble();

        System.out.println("Qual o valor a ser depositado? ");
        deposito = scan.nextDouble();

        saldo = (deposito -  saque * 0.05);

        System.out.println("O saldo da conta é: " + saldo);


    }

}
