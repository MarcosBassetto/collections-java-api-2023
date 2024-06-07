import list.operacoesBasicas.CatalogoLivros;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivros("Livro 1","Autor 1",2020);
        catalogoLivros.adicionarLivros("Livro 1","Autor 2",2021);
        catalogoLivros.adicionarLivros("Livro 2","Autor 2",2022);
        catalogoLivros.adicionarLivros("Livro 3","Autor 3",2023);
        catalogoLivros.adicionarLivros("Livro 4","Autor 4",1994);

        System.out.println(catalogoLivros.pesquisaPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1990,2020));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));



    }
}