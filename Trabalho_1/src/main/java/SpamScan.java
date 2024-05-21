public class SpamScan {
    private static String[][] frases = {
        {"voce ganhou", "10"},
        {"cartão senha", "5"},
        {"seu cartao foi clonado", "8"},
        {"clique no link", "9"},
        {"não perca", "3"},
        {"vagas de emprego em bandeirantes", "2"},
        {"segurança", "4"},
        {"clique aqui para recompensa", "10"},
        {"chave", "6"},
        {"assine já", "9"}
 };
    public static int Analisar(String texto){
        int pontuacao = 0;
        String textoLower = texto.toLowerCase();
        for(String[] termoPeso : frases){
            String termo = termoPeso[0].toLowerCase();
            int peso = Integer.parseInt(termoPeso[1]);
            if(textoLower.contains(termo)){
                 pontuacao += peso;
            }

        }
        return pontuacao;
    }
    public static String resultado (int pontuacao){
        if (pontuacao > 70) {
            return "spam";
        } 
        else if (pontuacao > 30) {
            return "potencialmente suspeito";
        } 
        else if (pontuacao >= 5) {
            return "fracamente suspeito";
        } 
        else {
            return "não suspeito";
        }
    }
    
public static void main(String[] args){
    String caminho = "teste.txt";
    String texto = LeArquivo.lerArquivo(caminho);

    int pontuacao = SpamScan.Analisar(texto);
    String resultado = SpamScan.resultado(pontuacao);
    
    System.out.println("Pontuação final: " + pontuacao);
    System.out.println("Classificação: " + resultado);
    

}

}