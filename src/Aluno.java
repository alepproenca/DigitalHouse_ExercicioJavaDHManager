

public class Aluno {

    private int codigo;
    private String nome;
    private String sobrenome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Aluno))
            return false;
        if (obj == this)
            return true;
        return this.getCodigo() == ((Aluno) obj).getCodigo();
    }

}
