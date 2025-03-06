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

            System.out.println("Digite a data de vencimento no formato dd/MM/yyyy");
            String dataVencimento = sc.nextLine();

            FichaCadastro ficha = new FichaCadastro(nome, email, dataVencimento);
            fichaCadastros.add(ficha);

        }
        fichaCadastros.forEach(System.out::println);

        System.out.println("Deseja atualizar a data de vencimento de alguma conta? ");
        String resposta = sc.nextLine();
        //Fazer a alteração para while depois
        if (resposta.equals("SIM") || resposta.equals("sim")) {
            System.out.println("Digite o email da Ficha Cadastro");
            String email = sc.nextLine();
            FichaCadastro pesquisa = FichaCadastro.pesquisarCadastro(email, (ArrayList<FichaCadastro>) fichaCadastros);
             if (pesquisa != null) {
                    System.out.println("Cadastro encontrado:\n" + pesquisa);
                } else {
                    System.out.println("Cadastro não encontrado.");
                }

            System.out.println("Digite a data de vencimento no formato dd/MM/yyyy");
            String dataVencimento = sc.nextLine();
            pesquisa.setDataVencimento(dataVencimento);
            System.out.println(pesquisa);

        }else {
            System.out.println("Fim");
        }


//        FichaCadastro pesquisa = FichaCadastro.pesquisarCadastro("teste1-", (ArrayList<FichaCadastro>) fichaCadastros);



        // Ser possivel apenas alterar a data de vencimento da ficha

        sc.close();
    }
}