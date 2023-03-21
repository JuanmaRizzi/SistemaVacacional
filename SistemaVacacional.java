 import java.util.Scanner;
public class SistemaVacacional{
	public static void main(String args[]){
		String nombre = "";
		int clave = 0;
		int antiguedad = 0;
		int dias = 0;
		System.out.println("");
		System.out.println("");
		System.out.println("*******************************************************************************************");
		System.out.println("Bienvenido al sistema d econtrol vacacional de CocaCola company");
		System.out.println("*******************************************************************************************");
		System.out.println("");
		System.out.println("");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Cual es su nombre?");
		nombre = in.nextLine();
		System.out.println("Cual es su antiguedad?");
		antiguedad = in.nextInt();
		System.out.println("Cual es su clave?");
		clave= in.nextInt();
		
		
		
		
		
		if(clave == 1){
			if(antiguedad <=1){
			
				dias = 6;	
				System.out.println(nombre + ", le corresponden " + dias + "de vacaciones. Su clave es: " + clave);

			}else if(antiguedad > 1 && antiguedad <=6) {

				dias = 14;	
				System.out.println(nombre + ", le corresponden " + dias + "de vacaciones. Su clave es: " + clave);
			
			}else if(antiguedad >6) {

				dias = 20;	
				System.out.println(nombre + ", le corresponden " + dias + "de vacaciones. Su clave es: " + clave);
			
			}else{
				System.out.println(nombre + ", no le corresponden vacaciones." );
			}
		}	

		else if(clave == 2){
			if(antiguedad <=1){
			
				dias = 7;	
				System.out.println(nombre + ", le corresponden " + dias + "de vacaciones. Su clave es: " + clave);

			}else if(antiguedad > 1 && antiguedad <=6) {

				dias = 18;	
				System.out.println(nombre + ", le corresponden " + dias + "de vacaciones. Su clave es: " + clave);
			
			}else if(antiguedad > 6) {

				dias = 25;	
				System.out.println(nombre + ", le corresponden " + dias + "de vacaciones. Su clave es: " + clave);
			
			}else{
				System.out.println(nombre + ", no le corresponden vacaciones." );
			}
		}

		else if(clave == 3){
			if(antiguedad <=1){
			
				dias = 10;	
				System.out.println(nombre + ", le corresponden " + dias + "de vacaciones. Su clave es: " + clave);

			}else if(antiguedad > 1 && antiguedad <=6) {

				dias = 25;	
				System.out.println(nombre + ", le corresponden " + dias + "de vacaciones. Su clave es: " + clave);
			
			}else if(antiguedad >6) {

				dias = 30;	
				System.out.println(nombre + ", le corresponden " + dias + "de vacaciones. Su clave es: " + clave);
			
			}else{
				System.out.println(nombre + ", no le corresponden vacaciones." );
			}
		}else{
				System.out.println(nombre + ", el departamento no existe.");			
		};


		
	}
}