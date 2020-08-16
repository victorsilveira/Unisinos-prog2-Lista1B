package Lista1BDeExercicios;

/*
 QUESTAO 5
 Classe abstrata e uma classe normalmente mais generica que serve de modelo para demais classes. De qualquer maneira, por definicao
 nenhum objeto pode ser instanciado a partir dela
 */

/*
 QUESTAO 6
 A relacao entre heranca e classes abstratas e clara. As classes abstratas servem somente como classe pai (generica)
 a ser herdada por classes mais especificas e implementaveis
 */

abstract class Pessoa {

    /*
    Questao 4
    O metodo abstrato sempre vai estar representado como abaixo na classe abstrata.
    Pois na classe que herdar esta deve ser implementado o metodo com as determinadas funcoes.
     */
    public abstract void exibeDados();
}
