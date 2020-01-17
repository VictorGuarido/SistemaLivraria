package SistemaLivraria;

public class Editora {
    private String nomeEditora;
    private int ano;
    private String cnpj;
    private String endereco;
    private String pais;
    private String estado;

    //Construtor
    public Editora(String nomeEditora, int ano, String cnpj, String endereco, String pais, String estado) {
        this.nomeEditora = nomeEditora;
        this.ano = ano;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.pais = pais;
        this.estado = estado;
    }

    //Sets e Gets
    public String getNomeEditora() {
        return nomeEditora;
    }
    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Método toString, lista todos os dados da editora
    public String listarDadosEditora() {
        return "Editora{" +
                "nomeEditora='" + nomeEditora + '\'' +
                ", ano=" + ano +
                ", cnpj='" + cnpj + '\'' +
                ", endereço='" + endereco + '\'' +
                ", pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

}
