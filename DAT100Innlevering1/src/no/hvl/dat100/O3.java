package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;

public class O3 {

	public static void main(String[] args) {
		String heltall = showInputDialog("Skriv inn et heltall");
		
		int n = Integer.parseInt(heltall);
		int fak = 1;
		
		for(int i = 1; i <= n; i++) {
			fak=fak*i;
		}
		
		
		JOptionPane.showMessageDialog(null, "fakultetet av " + heltall + " er " +  fak);
			
	}
}