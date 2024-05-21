
import conceitos_basicos.Celular;
import conceitos_basicos.Hero;
import visibilidade.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Declarando um objeto do tipo celular = Instaciando um Objeto
        Celular cellOne = new Celular();
        cellOne.nome = "Redmi12";
        cellOne.SistemaOperacional = "Android";
        cellOne.espacoArmazenamento = 128;
        cellOne.tamnhoTela = 8.9f;
        
        Celular celltwo = new Celular();
        celltwo.nome = "Redmi12";
        celltwo.SistemaOperacional = "Android";
        celltwo.espacoArmazenamento = 128;
        celltwo.tamnhoTela = 8.9f;

        // System.out.format("Celular %s com tela de %f, com %d de armazenamento e SO %s\n", cellOne.nome, cellOne.tamnhoTela, cellOne.espacoArmazenamento, cellOne.SistemaOperacional);

        // System.out.format("Celular %s com tela de %f, com %d de armazenamento e SO %s", celltwo.nome, celltwo.tamnhoTela, celltwo.espacoArmazenamento, celltwo.SistemaOperacional);


        Hero heroOne = new Hero();
        heroOne.nome = "Batman";
        heroOne.vida = 100;
        heroOne.ataque = 20;
        heroOne.level = 1;
        heroOne.levelHabilidade = 1;
        heroOne.levelDurabilidade = 1;
    

        //heroOne.mostrarStatus();
        //heroOne.atacar("CorigaNelson");

        FestaVip festa = new FestaVip();
       // festa.entrar();

       Pessoa pess = new Pessoa();
       pess.setNome("Joge");
       pess.setAltura(1.9);
       pess.setIdade(22);

    //    System.out.println(pess.getNome());
    //    System.out.println(pess.getAltura());
    //    System.out.println(pess.getIdade());

    }
}
