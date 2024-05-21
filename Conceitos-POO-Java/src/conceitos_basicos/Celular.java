package conceitos_basicos;
public class Celular {
  public String nome;  
  public String SistemaOperacional;
  public int espacoArmazenamento;
  public float tamnhoTela;   

 public void ligar(String pessoa){
    System.out.format("Ligando....\nPara %s", pessoa);
  }

  public void tirarFoto(){
    System.out.format("Sooriiaa!!!\nfoto tirada");
  }

}