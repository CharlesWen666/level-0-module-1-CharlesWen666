package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	

	String what = JOptionPane.showInputDialog("When is your birth day?");
if(what.equals("7/31")) {
JOptionPane.showMessageDialog(null, "Happy Birthday!");	

}
else{
	JOptionPane.showMessageDialog(null, "Wish you a very marry Unbirthday!");
}
}
}