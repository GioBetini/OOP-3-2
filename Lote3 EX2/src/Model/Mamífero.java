package Model;

public class Mamífero extends Animal {
    private String alimento;
    
    @Override
    public void alteraAmbiente(String ambiente) {
        ambiente = "terra";
        super.alteraAmbiente(ambiente);
    }

    public String getAlimento(){
        return alimento;
    }

    public void alteraAlimento(String alimento){
        this.alimento = alimento;
    }
    
    @Override
    public void dados(){
        System.out.println("---------------------------------");
        System.out.println("Nome: "+getNome());
        System.out.println("Comprimento: "+getComprimento());
        System.out.println(getPatas()+" patas");
        System.out.println("Cor: "+getCor());
        System.out.println("Ambiente: "+getAmbiente());
        System.out.println("Velocidade: "+getVelocidade()+"m/s");
        System.out.println("Alimento: "+alimento);
        System.out.println("---------------------------------");
    }
}
