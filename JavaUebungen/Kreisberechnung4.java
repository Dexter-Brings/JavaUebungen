/* Kreisberechnung: Der Radius für einen Kreis und die Einheit 
 * werden über die Tastatur eingegeben. Anschließend werden
 * der Umfang und der Flächeninhalt berechnet und über eine Fenstermeldung wieder ausgegeben.
 */
import javax.swing.*;

public class Kreisberechnung4{
	public static void main (String[] args){
		var eingabe = JOptionPane.showInputDialog("Geben Sie die Einheit ein: ");
		var einheit = eingabe;
		eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
		var radius = Double.parseDouble(eingabe);
		var umfang = 2.0 * 3.1415926 * radius;
		var flaeche = 3.1415926 * radius * radius;
		JOptionPane.showMessageDialog(null, "Umfang: " + umfang + " " 
				+ einheit + "\nFläche: " + flaeche + " " + einheit + '\u00b2');
	}
}