package SistemaLivraria;

public class App {

    public static void main(String[] args) {

        Editora editora1 = new Editora(
                "Editora LerSaber",
                2020,
                "01010101",
                "Rua Tatu Pelado",
                "Brasil",
                "São Paulo"
        );

        Autor autor1 = new Autor(
                "Victor",
                "Ribeiro",
                "Filosofia",
                "Masculino",
                "Brasil",
                "São Paulo",
                20
        );

        Livro livro1 = new Livro(
                "Programação Mental",
                10,
                "Filosofia",
                autor1,
                editora1,
                2019
        );

        System.out.println("\n" + livro1.listarDadosLivro());       // Chamando método de listar todos os dados do livro -1
        System.out.println("\n" + editora1.listarDadosEditora());   // Chamando método de listar todos os dados da editora
        System.out.println("\n" + autor1.listarDadosAutor());       // Chamando método de listar todos os dados do autor

        livro1.abrirLivro(livro1.isAberto()); // Chama método abrir livro -2

        livro1.proximaPagina(livro1.getPaginaAtual()); // Chamando método para mudar para proxima pagina -3

        livro1.folhear(livro1.getTotalPaginas()); // Chama método folhear e conta pagina de 1 a 1 -4

        livro1.fecharLivro(livro1.isAberto()); // Método fechar o livro -5
    }

}
