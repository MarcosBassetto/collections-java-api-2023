import list.operacoesBasicas.CatalogoLivros;
import list.operacoesBasicas.OrdenacaoPessoas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoas.ordennarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }
}