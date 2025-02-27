import model.FichaCadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<FichaCadastro> fichaCadastros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome do Ficha Cadastro");
            String nome = sc.nextLine();

            System.out.println("Digite o email da Ficha Cadastro");
            String email = sc.nextLine();

            System.out.println("Digite a data de vencimento no formato yyyy-MM-dd");
            String dataVencimento = sc.nextLine();

            FichaCadastro ficha = new FichaCadastro(nome, email, dataVencimento);
            fichaCadastros.add(ficha);

        }
        fichaCadastros.forEach(System.out::println);

        // Ser possivel apenas alterar a data de vencimento da ficha

        sc.close();
    }
}