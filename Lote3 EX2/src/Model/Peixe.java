package Model;

public class Peixe extends Animal {
    @Override
    public void alteraAmbiente(String ambiente) {
        ambiente = "mar";
        super.alteraAmbiente(ambiente);
    }

    public void alteraPatas(int patas){
        patas = 0;
        super.alteraPatas(patas);
    }

    @Override
    public void alteraCor(String cor) {
        cor = "Cinza";
        super.alteraCor(cor);
    }
    
    private String caracteristica = "Barbatana e cauda";

    public void alteraCaracteristica(String caracteristica){
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica(){
        return caracteristica;
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
        System.out.println("Característica: "+caracteristica);
        System.out.println("---------------------------------");
    }

}
