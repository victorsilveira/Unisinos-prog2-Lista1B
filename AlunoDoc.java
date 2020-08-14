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
}
