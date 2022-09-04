package Ex9;

import java.util.Scanner;

public class PrincipalEx9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        lampada l = new lampada();
        int opcao = 0;

        do {

            System.out.println("\nDigite 1 para verificar o estado da lâmpada");
            System.out.println("Digite 2 para acender a lampada");
            System.out.println("Digite 3 para apagar a lampada");
            System.out.println("Digite 0 para sair do programa");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    l.estado();
                    break;
                case 2:
                    l.setLigado(true);
                    break;
                case 3:
                    l.setLigado(false);
                    break;
            }

        } while (opcao != 0);
    }
}