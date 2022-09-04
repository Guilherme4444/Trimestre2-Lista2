import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int num = entrada.nextInt();

        int f = 1;

        for (int i = 1; i < num; i++) {
            f = f * (i+1);
        }

        System.out.println(f);
    }
}