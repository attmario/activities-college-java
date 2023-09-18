import java.util.Scanner;

public class atv03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double catetoa = 0, catetob = 0,i,r;
        System.out.println("Digite o valor do cateto A: ");
        catetoa = scan.nextDouble();
        System.out.println("Digite o valor do cateto B: ");
        catetob = scan.nextDouble();

        i = (Math.pow(catetoa,2)) + (Math.pow(catetob,2));
        r = Math.sqrt(i);
        System.out.println("A hipotenusa do triângulo é: " + r);
    }
}