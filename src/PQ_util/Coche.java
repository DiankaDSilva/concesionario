package PQ_util;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Coche 
{
	//VARIABLES, ATRIBUTOS
	
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private LocalDate fecha_matriculacion;
	private String tipo_combustible;
	
	
	//CONSTRUCTORES
	
	public Coche(String cmatricula, String cmarca, String cmodelo, String ccolor, LocalDate cfecha_matriculacion, String ctipo_combustible)
	{
		this.matricula = cmatricula;
		this.marca = cmarca;
		this.modelo = cmodelo;
		this.color = ccolor;
		this.fecha_matriculacion = cfecha_matriculacion;
		this.tipo_combustible = ctipo_combustible;
	}
	
	
	//SET
	
	public void SetMatricula(String nuevamatricula)
	{
		matricula=nuevamatricula;
	}
	
	
	public void SetMarca(String nuevamarca)
	{
		marca=nuevamarca;
	}
	
	
	public void SetModelo(String nuevomodelo)
	{
		modelo=nuevomodelo;
	}
	
	
	public void SetColor(String nuevocolor)
	{
		color=nuevocolor;
	}
	
	
	public void SetFechaMatriculacion(LocalDate nuevafecha_matriculacion)
	{
		fecha_matriculacion=nuevafecha_matriculacion;
	}
	
	
	public void SetTipoCombustible(String nuevotipo_combustible)
	{
		tipo_combustible=nuevotipo_combustible;
	}
	
	
	
	
	//GET
	
	public String GetMatricula()
	{
		return this.matricula;
	}
	
	public String GetMarca()
	{
		return this.marca;
	}
	
	public String GetModelo()
	{
		return this.modelo;
	}
	
	public String GetColor()
	{
		return this.color;
	}
	
	public LocalDate GetFechaMatriculacion()
	{
		return this.fecha_matriculacion;
	}
	
	public String GetTipoCombustible()
	{
		return this.tipo_combustible;
	}
	
	
	
	
	//OTROS METODOS
	
	
	public int AntigüedadCoche()
	{
		int i_años;
		LocalDate ahora;
		
		ahora= LocalDate.now();
		
		i_años = (int)(ChronoUnit.MONTHS.between(fecha_matriculacion, ahora)/12);
		
		return i_años;
	}
	

	/*********************************************************************************************************************/
	
	
	public int AntigüedadCoche2()
	{
		int i_años;
		LocalDate ahora;
		ahora = LocalDate.now();

		Period periodo = Period.between(fecha_matriculacion, ahora);

		i_años = periodo.getYears();

	return i_años;
	}
	
	
	/*********************************************************************************************************************/
	
	
	public String GetInfo()
	{
		String st_resultado;
		st_resultado= "Matricula:" + matricula + " Marca:" + marca + " Modelo:" + modelo + " Color:" + color + " Fecha de matriculacion:" + fecha_matriculacion + " Tipo de combustible:" + tipo_combustible; 
		return st_resultado;

	}
}
