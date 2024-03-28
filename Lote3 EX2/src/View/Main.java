package View;

import java.util.ArrayList;
import java.util.List;

import Model.Animal;
import Model.Mamífero;
import Model.Peixe;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Animal> zoo = new ArrayList<>();

        Mamífero camelo = new Mamífero();
        camelo.alteraNome("camelo");
        camelo.alteraAlimento("cacto");
        camelo.alteraAmbiente("deserto");
        camelo.alteraComprimento(345);
        camelo.alteraCor("marrom");
        camelo.alteraVelocidade(18);

        Peixe tubarao = new Peixe();
        tubarao.alteraNome("tubarao");
        tubarao.alteraComprimento(360);
        tubarao.alteraVelocidade(5.3f);
        
        Mamífero urso = new Mamífero();
        urso.alteraNome("urso-do-canadá");
        urso.alteraAlimento("mel");
        urso.alteraComprimento(200);
        urso.alteraCor("Marrom");
        urso.alteraVelocidade(11.1f);

        zoo.add(camelo);
        zoo.add(tubarao);
        zoo.add(urso);

        for (Animal animal : zoo) {
            animal.dados();
        }
        System.out.println("Volte mais vezes ao nosso Zoológico!");
    }
    
}
