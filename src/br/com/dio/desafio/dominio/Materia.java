package br.com.dio.desafio.dominio;

public class Materia extends Conteudo{

    private int notaProva;

    @Override
    public double calcularXp() {
        return PESO_PADRAO * notaProva;
    }

    public Materia() {
    }


    public int getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(int notaProva) {
        this.notaProva = notaProva;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", notaProva=" + notaProva +
                '}';
    }
}
