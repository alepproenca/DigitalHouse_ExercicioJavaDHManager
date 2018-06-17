public class principal {
    public static void main(String[] args) {

        System.out.println("Início");
        //registrar professor titular 1 e 2

        DigitalHouse dhManager = new DigitalHouse();
        dhManager.registrarProfessorTitular("alexandre","da silva", 1, "matemática" );
        dhManager.registrarProfessorTitular("joão", "moraes",2,"geografia");

        System.out.println("Professores Titulares criados");

        //registrar professor adjunto 1 e 2
        dhManager.registrarProfessorAdjunto("Manoel", "da Silva",3,20);
        dhManager.registrarProfessorAdjunto("Maria", "das Dores",4,10);

        System.out.println("Professores Adjuntos criados");

        //registrar curso 1 e 2
        dhManager.registrarCurso("Full Stack",20001,2);
        dhManager.registrarCurso("Android",20002,3);

        System.out.println("Cursos criados");

        //aloca professores
        dhManager.alocarProfessores(1,1,3);
        dhManager.alocarProfessores(2,2,4);

        System.out.println("Professores alocados");

        // Cria alunos
        dhManager.matricularAluno("Fernando", "Teste",1);
        dhManager.matricularAluno("Roberto", "Carlos",2);
        dhManager.matricularAluno("Jane", "Fonda",3);
        dhManager.matricularAluno("Brigite", "Bardo",4);
        dhManager.matricularAluno("Artur", "Coimbra",5);

        System.out.println("Alunos Criados");

        // Matricula alunos full stack
        dhManager.matricularAlunoCurso(2,20001);
        dhManager.matricularAlunoCurso(1,20001);
        dhManager.matricularAlunoCurso(3,20001);

        System.out.println("Alunos Matriculados no curso de Full Stack ");

        // Matricula alunos Android
       dhManager.matricularAlunoCurso(2,20002);
       dhManager.matricularAlunoCurso(3,20002);
       dhManager.matricularAlunoCurso(4,20002);

        System.out.println("Alunos Matriculados no curso de Full Stack ");

    }
}
