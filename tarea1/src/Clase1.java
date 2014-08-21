import java.util.Scanner;
public class Clase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner en=new Scanner (System.in);
System.out.println("Introduzca número:");
int numero = en.nextInt();
     if (numero%2==0){
    	 System.out.println(numero+" es par");
     }else{
	System.out.println(numero+" es impar");
     }   
	}

}
