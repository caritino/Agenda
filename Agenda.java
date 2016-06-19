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
        
        public void editarContacto(int indiceContacto, Contacto c){
                contactos.set(indiceContacto,c);
	}

        public int tengoContacto(){
            if(contactos.isEmpty())
                return 0;
            else
                return 1;
        }
        
	public void vaciarAgenda(){
		contactos.clear();
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