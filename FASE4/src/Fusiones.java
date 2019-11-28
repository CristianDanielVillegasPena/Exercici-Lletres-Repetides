import java.util.*;

public class Fusiones {

	public static void main(String[] args) {
		ArrayList<String> lista=new ArrayList<String> ();
		List<String> nombre = new ArrayList<String>();
		lista.add ("C");
		lista.add ("R");
		lista.add ("I");
		lista.add ("S");
		lista.add ("T");
		lista.add ("I");
		lista.add ("I");
		lista.add ("A");
		lista.add ("N");

		List<String> espacio = new ArrayList<String>();
		lista.add (" ");
		
		List<String> apellido=new ArrayList<String> ();
		lista.add ("V");
		lista.add ("I");
		lista.add ("L");
		lista.add ("L");
		lista.add ("E");
		lista.add ("G");
		lista.add ("A");
		lista.add ("S");

		lista.addAll(nombre);
		lista.addAll(espacio);
		lista.addAll(apellido);

		System.out.println("Mi Nombre es: " + lista);

	}

}
