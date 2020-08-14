package Lista1BDeExercicios;

public class AlunoDoc extends Aluno{
    private String areaDoc;
    private String nomeOrientador;

    public String getAreaDoc() {
        return areaDoc;
    }

    public void setAreaDoc(String areaDoc) {
        this.areaDoc = areaDoc;
    }

    public String getNomeOrientador() {
        return nomeOrientador;
    }

    public void setNomeOrientador(String nomeOrientador) {
        this.nomeOrientador = nomeOrientador;
    }

    public AlunoDoc(String nome, int idade, int matricula, int qtdCadeiras, String areaDoc, String nomeOrientador) {
        super(nome, idade, matricula, qtdCadeiras);
        this.areaDoc = areaDoc;
        this.nomeOrientador = nomeOrientador;
    }

    //QUESTÃO 2
    /*
    A sobreescrita está explicita no método abaixo.
    Ela pode ser identificado pelo Annotation @Override que o java fornece.
    Ela é importante para aproveitar um método que no escopo vai ser exatamente igual da superclasse. Para implementar,
    o método deve ser exatamente igual (nome e parâmetros)
     */
    @Override
    public void diaDeAula() {
        super.diaDeAula();
    }
}
