package codice_binario;
import java.util.*;
public class main_codice {
	public static void main(String[] args) {
	Stack <Integer> pila=new Stack <Integer>();
	int n=527;
	int r=0;
	while (n>0) {
		r=n%2;
		pila.push(r);
		n=n/2;
	}
	while (pila.isEmpty()==false){
		System.out.print(pila.pop());
		}
	}
}
