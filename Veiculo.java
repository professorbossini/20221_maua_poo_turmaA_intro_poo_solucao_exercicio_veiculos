public class Veiculo{
    private String cor;
    private String modelo;

    public void dirigir(){
        System.out.println("Dirigindo...");
    }

    public void acelerar(){
        System.out.println("Acelerando...");
    }

    //getters
    public String getCor(){
        return cor;
    }

    public String getModelo(){
        return modelo;
    }

    //setters
    public void setCor(String cor){
        this.cor = cor;
    }

    public void setModelo (String modelo){
        this.modelo = modelo;
    }

    
}

