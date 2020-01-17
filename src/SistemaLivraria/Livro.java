package SistemaLivraria;

public class Livro {
    private String titulo;
    private int totalPaginas;
    private String genero;
    private Autor autor;
    private Editora editora;
    private int paginaAtual;
    private int anoPublicacao;
    private boolean aberto;

    //Construtor
    public Livro(String titulo, int totalPaginas, String genero, Autor autor, Editora editora, int anoPublicacao) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.paginaAtual = 0;
        this.anoPublicacao = anoPublicacao;
        this.aberto = false;
    }

    //Sets e Gets
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTotalPaginas() {
        return totalPaginas;
    }
    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public Editora getEditora() {
        return editora;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    public int getPaginaAtual() {
        return paginaAtual;
    }
    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    //Método toString, lista todos os dados do livro
    public String listarDadosLivro() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", totalPaginas=" + totalPaginas +
                ", genero='" + genero + '\'' +
                ", autor=" + autor.getNomeAutor() +
                ", editora=" + editora.getEndereco() +
                ", paginaAtual=" + paginaAtual +
                ", anoPublicacao=" + anoPublicacao +
                ", aberto=" + aberto +
                '}';
    }

    public void abrirLivro(boolean aberto){
            this.aberto = true;
            System.out.println("Livro Aberto, Pagina atual: " + paginaAtual);
    }

    public void fecharLivro(boolean aberto){
        if(this.aberto == true) {
            this.aberto = false;
            System.out.println("Livro Fechado");
        }
        else {
            System.out.println("Abra o livro para fecha-lo kkkkk");
        }
    }

    public void folhear(int totalPaginas){

        if(this.aberto = true ){
            int folheando = 0;
            while (folheando <= totalPaginas){
                System.out.println("Pagina: " + folheando);
                folheando++;
            }
        }
        else {
            System.out.println("Precisa abrir o livro para folhea-lo!");
        }

    }

    public void proximaPagina(int paginaAtual){
        if(this.aberto = true){
            this.paginaAtual = paginaAtual + 1;
            System.out.println(this.paginaAtual);
        }
        else {
            System.out.println("Precisa abrir o livro");
        }
    }

}