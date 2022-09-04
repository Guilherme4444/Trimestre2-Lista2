package Ex5;

import java.util.Scanner;

public class mainEx5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Agenda[] agenda = new Agenda[10];
        int countAgendas = 0;

        int opcao = 0;

        do {

            System.out.println("\nDigite 1 para adicionar contato.");
            System.out.println("Digite 2 para buscar contato.");
            System.out.println("Digite 3 para remover contato.");
            System.out.println("Digite 4 para editar o contato.");
            System.out.println("Digite 0 para encerrar o programa.");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    if (countAgendas < agenda.length) {
                        System.out.print("\nDigite o nome: ");
                        String nome = entrada.nextLine();
                        System.out.print("Digite o número: ");
                        int contato = entrada.nextInt();

                        Agenda a = new Agenda(nome, contato);
                        agenda[countAgendas] = a;
                        countAgendas++;
                    }
                    break;
                case 2:
                    System.out.print("\nDigite o contato: ");
                    int contato = entrada.nextInt();

                    for (Agenda obj: agenda) {
                        if (obj != null) {
                            if (obj.getContato() == contato) {
                                System.out.println(obj);

                            } else {
                                System.out.println("Contato não encontrado.");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("\nDigite o contato: ");
                    contato = entrada.nextInt();

                    for (int i = 0; i < agenda.length; i++) {
                        if (agenda[i] != null) {
                            if (agenda[i].getContato() == contato) {
                                agenda[i] = null;
                                //obj = null;
                                //obj = new Agenda();
                                i = agenda.length;
                            }
                        } else {
                            System.out.println("Contato não encontrado.");
                            i = agenda.length;
                        }
                    }
                    break;
                case 4:
                    System.out.print("\nDigite o número do contato que deseja editar: ");
                    contato = entrada.nextInt();
                    entrada.nextLine();

                    for (Agenda obj: agenda) {
                        if (obj != null) {
                            if (obj.getContato() == contato) {
                                System.out.print("O que deseja editar: nome, numero ou ambos ");
                                String editar = entrada.nextLine();

                                switch (editar) {
                                    case "nome":
                                        System.out.print("\nDigite o novo nome: ");
                                        String nome = entrada.nextLine();
                                        obj.setNome(nome);

                                    case "numero":
                                        System.out.print("\nDigite o novo numero: ");
                                        nome = entrada.nextLine();
                                        obj.setContato(contato);

                                    case "ambos":
                                        System.out.print("\nDigite o novo nome: ");
                                        nome = entrada.nextLine();
                                        System.out.print("Digite o novo numero: ");
                                        contato = entrada.nextInt();
                                        obj.setNome(nome);
                                        obj.setContato(contato);
                                }
                            } else {
                                System.out.println("Contato não encontrado.");
                            }
                        }
                    }
                    break;
            }

        } while (opcao != 0);
    }
}