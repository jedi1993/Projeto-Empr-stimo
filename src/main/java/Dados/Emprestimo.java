package Dados;

import java.util.Date;

public class Emprestimo {
    private String codigo;
    private double valor;
    private int quantidade;
    private double renda;
    private int parcelas;

    public Emprestimo(String codigo, double valor, int quantidade,  double renda, int parcelas) {
        this.codigo = codigo;
        this.valor = valor;
        this.quantidade = quantidade;
        this.renda = renda;
        this.parcelas = parcelas;
    }

    public Emprestimo() {
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Date getData() {
        Date date = new Date();
        return date;
    }


    public double getRenda() {
        return renda;
    }

    public int getParcelas() {
        return parcelas;
    }

    @Override
    public String toString() {
        return "DetalheEmprestimo{" +
                "codigo='" + codigo + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                ", renda=" + renda +
                ", parcelas=" + parcelas +
                '}';
    }
}


