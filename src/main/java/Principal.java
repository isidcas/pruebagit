package main.java;
import main.java.model.Coche;
public class Principal {

	public static void main(String[] args) {
		
		Coche c1=new Coche("Bmw","Serie1",186,192.000,true);
		
		Coche c2=new Coche("Audi","A4",143,132.000,false);
		
		
		System.out.println(c1.getMarca());
		System.out.println(c1.getModelo());
		System.out.println(c1.getCv());
		System.out.println(c1.getKms());
		System.out.println(c1.isVendido());
		
		System.out.println();
		
		System.out.println(c2.getMarca());
		System.out.println(c2.getModelo());
		System.out.println(c2.getCv());
		System.out.println(c2.getKms());
		System.out.println(c2.isVendido());
		
		
		
	}

}
