import javax.swing.JOptionPane;

public class TesteVeiculo {
    public static void main(String[] args) {
        //new: operador de construção de objetos
        Veiculo v1 = new Veiculo();

        Veiculo v2 = new Veiculo();

        String cor1 = JOptionPane.showInputDialog("Digite a cor do veículo 1");

        String cor2 = JOptionPane.showInputDialog("Digite a cor do veículo 2");


        String modelo1 = JOptionPane.showInputDialog("Digite o modelo do veículo 1");

        String modelo2 = JOptionPane.showInputDialog("DIgite o modelo do veículo 2");
        //esse é um erro comum de programação
        //v1.setCor(String cor1);
        v1.setCor(cor1);
        v1.setModelo(modelo1);

        v2.setCor(cor2);
        v2.setModelo(modelo2);

        v1.dirigir();
        v2.dirigir();

        v1.acelerar();
        v2.acelerar();

        System.out.printf("V1. Cor: %s. Modelo: %s",v1.getCor(), v1.getModelo());
        System.out.println(String.format(
            "V2. Cor: %s. Modelo: %s",
            v2.getCor(),
            v2.getModelo()
        ));
    }
}
