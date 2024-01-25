package PQ_test;

import java.time.LocalDate;

import PQ_util.Coche;

public class PruebaCoche {

	public static void main(String[] args) 
	{
		
		// Variables
		
		LocalDate unafecha;
		Coche uncoche;
		
		//Inicializar
		
		unafecha=LocalDate.of(2000,5,15);
		
		//Crear objeto
		uncoche= new Coche ("05789H", "Renault", "Clio", "Negro",unafecha,"Gasolina");
			
		//Resultados
		
		System.out.println("Matricula: " + uncoche.GetMatricula());
		System.out.println("Modelo: " + uncoche.GetModelo());
		System.out.println("Marca: " + uncoche.GetMarca());
		System.out.println("Color: " + uncoche.GetColor());
		System.out.println("Fecha de matriculacion: " + uncoche.GetFechaMatriculacion());
		System.out.println("Tipo de combustible: " + uncoche.GetTipoCombustible());
		
		System.out.println("");
		System.out.println(uncoche.GetInfo());

	}

}
