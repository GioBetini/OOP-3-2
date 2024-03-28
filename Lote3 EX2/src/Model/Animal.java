package Model;

public class Animal {
    private String nome;
    private int comprimento;
    private int patas = 4;
    private String cor;
    private String ambiente;
    private float velocidade;
    
    public void alteraNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void alteraComprimento(int comprimento){
        this.comprimento = comprimento;
    }

    public int getComprimento(){
        return comprimento;
    }

    public void alteraPatas(int patas){
        this.patas = patas;
    }

    public int getPatas(){
        return patas;
    }

    public void alteraCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void alteraAmbiente(String ambiente){
        this.ambiente = ambiente;
    }

    public String getAmbiente(){
        return ambiente;
    }

    public void alteraVelocidade(float velocidade){
        this.velocidade = velocidade;
    }

    public float getVelocidade(){
        return velocidade;
    }

    public void dados(){
        System.out.println("---------------------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Comprimento: "+comprimento);
        System.out.println(patas+" patas");
        System.out.println("Cor: "+cor);
        System.out.println("Ambiente: "+ambiente);
        System.out.println("Velocidade: "+velocidade+"m/s");
        System.out.println("---------------------------------");
    }
}