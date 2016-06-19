import java.util.Scanner;

public class PruebaAgenda{
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String apellido;
		String numero;
		int opcionElegida;
                int indice;

		do{
			System.out.println("Agenda java PM \n" +"\t1.- Agregar Contacto\n"+"\t2.- Eliminar Contacto\n" + "\t3.- Ver Contactos\n" + "\t4.- Editar Contacto\n" + "\t5.- Eliminar Lista\n" + "\t6.- Salir\n");
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
				
                                System.out.println(agenda);
                                    System.out.println("Cual contacto desea modificar");
                                    indice = teclado.nextInt();
                                    teclado.nextLine();
                                    System.out.println("Ingrese el nuevo nombre: ");
                                    nombre = teclado.nextLine();
                                    System.out.println("Ingrese el nuevo apellido: ");
                                    apellido = teclado.nextLine();
                                    System.out.println("Ingrese el nuevo numero: ");
                                    numero = teclado.nextLine();
                                    agenda.editarContacto(indice, new Contacto(nombre, apellido, numero));
				break;
                                case 5:
                                    agenda.vaciarAgenda();
                                    System.out.println("Todos los contactos se han eliminado");
                                break;

                                case 6:
                                    System.out.println("Vuelva pronto");
                                break;
				default:
				System.out.println("Opcion invalida, vuelva a intentar");
				break;
			}
		}while(opcionElegida !=6);
		
	}
}