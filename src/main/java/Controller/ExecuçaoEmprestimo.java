package Controller;

import Dados.Emprestimo;
import Dados.Pessoa;



import java.util.Date;

public class ExecuçaoEmprestimo {

    public String login(String usuario, String senha, Pessoa pessoa)  {

        if (usuario.equals(pessoa.getEmail()) && senha.equals(pessoa.getSenha())) {
            return "Login realizado com sucesso!";
        } else {
            return "Usuário ou senha incorretos!";
        }

    }

    public void prazoPagto(Date dataAtual) {
        Date dateFinal = new Date(11/04/2022);
        if (!(dataAtual.equals(dateFinal))){
            System.out.println(dataAtual);;
        } else {
            System.out.println("Data ultrapassa prazo de 3 meses");
        }
    }
    public void cadastroDeClientes(Pessoa pessoa){
        pessoa.setNome(pessoa.getNome());
        pessoa.setEmail( pessoa.getEmail());
        pessoa.setSenha(pessoa.getSenha());
        pessoa.setCpf(pessoa.getCpf());
        pessoa.setRg(pessoa.getRg());
        pessoa.setEndereço(pessoa.getEndereço());
        pessoa.setRenda(pessoa.getRenda());


        System.out.println(pessoa);

    }
    public void exibirEmprestimo (Emprestimo emprestimo){

            Date date = new Date();
            if (emprestimo.getParcelas() > 60) {
                System.out.println("Atenção! O emprestimo só poderá ser em 60 vezes");
            }
            System.out.println("O valor da parcela ficou em " + emprestimo.getValor() + " parcelado em " + emprestimo.getParcelas() + " vezes");
            System.out.println("A data de primeira parcela é ");
            prazoPagto(date);
            System.out.println("O código do empréstimo é " + emprestimo.getCodigo());
            System.out.println("Renda cadastrada: " + emprestimo.getRenda());
            System.out.println("Você possui " + emprestimo.getQuantidade() + " empréstimo(s)");     }

    }


