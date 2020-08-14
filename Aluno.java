package Lista1BDeExercicios;

public class Aluno {

    private String nome;
    private int idade;
    private int matricula;
    private int qtdCadeiras;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getQtdCadeiras() {
        return qtdCadeiras;
    }

    public void setQtdCadeiras(int qtdCadeiras) {
        this.qtdCadeiras = qtdCadeiras;
    }

    public Aluno(String nome, int idade, int matricula, int qtdCadeiras) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.qtdCadeiras = qtdCadeiras;
    }

    public void defineMatricula(int matricula, int qtdCadeiras){
        System.out.println("A matricula nº " + matricula + " foi matriculado com sucesso, nesse semestre você fará " + qtdCadeiras + " cadeira(s) " + " Boa sorte!!!");
    }

    public void diaDeAula(){
        System.out.println("Você tem aula HOJE!");
    }
}
