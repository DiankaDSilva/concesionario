package pq_util;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/********************************************************************************************************/
public class Camion 
{
	
	//PROPIEDADES/ATRIBUTOS
	String matricula;
	String marca;
	String modelo;
	String color;
	LocalDate fechaMatriculacion;
	String tipoCombustible;
	
	//CONSTRUCTOR
	public Camion(String c_matricula, String c_marca, String c_modelo,String c_color, LocalDate c_fechaMatriculacion, String c_tipoCombustible)
	{
		this.matricula = c_matricula;
		this.marca = c_marca;
		this.modelo = c_modelo;
		this.color = c_color;
		this.fechaMatriculacion = c_fechaMatriculacion;
		this.tipoCombustible = c_tipoCombustible;
	}
	
	//SET
	public void SetMatricula(String nuevaMatricula)
	{
		this.matricula = nuevaMatricula;
	}
	
	public void SetMarca(String nuevaMarca)
	{
		this.marca = nuevaMarca;
	}
	
	public void SetModelo(String nuevoModelo)
	{
		this.modelo = nuevoModelo;
	}
	
	public void SetColor(String nuevoColor)
	{
		this.color = nuevoColor;
	}
	
	public void SetFechaMatriculacion(LocalDate nuevaFechaMatriculacion)
	{
		this.fechaMatriculacion = nuevaFechaMatriculacion;
	}
	
	public void SetTipoCombustible(String nuevoTipoCombustible)
	{
		this.tipoCombustible = nuevoTipoCombustible;
	}
	
	//GET
	public String GetMatricula()
	{
		return matricula;
	}
	
	public String GetMarca()
	{
		return marca;
	}
	
	public String GetModelo()
	{
		return modelo;
	}
	
	public String GetColor()
	{
		return color;
	}
	
	public LocalDate GetFechaMatriculacion()
	{
		return fechaMatriculacion;
	}
	
	public String GetTipoCombustible()
	{
		return tipoCombustible;
	}
	
	//OTROS MÉTODOS
	
	/**Antigüedad con Period**/
	public int GetAntigüedad()
	{
		int antigüedad;
		LocalDate ahora;
		ahora = LocalDate.now();
		Period periodo;
		
		periodo = Period.between(fechaMatriculacion, ahora);
        
		antigüedad = periodo.getYears();
        
        return antigüedad;
	}
	
	/**Antigüedad con ChronoUnit**/
	public int GetAntigüedadVFran()
	{
		int antigüedad;
		LocalDate ahora;
		ahora = LocalDate.now();
		
		antigüedad = (int)(ChronoUnit.MONTHS.between(fechaMatriculacion, ahora))/12;
		
        return antigüedad;
	}
	
	/**GetInfo**/
	public String GetInfo()
	{
		String st_resultado;
	
		st_resultado= "Matricula: " +matricula +" | Marca: " +marca +" |  Modelo: " +modelo +" | Color: "
				+color +" | Fecha matriculación: " +fechaMatriculacion +" | Tipo Combustible: " +tipoCombustible;
		return st_resultado;
	}
	
}
/********************************************************************************************************/
