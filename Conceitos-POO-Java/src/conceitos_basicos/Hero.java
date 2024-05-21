package conceitos_basicos;

import java.util.Random;

public class Hero {
  public String nome;
  public int ataque;
  public float vida;
  public int level;
  public int levelHabilidade;
  public int levelDurabilidade;

  public void mostrarStatus(){
    System.out.format("Nome: %s\nVida: %.2f\nAtaque: %d\nLevel: %d\nNivel da Habilidade: %d\nNivel da Durabilidade: %d\n", nome, vida, ataque, level, levelHabilidade, levelDurabilidade);
  }

  public int calcularDano() {
    Random gerarDano = new Random();

    int danosAleatorios = 1 + gerarDano.nextInt(19);
    int dano = (ataque + danosAleatorios) * level;
    return dano;
  }

  public void atacar(String alvo){
    int danoCausado = calcularDano();
    if (danoCausado >= 10){
      System.out.format("%s acertou %s como um atque normal de %d\n", nome, alvo, danoCausado);
    }else {
      System.out.format("%s acertou %s como um atque critico de %d\n", nome, alvo, danoCausado);
    }
  }


}
