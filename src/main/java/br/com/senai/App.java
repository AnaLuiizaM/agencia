package br.com.senai;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

import br.com.senai.enuns.Estado;
import br.com.senai.enuns.Genero;
import br.com.senai.models.Candidato;
import br.com.senai.models.Endereco;
import br.com.senai.models.Escolaridade; 

public class App {
    public static void main( String[] args ) {
        Endereco endereco = new Endereco();
        endereco.cep = "64000000";
        endereco.logradouro = "Rua Porto, 3555";
        endereco.cidade = "Teresina";
        endereco.estado = Estado.PI; 

        Candidato yasmin = new Candidato();
        yasmin.nomeCompleto = "Yasmin Ferreira de Oliveira";
        yasmin.dataNascimento = LocalDate.of(2000, 10, 16);
        yasmin.email = "yasminferreira@gmail.com";
        yasmin.genero = Genero.O;
        yasmin.naturalidade = Estado.PI.toString();
        yasmin.nacionaliodade = "Brasil";
        yasmin.endereco = endereco;

        Escolaridade e1 = new Escolaridade();
        e1.nomeCurso = "Sistema para Internet";
        e1.nomeInstituicao = "Senai";
        e1.dataInicio = LocalDate.of(2022, 10, 01);
        e1.dataFim = LocalDate.of(2023, 06, 18);


        Escolaridade e2 = new Escolaridade();
        e2.nomeCurso = "Jogos Digitais";
        e2.nomeInstituicao = "IFPI";
        e2.dataInicio = LocalDate.of(2022, 10, 01);
        e2.dataFim = LocalDate.of(2023, 06, 18);

       // List<Escolaridade> list = new ArrayList<>();
       // list.add(e1);
       // list.add(e2);

        yasmin.escolaridade = Arrays.asList(e1,e2); 



        System.out.println("Nome Completo: "+yasmin.nomeCompleto);
        System.out.println("Idade: "+Period.between(yasmin.dataNascimento, 
        LocalDate.now()).getYears());
        System.out.println("Genero: "+yasmin.genero);
        System.out.println("Nacionalidade é:  "+yasmin.nacionaliodade);
        System.out.println("Endereco: "+yasmin.endereco.logradouro);

        for (Escolaridade escolaridade : yasmin.escolaridade) {
            System.out.println(escolaridade.nomeCurso+" - "
            +escolaridade.nomeInstituicao);
        }
    }
}
