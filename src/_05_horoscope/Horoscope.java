package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String StarSign = JOptionPane.showInputDialog("What is your star sign");
	
if(StarSign.equalsIgnoreCase("Aries")) {
	JOptionPane.showMessageDialog(null, "You are compatible with Gemini, Leo, Sagittarius and Aquarius");
}
if(StarSign.equalsIgnoreCase("Taurus")) {
	JOptionPane.showMessageDialog(null, "You are compatible with Cancer, Virgo, Capricorn and Pisces");
}
if(StarSign.equalsIgnoreCase("Gemini")) {
	JOptionPane.showMessageDialog(null, "You are compatible with Aries, Leo, Libra and Aquarius");
}
if(StarSign.equalsIgnoreCase("Cancer"))
	JOptionPane.showMessageDialog(null, "You are Taurus, Virgo, Scorpio and Pisces");
	}
	

}
