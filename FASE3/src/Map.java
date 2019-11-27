import java.util.*;

public class Map {

	public static void main(String[] args) {

		HashMap<Character, Integer> mapa = new HashMap<Character, Integer>();
		String nombre = "Cristian Villegas";
		char[] miNombre = nombre.toUpperCase().toCharArray();

		for (int i=0; i< miNombre.length; i++) {
			int value=1;
				if (!mapa.containsKey(miNombre[i])) {
					mapa.put(miNombre[i],value);
				}
				else {
					value= mapa.get(miNombre[i]);
					mapa.put(miNombre[i], value+1);
				}
		}
		System.out.println(mapa);
	}
}