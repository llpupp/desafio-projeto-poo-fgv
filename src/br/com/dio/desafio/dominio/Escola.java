package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public class Escola {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();//data atual quando instanciar e final pq não se pode alterar datas
    private final LocalDate dataFinal = dataInicial.plusDays(90);
    //uso abaixo de Polimorfismo - criado HashSet a partir de um Set
    //uso abaixo de Polimorfismo - criado LinkedHashSet a partir de um Set
    private Set<Aluno> alunosInscritos = new HashSet<>();// ordem não relevante porém os devs não se repetem (são únicos)
    private Set<Conteudo> conteudos = new LinkedHashSet<>();//usa-se LinkedHashSet pq a ordem dos conteúdos no bootcamp é importante

    //inclusão dos Getters & Setters (uso do Alt Insert)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(Set<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    //como estamos trabalhando com Hash, devo usar aqui o equals & hash Code (usar Alt Insert)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Escola escola = (Escola) o;
        return Objects.equals(nome, escola.nome) && Objects.equals(descricao, escola.descricao) && Objects.equals(dataInicial, escola.dataInicial) && Objects.equals(dataFinal, escola.dataFinal) && Objects.equals(alunosInscritos, escola.alunosInscritos) && Objects.equals(conteudos, escola.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, alunosInscritos, conteudos);
    }
}
