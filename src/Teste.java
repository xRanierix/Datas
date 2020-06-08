import java.sql.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Teste {

	public static void main (String args []) throws ParseException { //sem o ParseException o passo 2 dará erro
		//Passo 1: Instanciando data
		SimpleDateFormat data1 = new SimpleDateFormat("dd/mm/yyyy");
		SimpleDateFormat data2 = new SimpleDateFormat("dd/mm/yyyy");

		//Passo 2: Alimentando variável já no formato que foi instanciado
		java.util.Date d1 = data1.parse("12/02/2020");
		java.util.Date d2 = data2.parse("13/11/1989");
		
		//Passo 3: Visualizando
		System.out.println("Data 1: " + data1.format(d1));
		System.out.println("Data 2: " + data2.format(d2));
		
		
	
	}
	
}
 