package br.com.dio.desafio.dominio;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Materia materia1 = new Materia();
        materia1.setTitulo("Recursos Humanos");
        materia1.setDescricao("Gestão de Pessoas");
        materia1.setNotaProva(5);

        Materia materia2 = new Materia();
        materia2.setTitulo("Projetos");
        materia2.setDescricao("Gestão de Projetos");
        materia2.setNotaProva(7);

        Materia materia3 = new Materia();
        materia3.setTitulo("Ciencias Sociais");
        materia3.setDescricao("Política");
        materia3.setNotaProva(6);

        // é só um exemplo --> Conteudo conteudo = new Curso(); // aqui é Polimorfismo
        // outro exemplo --> Conteudo conteudo1 = new trabalho(); tb é Polimorfismo

        /*System.out.println(materia1);
        System.out.println(materia2);
        */

        Escola escola = new Escola();
        escola.setNome("MBA - FGV - PROJETO ANGLO");
        escola.setDescricao("Master Business Administration");
        escola.getConteudos().add(materia1);
        escola.getConteudos().add(materia2);
        escola.getConteudos().add(materia3);
        System.out.println("Escola FGV - Master/CEAG:");

        Aluno alunoDavi = new Aluno();
        alunoDavi.setNome("Davi");
        alunoDavi.inscreverEscola(escola);
        System.out.println("Conteúdos Inscritos Davi:" + alunoDavi.getConteudosInscritos());
        alunoDavi.progredir();
        alunoDavi.progredir();

        System.out.println("-");

        System.out.println("Conteúdos Concluídos Davi:" + alunoDavi.getConteudosConcluidos());
        System.out.println("---" + "Davi perdeu a prova de Ciências Sociais" + "---");
        System.out.println("NOTA FINAL PIMEIRO BIMESTRE:" + alunoDavi.calcularTotalNOTA());
        System.out.println("-------");

        Aluno alunoAna = new Aluno();
        alunoAna.setNome("Ana");
        alunoAna.inscreverEscola(escola);
        System.out.println("Conteúdos Inscritos Ana:" + alunoAna.getConteudosInscritos());
        alunoAna.progredir();
        alunoAna.progredir();
        alunoAna.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Concluidos Ana:" + alunoAna.getConteudosConcluidos());
        System.out.println("NOTA FINAL PRIMEIRO BIMESTRE:" + alunoAna.calcularTotalNOTA());

    }
}
