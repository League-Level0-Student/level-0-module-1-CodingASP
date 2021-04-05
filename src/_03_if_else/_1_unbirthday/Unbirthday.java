package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String birthday = JOptionPane.showInputDialog("Is it your birthday today?") ;
if(birthday.equalsIgnoreCase("Yes")){JOptionPane.showMessageDialog(null,"Happy Birthday!");} 
else JOptionPane.showMessageDialog(null,"Happy Unbirthday!");
	}

}
