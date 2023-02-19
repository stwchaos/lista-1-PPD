package exerciciosPPDPessoa;

import java.util.ArrayList;

public class MinhaListaPessoa {
    private ArrayList<Pessoa> tabela;

    public MinhaListaPessoa() {
        tabela = new ArrayList<>();
    }

    public boolean adicionar(Pessoa p) {
        if (p != null) {
            tabela.add(p);
            return true;
        }
        return false;
    }

    public boolean deletar(String nome) {
        for (Pessoa pessoa : tabela) {
            if (pessoa.getNome().equals(nome)) {
                tabela.remove(pessoa);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Pessoa> listaPessoas() {
        return tabela;
    }
}
