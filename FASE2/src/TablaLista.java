import java.util.*;

public class TablaLista {

	public static void main(String[] args) {
		char Lista=' ';
		ArrayList<Character> listaNombre=new ArrayList<Character> ();

		listaNombre.add ('C');
		listaNombre.add ('R');
		listaNombre.add ('I');
		listaNombre.add ('S');
		listaNombre.add ('T');
		listaNombre.add ('I');
		listaNombre.add ('1');
		listaNombre.add ('A');
		listaNombre.add ('N');
		listaNombre.add (' ');
		listaNombre.add ('V');
		listaNombre.add ('I');
		listaNombre.add ('L');
		listaNombre.add ('L');
		listaNombre.add ('E');
		listaNombre.add ('G');
		listaNombre.add ('A');
		listaNombre.add ('S');

		for (int i=0; i<listaNombre.size(); i++){
			Lista=listaNombre.get(i);
			if (Lista == 'A') {
			System.out.println( Lista + " = VOCAL");
			}
			else
			if (Lista == 'E'){
			System.out.println( Lista + " = VOCAL");
			}
			else
			if (Lista == 'I') {
			System.out.println( Lista + " = VOCAL");
			}
			else
			if (Lista == 'O') {
			System.out.println( Lista + " = VOCAL");
			}
			else
			if (Lista == 'U') {
			System.out.println( Lista + " = VOCAL");
			}
			else
			if (Lista == ' ') {
			System.out.println( Lista + " = Es un espacio en blanco");
			}
			else
			if (Lista == '1') {
			System.out.println( Lista + " = Los nombres de las personas no llevan numero!");
			}
			else
			if (Lista == '2') {
			System.out.println( Lista + " = Los nombres de las personas no llevan numero!");
			}
			else
			if (Lista == '3') {
			System.out.println( Lista + " = Los nombres de las personas no llevan numero!");
			}
			else
			if (Lista == '4') {
			System.out.println( Lista + " = Los nombres de las personas no llevan numero!");
			}
			else
			if (Lista == '5') {
			System.out.println( Lista + " = Los nombres de las personas no llevan numero!");
			}
			else
			if (Lista == '6') {
			System.out.println( Lista + " = Los nombres de las personas no llevan numero!");
			}
			else
			if (Lista == '7') {
			System.out.println( Lista + " = Los nombres de las personas no llevan numero!");
			}
			else
			if (Lista == '8') {
			System.out.println( Lista + " = Los nombres de las personas no llevan numero!");
			}
			else
			if (Lista == '9') {
			System.out.println( Lista + " = Los nombres de las personas no llevan numero!");
			}
			else
			if (Lista == '0') {
			System.out.println( Lista + " = Los nombres de las personas no llevan numero!");
			}
			else
			if (Lista != 'A') {
			System.out.println( Lista + " = CONSONANTE");
			}
			else
			if (Lista != 'E') {
			System.out.println( Lista + " = CONSONANTE");
			}
			else
			if (Lista != 'I') {
			System.out.println( Lista + " = CONSONANTE");
			}
			else
			if (Lista != 'O') {
			System.out.println( Lista + " = CONSONANTE");
			}
			else
			if (Lista != 'U') {
			System.out.println( Lista + " = CONSONANTE");
			}

		}

	}

}
