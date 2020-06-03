package revisao02;

import javax.swing.JOptionPane;

public class Revisao02 {
    public static void main(String[] args) {
        
        /* A granja Frangotech possui um controle automatizado de cada frango da sua produção. 
            No pé direito do frango há um anel com um chip de identificação; 
            no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
            Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um 
            algoritmo para calcular o gasto total da granja para marcar todos os seus frangos. 
            Ao término insira na resposta o link do github com o seu repositório criado. */
        
        double AAlimen, AIdent, ATotal;
        int Galinha;
        
        AAlimen = 3.50;
        AIdent = 4.00;
        Galinha = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de galinhas na granja:"));
        ATotal = Galinha * ((AAlimen * 2) + AIdent);
            JOptionPane.showMessageDialog(null, "O total gasto para marcar todos os fragos foi de: "+ATotal +"\n--------------------------\n"+ "FRANGOTECH");
  }
}