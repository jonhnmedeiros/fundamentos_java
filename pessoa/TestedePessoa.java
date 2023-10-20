package pessoa;

public class TestedePessoa {

    public static void main(String[] args) {
        // Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setCpf("3332224456");
        pessoa1.setNome("Daniele");
        pessoa1.setIdade(33);

        System.out.println(pessoa1.imprimirDadosDaPessoa());

        // Professor
        Professor professor = new Professor();
        professor.setCpf("11145684932");
        professor.setNome("Maria");
        professor.setIdade(19);
        professor.setSalario(5000);

        System.out.println(professor.imprimirDadosDaPessoa());

        // Aluno
        Aluno aluno = new Aluno();
        aluno.setCpf("98756423411");
        aluno.setNome("Pedro");
        aluno.setIdade(22);
        aluno.setMatricula("1232345656");
        System.out.println(aluno.imprimirDadosDaPessoa());


    }
    
}
