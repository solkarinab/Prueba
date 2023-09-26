package projectNew;

public class manipulaCadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = "Hoy es un lindo día para aprender a programar en Java";
		
		String fraseResumen = frase.substring(25,53) + " irnos a la playa y olvidarnos de todo y "
				+ frase.substring(25,53);
		
		System.out.println(fraseResumen);
		

	}

}
