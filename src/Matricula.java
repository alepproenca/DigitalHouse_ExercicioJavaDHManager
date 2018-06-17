import java.util.Date;

public class Matricula {

    private Date dtmatricula;

    Aluno alunoMatr = new Aluno();
    Curso cursoMatr = new Curso();

    public Date getDtmatricula() {
        return dtmatricula;
    }

    public void setDtmatricula(Date dtmatricula){
        this.dtmatricula = dtmatricula;
    }

    public Matricula (Aluno alunoMatr, Curso cursoMatr) {

        this.dtmatricula = new Date();
        this.alunoMatr = alunoMatr;
        this.cursoMatr = cursoMatr;

    }


}
