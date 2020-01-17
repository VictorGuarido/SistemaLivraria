package SistemaLivraria;

public class Autor {
    private String nomeAutor;
    private String sobrenome;
    private String categoria;
    private String sexo;
    private String paisAutor;
    private String cidade;
    private int idade;

    //Construtor
    public Autor(String nomeAutor, String sobrenome, String categoria, String sexo, String paisAutor, String cidade, int idade) {
        this.nomeAutor = nomeAutor;
        this.sobrenome = sobrenome;
        this.categoria = categoria;
        this.sexo = sexo;
        this.paisAutor = paisAutor;
        this.cidade = cidade;
        this.idade = idade;
    }

    //Sets e Gets
    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getPaisAutor() {
        return paisAutor;
    }
    public void setPaisAutor(String paisAutor) {
        this.paisAutor = paisAutor;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Método toString listar todos os dados do autor
    public String listarDadosAutor() {
        return "Autor{" +
                "nomeAutor='" + nomeAutor + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", generoEscrita='" + categoria + '\'' +
                ", sexo='" + sexo + '\'' +
                ", paisAutor='" + paisAutor + '\'' +
                ", cidade='" + cidade + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }

}
