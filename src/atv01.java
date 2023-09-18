import java.util.Scanner;
public class atv01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        double salario = scan.nextDouble();

        double b = (salario + (salario/100) * 20);
        double c = (salario +(salario/100) * 15);
        double d = (salario + (salario/100) * 10);
        double e = (salario + (salario/100) * 5);


        if (salario <= 280){
            System.out.println("Salário antes do reajuste: "  + salario + "\n" + "Aumento de: 20% " + "\n" + "Novo salário: " + b );
        }
        else if (salario <= 700) {
            System.out.println("Salário antes do reajuste: "  + salario + "\n" + "Aumento de: 15% " + "\n" + "Novo salário: " + c );

        }

        if (salario <= 1500){
            System.out.println("Salário antes do reajuste: "  + salario + "\n" + "Aumento de: 10% " + "\n" + "Novo salário: " + d );
        }
        else if (salario > 1500) {
            System.out.println("Salário antes do reajuste: "  + salario + "\n" + "Aumento de: 5% " + "\n" + "Novo salário: " + e );
        }


    }
}
