package visibilidade;
//public e private
public class ContaNetflix {
  private String idiomaPreferencial;
  private String resolucaoTela;

  public void entrar() {
    
  }

  public void buscarPreferenciasDoUsuario() {
    idiomaPreferencial = "PT-BR";
  }

  public void indentificarResolucao(){
    resolucaoTela = "Full HD";
  }

  public void assistirFilme(String nomeFilme){
    System.out.format("Iniciando o filme %s", nomeFilme);
    System.out.format("Carregando o filme na resolução %s", resolucaoTela);
  }
  public void carregarAudioFilme() {
    if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US"){
      System.out.format("Carregando o aúdio em %s", idiomaPreferencial);
    }else{
      System.out.format("Carregando o aúdio em EN-US");
    }
  }

}
