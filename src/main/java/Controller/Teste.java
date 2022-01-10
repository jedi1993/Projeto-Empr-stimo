package Controller;

import Dados.Emprestimo;
import Dados.Pessoa;

import java.io.IOException;

public class Teste {
    public static void main(String[] args) throws IOException {
        ExecuçaoEmprestimo execuçaoEmprestimo = new ExecuçaoEmprestimo();
        Pessoa pessoa = new Pessoa("Henrique","email@email.com","123456","122.222.333-33","39392929","Rua X","2222.22");
        execuçaoEmprestimo.cadastroDeClientes(pessoa);
        System.out.println(execuçaoEmprestimo.login("henri.oliveira.93@gmail.com","123456",new Pessoa("henri.oliveira.93@gmail.com","123456")));
        Emprestimo emprestimo = new Emprestimo("222",3330.50,1,2222.22,45) ;
        execuçaoEmprestimo.exibirEmprestimo(emprestimo);

    }
}
