package Restaurante;
import java.text.*;

public class Tools {
	
	public static void msg(String msg) {
		System.out.print(msg);
	}

   static public String formataN( double valor , int largura) {
	   DecimalFormat formatador = new DecimalFormat("###,#00.00");
	   String str = "                    " + formatador.format(valor);
	   return str.substring(str.length()-largura,str.length());
   }






}
