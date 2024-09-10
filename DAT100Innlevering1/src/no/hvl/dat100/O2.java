package no.hvl.dat100;
import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;


public class O2 {

	public static void main(String[] args) {
		String lønn = showInputDialog("Skriv inn din årslønn");
		
		double l = Double.parseDouble(lønn);
		
		double s = 0;
		
		int t1 = 208051;
		int t2 = 292851;
		int t3 = 670001;
		int t4 = 937901;
		int t5 = 1350001;
		
		if (l >= t5) {
			s = l*0.176;
		}
		else if(l >= t4) {
			s = l*0.166;
		}
		else if(l >= t3) {
			s = l*0.136;
		}
		else if(l >= t2) {
			s = l*0.04;
		}
		else if(l >= t1) {
			s = l*0.017;
		}
		else {
			s = 0;
		}
		JOptionPane.showMessageDialog(null, "med din lønn "+l+" betaler du en trinnskatt på: "+s);
	}

}
