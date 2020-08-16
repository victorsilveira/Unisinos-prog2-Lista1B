package Lista1BDeExercicios;
//QUESTAO 3
/*
Herança e um dos principais conceitos de polimorfismo, pois permite que uma subclasse herde atributos e metodos de uma superclasse.
Facilitando assim a modelagem do software.

 */
public class AlunoPosGrad extends Aluno implements HappyHour{

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

    //QUESTAO 1
    /*
    A sobrecarga esta explicita nesse metodo, pois o metodo define Matricula esta presente na superclasse, porem na subclasse esté sendo sobrecarregado.
    Visto que o nome e o mesmo porem a quantidade de parametros e tipos sao diferentes.
    A sobrecarga e util pois podemos reaproveitar os nomes de metodos
     */
    public void defineMatricula(int matricula,int qtdCadeiras,String nomeCurso,String nomeUniversidade){
        System.out.println("A matricula nÂº " + matricula + " foi matriculado com sucesso no curso de " + nomeCurso + " da universidade " + nomeUniversidade + ", nesse semestre vocÃª farÃ¡ " + qtdCadeiras + " cadeira(s) " + " Boa sorte!!!");

    }
    
    public void tomarCervejaNoAlemao(int qtdCervejas) {
    	System.out.println("Foi comsumido um total de: " + qtdCervejas + " cerveja(s)");
    }
    
    /*
     QUESTAO 8:
     Poliformismo se da como a variacao de implementacao de um metodo em diferentes classes, ocorrendo em casos onde ha heranca entre
     classes. Pode ser vista no exemplo abaixo onde o metodo exibeDados herdado da classe pai tem uma implementacao diferente na classe filha
     */
    
    @Override
    public void exibeDados() {
    	System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nMatrícula: " + matricula + "\nCadeiras: " + qtdCadeiras + "\nCurso:" + nomeCurso + "\nUniversidade: " + nomeUniversidade);
    }

}
