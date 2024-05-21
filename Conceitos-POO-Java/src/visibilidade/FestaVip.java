package visibilidade;
//private
public class FestaVip {
  private int quantidadeCafe = 30;
  private int quantidadeSalgados = 50;

  private void beberCafe() {
    quantidadeCafe --;
    System.out.format("Bebeu 1 xicara de café");
  }

  private void comerSalgado() {
    quantidadeSalgados -= 4;
    System.out.format("Comeu 4 salgados");
  }

  public void entrar(){
    beberCafe();
    comerSalgado();
  }
}
