
/*
 QUESTAO 7
 Interfaces podem ser definidadas como contratos de implementacao que classes que as extendem devem implementar. Diferente
 das classes abstratas, as interfaces nao se relacionam com outras classes por razao de contexto, mas sim de comportamento
 */

public interface Unisinos {

	public void tomarCervejaNoAlemao(int qtdCervejas);
	
	default void contemplarBiblioteca{
		System.out.println("Que maravilha!");
	}
	
}
