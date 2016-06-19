public class Contacto{
	private String nombre;
	private String apellido;
	private String numero;


	public Contacto(){

	}

	public Contacto(String nombre, String apellido, String numero){
		this.nombre = nombre; 
		this.apellido = apellido;
		this.numero = numero;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getApellido(){
		return this.apellido;
	}

	public String getNumero(){
		return this.numero;
	}

	public void setNombre(String apellido){
		this.nombre = nombre;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	public void setNumero(String numero){
		this.numero = numero;
	}

	



}