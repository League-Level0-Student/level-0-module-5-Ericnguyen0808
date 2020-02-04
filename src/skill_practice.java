import java.util.Random;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class skill_practice {
	
		public static void main(String[] args) {

		skill_practice skills = new skill_practice();
		           skills.skill1();
		           skills.skill2(); 
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}

		void skill1() { 	String a = JOptionPane.showInputDialog("How many dimes do you have?");
		int b = Integer.parseInt(a);
		int c = b*10;
		System.out.println(c);
		
		String tall = JOptionPane.showInputDialog("How tall are you in inches?");
		int i = Integer.parseInt(tall);
		if(i<36) { JOptionPane.showMessageDialog(null, "wow, you are very short go eat your wheaties.");
}
}
		void skill2() {
			for (int i = 1; i < 31; i+=3) {
				System.out.println(i);
			}	
			}
void skill3() {
int random = new Random().nextInt(21);		
		System.out.println(random);
		
int rando = new Random().nextInt(11);
	System.out.println(rando);
		
		
	int answer = random-rando;
		System.out.println(answer);
}

void skill4() {
	String z = JOptionPane.showInputDialog("What city do you live in?");
	if(z.equalsIgnoreCase("San Diego")) { 
		JOptionPane.showMessageDialog(null, "You live in the finest city in America.");
	}
		else { JOptionPane.showMessageDialog(null, "Go move to San Diego.");
}
int cars = 2;	
	JOptionPane.showMessageDialog(null, "The cars have no wheels between them.");
	
	
}
void skill5() { 
String school = JOptionPane.showInputDialog("What is the name of your school?");
JOptionPane.showMessageDialog(null, school+ " is an amazing school");
		
		
		
		
		
		
		
		
		

}
}
