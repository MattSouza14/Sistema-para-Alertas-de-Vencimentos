package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FichaCadastro {
    String nome;
    String email;
    String dataVencimento;

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public FichaCadastro() {

    }
    public FichaCadastro(String nome, String email, String dataVencimento) {
        this.nome = nome;
        this.email = email;
        this.dataVencimento = dataVencimento;

    }
    public FichaCadastro(String email, String dataVencimento){
        this.email = email;
        this.dataVencimento = dataVencimento;
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
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = fmt1.format(LocalDate.parse(dataVencimento, fmt1));

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome + "\n");
        sb.append(email + "\n");
        sb.append(dataVencimento + "\n");


        return  sb.toString();
    }
}
