import java.util.Scanner;

public class PruebaAgenda{
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String apellido;
		String numero;
		int opcionElegida;

		do{
			System.out.println("Agenda java PM \n" +"\t1.- Agregar Contacto\n"+"\t2.- Eliminar Contacto\n" + "\t3.- Ver Contactos\n" + "\t4.- Salir");
			System.out.println("Ingrese la opcion que desee: ");
			opcionElegida = teclado.nextInt();
			teclado.nextLine();
			//aqui va algo
			switch(opcionElegida){
				case 1:
				System.out.println("Ingrese nombre del nuevo Contacto: ");
				nombre = teclado.nextLine();
				System.out.println("Ingrese apellido del nuevo Contacto: ");
				apellido = teclado.nextLine();
				System.out.println("Ingrese numero del nuevo Contacto: ");
				numero = teclado.nextLine();
				//Contacto c = new Contacto(nombre, apellido, numero);
				//agenda.agregarContactos(c)
				agenda.agregarContactos(new Contacto(nombre, apellido, numero));

				break;
				case 2:
				System.out.println(agenda);
				agenda.eliminarContacto(teclado.nextInt());
				//aqui va algo
				break;
				case 3:
				System.out.println(agenda);
				break;
				case 4:
				System.out.println("Vuelva pronto");
				break;
				default:
				System.out.println("Opcion invalida, vuelva a intentar");
				break;
			}
		}while(opcionElegida !=4);
		
	}
}