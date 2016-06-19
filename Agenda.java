import java.util.ArrayList;
import java.util.Iterator;

public class Agenda{
	private ArrayList<Contacto> contactos = new ArrayList<>();

	public void agregarContactos(Contacto c){
		if (contactos.add(c))
			System.out.println("El contacto se añadio con exito :)");
		else
			System.out.println("No se pudo añadir al contacto");

	}

	public void eliminarContacto(int indiceContacto){
		contactos.remove(indiceContacto);
		System.out.println("Se elimino correctamente.");
	}

	@Override
	public String toString(){
		Iterator<Contacto> iterador = contactos.iterator();
		Contacto temp;
		String cadena = "";
		if(iterador.hasNext()){
			while(iterador.hasNext()){
			temp = iterador.next();
			cadena = cadena.concat("\t" + contactos.indexOf(temp) + ".- Nombre: "+temp.getNombre() + "\tApellido: "+temp.getApellido() + "\tNumero: "+temp.getNumero());
			cadena = cadena.concat("\n");
			}
			return cadena;
		}else{
			return "No tiene contactos";
		}
	}
}