package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FichaCadastro {
    private String nome;
    private String email;
    private LocalDate dataVencimento;

    private static final DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public FichaCadastro() {}

    public FichaCadastro(String nome, String email, String dataVencimento) {
        this.nome = nome;
        this.email = email;
        setDataVencimento(dataVencimento);
    }

    public FichaCadastro(String email, String dataVencimento) {
        this.email = email;
        setDataVencimento(dataVencimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataVencimento() {
        return dataVencimento != null ? dataVencimento.format(fmt1) : "Data invalida";
    }

    public void setDataVencimento(String dataVencimento) {
        try {
            this.dataVencimento = LocalDate.parse(dataVencimento, fmt1);
        } catch (Exception e) {
            System.err.println("Erro ao definir data de vencimento: formato invalido (" + dataVencimento + ")");
            this.dataVencimento = null;
        }
    }

//    public static ArrayList<FichaCadastro> ListarCadastros() {
//    }
//    public static String adicionarNovoCadastro(){
//
//    }

    public static FichaCadastro pesquisarCadastro(String email, ArrayList<FichaCadastro> cadastros) {
        return cadastros.stream()//Transforma a lista em Stream
                .filter(f -> f.getEmail().equalsIgnoreCase(email))//Compara os emails ignorando maiusculas e minusculas
                .findFirst() //Pega o primeiro elemento que corresponde ao filtro (se existir).Se houver varios cadastros com o mesmo email, somente o primeiro encontrado será retornado.
                .orElse(null);//Se nenhum cadastro for encontrado vai retornar null.
    }

    @Override
    public String toString() {
        return String.format(
                "Nome do Usuario: %s%nConta Office: %s%nData de Vencimento: %s",
                nome, email, dataVencimento != null ? dataVencimento.format(fmt1) : "Data invalida"
        );
    }
}
