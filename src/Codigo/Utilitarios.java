package Codigo;

import java.time.Clock;
import java.util.Arrays;

public class Utilitarios {
    
public static int BinarioParaDecimal(String valorBinario) {
   int valor = 0;
 
   for (int i = valorBinario.length(); i>0; i--) {
      valor += Integer.parseInt(valorBinario.charAt(i-1)+"")*Math.pow(2, (valorBinario.length()-i));
   }
 
   return valor;
}

public static String BinarioParaHexadecimal(String binario) {
   char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
   StringBuilder sb = new StringBuilder();
   int posInicial = 0;
   int posFinal = 0;
   char caracterEncontrado = '-';
 
   posInicial = binario.length();
   posFinal = posInicial;
 
   while (posInicial > 0) {
      
      posInicial = ((posInicial - 4) >= 0) ? posInicial - 4 : 0;
      
      caracterEncontrado = hexa[BinarioParaDecimal(binario.substring(posInicial, posFinal))];
      sb.insert(0, caracterEncontrado);
 
      posFinal = posInicial;
   }
 
   return sb.toString();
}

public static String BinarioParaOctal(String binario) {
   StringBuilder sb = new StringBuilder();
   int posInicial = 0;
   int posFinal = 0;
 
   posInicial = binario.length();
   posFinal = posInicial;
 
   while (posInicial > 0) {
      posInicial = ((posInicial - 3) >= 0) ? posInicial - 3 : 0;
 
      sb.insert(0, BinarioParaDecimal(binario.substring(posInicial, posFinal)));
 
      posFinal = posInicial;
   }
 
   return sb.toString();
}

public static String DecimalParaBinario(int num) {
   int resto = -1;
   StringBuilder sb = new StringBuilder();
 
   if (num == 0) {
      return "0";
   }
 
   while (num > 0) {
      resto = num % 2;
      num = num / 2;
      sb.insert(0, resto);
   }
 
   return sb.toString();
}

public static String DecimalParaHexadecimal(int num) {
   char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
   int resto = -1;
   StringBuilder sb = new StringBuilder();
 
   if (num == 0) {
      return "0";
   }
 
   while (num > 0) {
      resto = num % 16;
      num = num / 16;
      sb.insert(0, hexa[resto]);
   }
 
   return sb.toString();
}

public static String DecimalParaOctal(int num) {
   int resto = -1;
   StringBuilder sb = new StringBuilder();
 
   if (num == 0) {
      return "0";
   }
 
   while (num > 0) {
      resto = num % 8;
      num = num / 8;
      sb.insert(0, resto);
   }
 
   return sb.toString();
}

public static String HexadecimalParaBinario(String valorHexa) {
   int posicao = 0;
   int posicaoArrayHexa = -1;
   StringBuilder sb = new StringBuilder();
   String valorConvertidoParaBinario = null;
   char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
 
   while (posicao < valorHexa.length()) {
      posicaoArrayHexa = Arrays.binarySearch(hexa, valorHexa.charAt(posicao));
      valorConvertidoParaBinario = DecimalParaBinario(posicaoArrayHexa);
      if (valorConvertidoParaBinario.length() != 4 && posicao > 0) {
         for (int i=0; i < (4-valorConvertidoParaBinario.length()); i++) {
            sb.append("0");
         }
      }
 
      sb.append(valorConvertidoParaBinario);
      posicao++;
   }
   return sb.toString();
}

public static int HexadecimalParaDecimal(String valorHexa) {
   int valor = 0;
   int posicaoCaractere = -1;
   char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
 
   for (int i=valorHexa.length(); i>0; i--) {
      posicaoCaractere = Arrays.binarySearch(hexa, valorHexa.charAt(i-1));
      valor += posicaoCaractere*Math.pow(16, (valorHexa.length()-i));
   }
 
   return valor;
}

public static String HexadecimalParaOctal(String valorHexa) {
   int valorDecimal = HexadecimalParaDecimal(valorHexa);
 
   return DecimalParaOctal(valorDecimal);
}

public static String OctalParaBinario(String valorOctal) {
   int posicao = 0;
   StringBuilder sb = new StringBuilder();
   String valorConvertidoParaBinario = null;
 
   while (posicao < valorOctal.length()) { 
      valorConvertidoParaBinario = DecimalParaBinario(Integer.parseInt(valorOctal.charAt(posicao)+""));       
      if (valorConvertidoParaBinario.length() != 3  && posicao > 0) {
         for (int i=0; i < (3-valorConvertidoParaBinario.length()); i++) {
            sb.append("0");
     }
      }
      
      sb.append(valorConvertidoParaBinario);
      posicao++;
   }
 
   return sb.toString();
}

public static int OctalParaDecimal(String valorOctal) {
   int valor = 0;
 
   for (int i=valorOctal.length(); i>0; i--) {
      valor += Integer.parseInt(valorOctal.charAt(i-1)+"")*Math.pow(8, (valorOctal.length()-i));
   }
 
   return valor;
}

public static String OctalParaHexadecimal(String valorOctal) {
   int valorDecimal = OctalParaDecimal(valorOctal);
 
   return DecimalParaHexadecimal(valorDecimal);
}
    
}
