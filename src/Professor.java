public class Professor {

    private int codigo;
    private String nome;
    private String sobrenome;
    private int tempocasa;

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

    public int getTempocasa() {
        return tempocasa;
    }

    public void setTempocasa (int tempocasa){
        this.tempocasa = tempocasa;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Professor))
            return false;
        if (obj == this)
            return true;
        return this.getCodigo() == ((Professor) obj).getCodigo();
    }

}
