import java.util.ArrayList;
import java.util.List;

public class Curso {

    private int codigo;
    private String nome;
    private int qtdeMaxAluno;

    private int codProf1;
    private int codProf2;

    //ProfessorEspecial profEsp = new ProfessorEspecial();
    //ProfessorAdjunto profAdj = new ProfessorAdjunto();
    List<Aluno> alunos = new ArrayList<Aluno>();

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

    public int getQtdeMaxAluno() {
        return qtdeMaxAluno;
    }

    public void setQtdeMaxAluno(int qtdeMaxAluno){
        this.qtdeMaxAluno = qtdeMaxAluno;
    }

    public int getCodProf1() { return codProf1; }

    public void setCodProf1(int codProf11) {this.codProf1 = codProf11; }

    public int getCodProf2() { return codProf2; }

    public void setCodProf2(int codProf12) {this.codProf2 = codProf12; }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Curso))
            return false;
        if (obj == this)
            return true;
        return this.getCodigo() == ((Curso) obj).getCodigo();
    }

   // public Boolean adicionarUmAluno(Aluno novoAluno) {

       // alunos.add(novoAluno.setCodigo());
        //alunos.add(novoAluno.setNome());
        //alunos.add(novoAluno.setSobrenome());

        //return true;

   // }

    public void excluirAluno (Aluno excluiAluno){

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equals(excluiAluno.getNome())) {
                alunos.remove(i);
            }
        }

    }

}
