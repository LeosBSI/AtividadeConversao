package Codigo;

import javafx.scene.control.Alert;
import javax.swing.JOptionPane;

public class Converter extends Utilitarios {

    public static void main(String args[]) {

        String valor;
        valor = JOptionPane.showInputDialog("  " + " * CALCULADORA DE CONVERSÃO * " + "  "
                                            + " \n  " + " 1 -> Binario " + "  "
                                            + " \n  " + " 2 -> Decimal " + "  "
                                            + " \n  " + " 3 -> Hexadecimal " + "  "
                                            + " \n  " + " 4 -> Octal" + "  ");
        int numero = Integer.parseInt(valor);

        
        switch (numero) {
            case 1:
                valor = JOptionPane.showInputDialog("Informe um valor binário.");
                JOptionPane.showMessageDialog(null, " -- Entrada --" + " \n " +
                                                    " Base: Binário " + " \n " +
                                                    " Valor: " + valor + " \n " +
                                                    " -- Saída -- " + " \n " +
                                                    " Decimal: " + Utilitarios.BinarioParaDecimal(valor)+ " \n " +
                                                    " Octal: " + Utilitarios.BinarioParaOctal(valor) + " \n " +
                                                    " Hexadecimal: " + Utilitarios.BinarioParaHexadecimal(valor));
                break;
                
            case 2:
                valor = JOptionPane.showInputDialog("Informe um valor decimal.");
                int num = Integer.parseInt(valor);
                JOptionPane.showMessageDialog(null, " -- Entrada --" + " \n " +
                                                    " Base: Decimal " + " \n " +
                                                    " Valor: " + valor + " \n " +
                                                    " -- Saída -- " + " \n " +
                                                    " Binário: " + Utilitarios.DecimalParaBinario(num)+ " \n " +
                                                    " Octal: " + Utilitarios.DecimalParaOctal(num) + " \n " +
                                                    " Hexadecimal: " + Utilitarios.DecimalParaHexadecimal(num));
                break;
                
            case 3:
                valor = JOptionPane.showInputDialog("Informe um valor Hexadecimal.");
                JOptionPane.showMessageDialog(null, " -- Entrada --" + " \n " +
                                                    " Base: Hexadecimal " + " \n " +
                                                    " Valor: " + valor + " \n " +
                                                    " -- Saída -- " + " \n " +
                                                    " Binário: " + Utilitarios.HexadecimalParaBinario(valor)+ " \n " +
                                                    " Octal: " + Utilitarios.HexadecimalParaOctal(valor) + " \n " +
                                                    " Decimal: " + Utilitarios.HexadecimalParaDecimal(valor));
                break;
                
            case 4: 
                valor = JOptionPane.showInputDialog("Informe um valor Octal.");
                JOptionPane.showMessageDialog(null, " -- Entrada --" + " \n " +
                                                    " Base: Octal " + " \n " +
                                                    " Valor: " + valor + " \n " +
                                                    " -- Saída -- " + " \n " +
                                                    " Binário: " + Utilitarios.OctalParaBinario(valor)+ " \n " +
                                                    " Hexadecimal: " + Utilitarios.OctalParaHexadecimal(valor) + " \n " +
                                                    " Decimal: " + Utilitarios.OctalParaDecimal(valor));
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opcão inválida!");
                break;

        }
    }
}
