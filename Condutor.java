public class Condutor {
    private String nome;
    private Integer cnh;

    public Condutor(String nome, Integer cnh){
        this.nome = nome;
        this.cnh = cnh;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getCnh(){
        return cnh;
    }
    public void setCnh(Integer cnh){
        this.cnh = cnh;
    }
}