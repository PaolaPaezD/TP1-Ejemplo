import javax.swing.JOptionPane;

public class mainejemplo {
public static void main(String[] args) {
	
	String nombre= JOptionPane.showInputDialog("Ingrese su nombre: ");
	JOptionPane.showMessageDialog(null, "Hola " + nombre);
	String numero=  JOptionPane.showInputDialog("Ingrese un numero entero: ");
	JOptionPane.showMessageDialog(null, "Usted ingreso " + numero);

			
	}

}