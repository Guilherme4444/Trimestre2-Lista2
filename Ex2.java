import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número entre 0 e 100, para ver se é PAR ou IMPAR: ");
        float num = entrada.nextFloat();

        if (num >= 0 && num <= 100) {
            if (num % 2 == 0) {
                System.out.println("Esse número é par");
            } else {
                System.out.println("Esse número é ímpar");
            }
        }
    }
}