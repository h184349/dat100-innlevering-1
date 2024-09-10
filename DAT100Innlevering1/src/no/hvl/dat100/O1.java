package no.hvl.dat100;
import java.lang.Integer;

import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;



public class O1 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++){
		String poeng = showInputDialog ("skriv inn poengsum her: ");
		
		int p = Integer.parseInt(poeng);
		
		String Karakter = null;
		int gyldigP = 0;
		
		if (p >= 90 && p <=100) {
			Karakter = "A";
		}	
		else if (p <= 89 && p >=80) {
			Karakter = "B";
		}	
		else if (p <= 79 && p >=60) {
			Karakter = "C";
		}	
		else if (p <= 59 && p >=50) {
			Karakter = "D";
		}	
		else if (p <= 49 && p >=40) {
			Karakter = "E";
		}	
		else if (p <= 39 && p >=0) {
			Karakter = "F";
		}	
		else {
			
			JOptionPane.showMessageDialog(null, "Ugyldig poengusm, vennligst skriv inn en sum f.o.m 0 t.o.m 100", "Feil", JOptionPane.ERROR_MESSAGE);
			
			System.out.println("Ugyldig poengusm, vennligst skriv inn en sum f.o.m 0 t.o.m 100");
			gyldigP = 1;
		i = i-1;
		}
		if (gyldigP == 0) {
			
		JOptionPane.showMessageDialog(null, poeng + " poeng tilsvarer karakter: " + Karakter);
		System.out.println("Poengsumen "+poeng+" tilsvarer karakter "+Karakter);

		}
	}	
}
}