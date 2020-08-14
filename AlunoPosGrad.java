package Lista1BDeExercicios;

public class AlunoPosGrad extends Aluno{

    private String nomeCurso;
    private String nomeUniversidade;

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void setNomeUniversidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public AlunoPosGrad(String nome, int idade, int matricula, int qtdCadeiras, String nomeCurso, String nomeUniversidade) {
        super(nome, idade, matricula, qtdCadeiras);
        this.nomeCurso = nomeCurso;
        this.nomeUniversidade = nomeUniversidade;
    }

    //QUESTÃO 1
    /*
    A sobrecarga está explicita nesse método, pois o metodo defineMatricula está presente na superclasse, porém na subclasse está sendo sobrecarregado.
    Visto que o nome é o mesmo porém a quantidade de parâmetros e tipos são diferentes.
    A sobrecarga é util pois podemos reaproveitar os nomes de métodos
     */
    public void defineMatricula(int matricula,int qtdCadeiras,String nomeCurso,String nomeUniversidade){
        System.out.println("A matricula nº " + matricula + " foi matriculado com sucesso no curso de " + nomeCurso + " da universidade " + nomeUniversidade + ", nesse semestre você fará " + qtdCadeiras + " cadeira(s) " + " Boa sorte!!!");

    }

}
