import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;

public class DigitalHouse {

    List<Aluno> alunosDigitalHouse = new ArrayList<Aluno>();
    List<Professor> professorDigitalHouse = new ArrayList<Professor>();
    List<Curso> cursosDigitalHouse = new ArrayList<Curso>();
    List<Curso> cursoProf = new ArrayList<>();
    List<Matricula> matriculasDigitalHouse = new ArrayList<Matricula>();

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {

        Curso inseriCurso = new Curso();

        inseriCurso.setCodigo(codigoCurso);
        inseriCurso.setNome(nome);
        inseriCurso.setQtdeMaxAluno(quantidadeMaximaDeAlunos);

        cursosDigitalHouse.add(inseriCurso);

    }

    public void excluirCurso(int codigoCurso) {
        int i;
        int n = cursosDigitalHouse.size();
        for (i=0; i<n; i++) {
             if (codigoCurso == cursosDigitalHouse.get(i).getCodigo()) {
                 cursosDigitalHouse.remove(i);
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {

        ProfessorAdjunto registraAdjunto = new ProfessorAdjunto();

        int tempoCasa = 0;

        registraAdjunto.setNome(nome);
        registraAdjunto.setSobrenome(sobrenome);
        registraAdjunto.setCodigo(codigoProfessor);
        registraAdjunto.setQtdehrsmonitoria(quantidadeDeHoras);
        registraAdjunto.setTempocasa(tempoCasa);

        professorDigitalHouse.add(registraAdjunto);

    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String
            especialidade) {

        ProfessorEspecial registraEspecial = new ProfessorEspecial();
        registraEspecial.setCodigo(codigoProfessor);
        registraEspecial.setNome(nome);
        registraEspecial.setSobrenome(sobrenome);
        registraEspecial.setEspecialidade(especialidade);
        registraEspecial.setTempocasa(0);

        professorDigitalHouse.add(registraEspecial);

    }

      public void excluirProfessor(Integer codigoProfessor) {

        int n = professorDigitalHouse.size();
        int i;
        for (i=0; i<n; i++) {
            if (codigoProfessor == professorDigitalHouse.get(i).getCodigo()) {
                 professorDigitalHouse.remove(i);
            }
         }
     }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {

        Aluno matriculaAluno = new Aluno();
        matriculaAluno.setCodigo(codigoAluno);
        matriculaAluno.setNome(nome);
        matriculaAluno.setSobrenome(sobrenome);

        alunosDigitalHouse.add(matriculaAluno);

    }

    public void matricularAlunoCurso(Integer codigoAluno, Integer codigoCurso) {

        int qtdeMaxAluno = 0;
        int i;
        String nomeCurso = "";
        int n = cursosDigitalHouse.size();
        boolean existeCurso;
        existeCurso = false;
        int codCurso;
        int totMatr = 0;
        //Verifica existência do curso

        for (i = 0; i < n; i++) {
            //System.out.println("codigo curso: " + codigoCurso + ", " + cursosDigitalHouse.get(i).getCodigo());
            //System.out.println("nome curso: " + cursosDigitalHouse.get(i).getNome());
            codCurso = cursosDigitalHouse.get(i).getCodigo();
            if (codigoCurso == codCurso) {
                nomeCurso = cursosDigitalHouse.get(i).getNome();
                qtdeMaxAluno = cursosDigitalHouse.get(i).getQtdeMaxAluno();
                existeCurso = true;
                totMatr = 0;
            }
        }
        //if (existeCurso)  {
            //System.out.println("nome curso: "+ nomeCurso + ", qtde max Aluno: "+ qtdeMaxAluno);
       // }

        // encontrar o Aluno
        String nomeAluno = "";
        String sobreAluno = "";
        String nomeCompleto = "";

        n = alunosDigitalHouse.size();
        boolean existeAluno ;
        existeAluno = false;
        for (i=0; i<n; i++){
           if (codigoAluno == alunosDigitalHouse.get(i).getCodigo()) {
                nomeAluno = alunosDigitalHouse.get(i).getNome();
                sobreAluno = alunosDigitalHouse.get(i).getSobrenome();
                nomeCompleto = nomeAluno + " " + sobreAluno;
                existeAluno = true;
           }
        }

       // if (existeAluno)  {
       //  System.out.println("nome curso: "+ nomeCurso + ", Aluno: "+ nomeCompleto);
       // }

        //matricular o aluno no curso se os mesmos existem
        if (existeCurso)  {

            //obter qtos. alunos já matriculados no curso
            int tot = matriculasDigitalHouse.size();

            for (i=0; i<tot; i++){
                if (codigoCurso ==  matriculasDigitalHouse.get(i).cursoMatr.getCodigo()) {
                    totMatr ++;
                }
                    //System.out.println("curso: " + codigoCurso + " total de alunos: " + totMatr);
                       // nomeAluno = alunosDigitalHouse.get(i).getNome();
                       // sobreAluno = alunosDigitalHouse.get(i).getSobrenome();
                       // nomeCompleto = nomeAluno + " " + sobreAluno;
                       // existeAluno = true;
                    //}
            }

            if (existeAluno)  {

                //int TotAlunos = matriculasDigitalHouse.size();
                //System.out.println("total alunos "+ qtde);

                if (totMatr < qtdeMaxAluno)  {

                    //matricular o aluno no curso
                    Aluno alunoMatr = new Aluno();
                    alunoMatr.setNome(nomeAluno);
                    alunoMatr.setSobrenome(sobreAluno);
                    alunoMatr.setCodigo(codigoAluno);

                    Curso CursoMatr = new Curso();
                    CursoMatr.setCodigo(codigoCurso);
                    CursoMatr.setNome(nomeCurso);
                    //CursoMatr.setQtdeMaxAluno(qtdeMaxAluno);

                    Matricula realiMatricula = new Matricula(alunoMatr, CursoMatr);
                    realiMatricula.alunoMatr = alunoMatr;
                    realiMatricula.cursoMatr = CursoMatr;

                    matriculasDigitalHouse.add(realiMatricula);

                    System.out.println("Matricula do aluno: " + nomeCompleto + " no curso: " + nomeCurso + ", realizada com sucesso !");
                    //System.out.println("total alunos "+  matriculasDigitalHouse.size());
                }
                else {
                    System.out.println("Matricula do aluno: " + nomeCompleto + " no curso: " + nomeCurso + ", não realizada com sucesso ! Não há vagas ");
                }
            }
            else {
                System.out.println("Aluno não encontrado, não foi possível realizar a matrícula para o curso ! ") ;
            }
        }
        else {
            System.out.println("Curso não encontrado, não foi possível realizar a matrícula ! ") ;

        }

    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

        Curso alocarProfCurso = new Curso();

        alocarProfCurso.setCodigo(codigoCurso);
        alocarProfCurso.setCodProf1(codigoProfessorTitular);
        alocarProfCurso.setCodProf2(codigoProfessorAdjunto);

        cursoProf.add(alocarProfCurso);

    }


}
