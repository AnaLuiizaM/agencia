package br.com.senai.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import br.com.senai.enuns.Genero;

public class Candidato {
    public String nomeCompleto;
    public LocalDate dataNascimento;
    public String cpf;
    public String email;
    public Genero genero;
    public String naturalidade;
    public String nacionaliodade;
    public Endereco endereco;
    public List<Escolaridade> escolaridade = new ArrayList<>();  

    public int calcularidade() {
        return Period.between(this.dataNascimento, 
        LocalDate.now()).getYears();
    }
    public String eMaiorDeIdade() {
        return calcularidade() >= 18 ? "Sim" : "Nâo";
    }
}

