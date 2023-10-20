package pessoa;

public class Aluno extends Pessoa{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    String imprimirDadosDaPessoa() {
        return "O nome do aluno(a) é " + super.getNome() + " a idade é " + super.getIdade() + " e o cpf é " + super.getCpf();
    }


}
