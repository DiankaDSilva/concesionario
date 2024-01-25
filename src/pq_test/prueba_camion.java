package pq_test;

import java.time.LocalDate;

import pq_util.Camion;

/********************************************INICIO CLASE************************************************************/
public class prueba_camion 
{
	/********************************************INICIO MAIN***********************************************************/
	public static void main(String[] args) 
	{
		//VARS
		LocalDate mifecha;
		Camion micoche;
		int antigüedad;
	
		
		//INIC
		mifecha = LocalDate.of(2001, 12, 01);
		micoche = new Camion("0000-AAA","seat","león","rojo",mifecha, "gasolina");
		
		//OPERAR
		antigüedad = micoche.GetAntigüedad();
		
		//RESULTADOS
		System.out.println(micoche.GetInfo());
		System.out.println("Antigüedad: " +antigüedad +" años");
	
	}
	/********************************************FIN MAIN***********************************************************/

}
/********************************************FIN CLASE************************************************************/
