
public class TesteTrabalho {

    public static void main(String[] args){
    String caminho = "C:\\Users\\Callisto\\OneDrive\\Área de Trabalho\\testetrabalho\\teste.txt";
    String texto = LeArquivo.lerArquivo(caminho);

    int pontuacao = SpamScan.Analisar(texto);
    String resultado = SpamScan.resultado(pontuacao);
    
    System.out.println("Pontuação final: " + pontuacao);
    System.out.println("Classificação: " + resultado);
    

}
}
