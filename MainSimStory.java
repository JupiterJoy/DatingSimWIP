import java.awt.event.*;
import javax.swing.*;
import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;
public class MainSimStory extends GraphicsProgram{//begin
	GImage Amber = new GImage("Amber.JPG");
	GImage Arthur = new GImage("Arthur.JPG");
	GImage Clorica = new GImage("Clorica.JPG");
	GImage Dolce = new GImage("DollyPico.JPG");
	GImage Doug = new GImage("Doug.JPG");
	GImage Dylas = new GImage("Dylas.JPG");
	GImage Forte = new GImage("Forte.JPG");
	GImage Frey = new GImage("Frey.JPG");
	GImage Kiel = new GImage("Kiel.JPG");
	GImage Leon = new GImage("Leon.JPG");
	GImage Lest = new GImage("Lest.JPG");
	GImage Margret = new GImage("Margret.JPG");
	GImage Vishnal = new GImage("Vishnal.JPG");
	GImage XiaoPai = new GImage("XiaoPai.JPG");
	
	GImage AllCharacters = new GImage("RF4Sprites.JPG");
	GImage Farm = new GImage("Farm.jpg");
	GImage Forest = new GImage("Forest.jpg");
	GImage Garden = new GImage("Garden.jpg");
	
	int total=0;
	int AmberNum=0;
	int ArthurNum=0;
	int CloricaNum=0;
	int DolceNum=0;
	int DougNum=0;
	int DylasNum=0;
	int ForteNum=0;
	int FreyNum=0;
	int KielNum=0;
	int LeonNum=0;
	int LestNum=0;
	int MargretNum=0;
	int VishnalNum=0;
	int XiaoPaiNum=0;
	
	MainSimChoice choice = new MainSimChoice();
	
	public void LestIntro(){//LestIntro
		JOptionPane.showMessageDialog(null,"'Hey there! My name is Lest. It's nice to meet you!'");
		JOptionPane.showMessageDialog(null,"Lest is very adventerous and heroic. He's also very friendly, and wants everyone to get along.");	
	}//LestIntro
	
	public void FreyIntro(){//FreyIntro
		JOptionPane.showMessageDialog(null, "'Hi! It's very nice to meet you! My name is Frey.'");
		JOptionPane.showMessageDialog(null, "Frey is also very adventerous. She's sweet and friendly, but also very naive. She wants to be friends with everyone, and always tries to see"
				+" the best in others.");
	}//FreyIntro
	
	public void ArthurIntro(){//ArthurIntro
		JOptionPane.showMessageDialog(null, "Why hello there. My name is Arthur.");
		JOptionPane.showMessageDialog(null,"Arthur is the prince of the land in which Selphia is located. He is very intellectual and diplomatic. He is obsessed with "
				+ "glasses, and loves everything cute.");
	}//ArthurIntro
	
	public void KielIntro(){//KielIntro
		JOptionPane.showMessageDialog(null,"Hey! My name is Kiel! Nice to meet you!");
		JOptionPane.showMessageDialog(null, "Kiel is Forte's little brother. He loves reading, and wants to know all about magic, monsters, and history. He is very supportive of "
				+ "his sister, but has a tendency to spill any secret he's told.");
	}//KielIntro
	
	public void CloricaIntro(){//CloricaIntro
		JOptionPane.showMessageDialog(null,"*YAWN* Oh, hi there. My name is Clorica.");
		JOptionPane.showMessageDialog(null,"Clorica is a butler in training for Ventuswill, the dragon who rules over Selphia. She loves to sleep, and sometimes even does her work while"
				+ " sleeping.");
	}//CloricaIntro
	
	public void AmberIntro(){//AmberIntro
		JOptionPane.showMessageDialog(null, "Hello hello hello! My name is Amber!");
		JOptionPane.showMessageDialog(null,"Amber is butterfly-human hybrid. She is very sweet and innocent, and loves giving hugs. She works at the Garden Shop, "
				+ "and absolutley loves flowers.");
	}//AmberIntro
	
	public void XiaoPaiIntro(){//XiaoPaiIntro
		JOptionPane.showMessageDialog(null, "Hi Hi! I'm Xiao Pai!");
		JOptionPane.showMessageDialog(null, "Xiao Pai works at the hotel in town with her mother. She has a funny way of speaking that everyone loves. She is very "
				+ "determined to do her best, even though she is exceptionally clumsy.");
	}//XiaoPaiIntro
	
	public void DougIntro(){//DougIntro
		JOptionPane.showMessageDialog(null, "What's up? The name's Doug.");
		JOptionPane.showMessageDialog(null, "Doug is an elf who came to Selphia after the evil Sechs killed his whole village. He works at the general store with "
				+ "Granny Blossom. He is very protective of his friends, and is very loyal. He constantly fights with Dylas.");
	}//DougIntro
	
	public void DylasIntro(){//DylasIntro
		JOptionPane.showMessageDialog(null, "Hey. The name's Dylas. Nice to meet you.");
		JOptionPane.showMessageDialog(null, "Dylas is shy and comes across as cold, but is actually very kind and loyal. He works at the local restaurants, and loves cooking. "
				+ "He also loves fishing. He constantly fights with Doug.");
	}//DylasIntro
	
	public void DolceIntro(){//DolceIntro
		JOptionPane.showMessageDialog(null, "Um...hi. I'm Dolce.");
		JOptionPane.showMessageDialog(null, "Dolce is very shy, and prefers to keep to herself. She has a ghost named Pico spiritually attached to her. Pico calls Dolce 'Dolly'"
				+ " which drives Dolce insane. However, Pico usually communicates to everyone what Dolce is really thinking.");
	}//DolceIntro
	
	public void VishnalIntro(){//VishnalIntro
		JOptionPane.showMessageDialog(null, "Hello there! My name is Vishnal.");
		JOptionPane.showMessageDialog(null, "Vishal works alognside Clorica as a butler in training. His goal is to be the best butler ever. He is very "
				+ "passionate about his job, and will do anything for the townspeople.");
	}//VishnalIntro
	
	public void ForteIntro(){//ForteIntro
		JOptionPane.showMessageDialog(null, "It's very nice to meet you. My name is Forte.");
		JOptionPane.showMessageDialog(null, "Forte is the older sister of Kiel. She is Selphia's royal protector, and is very loyal and strong. She loves to train, and is an awful cook."
				+ " The only thing that scares her is ghosts, and she secretly has a sweet tooth.");
	}//ForteIntro
	
	public void MargretIntro(){//MargretIntro
		JOptionPane.showMessageDialog(null, "Hi there! My name is Margret! It's nice to meet you!");
		JOptionPane.showMessageDialog(null, "Margret, like Doug, is an elf who moved to Selphia. Margret's family keeps asking her to move back to the big city, however she is in "
				+ "love with the small town of Selphia. She is a musician, and usually plays piano at the local restaurant.");
	}//MargretIntro
	
	public void LeonIntro(){//LeonIntro
		JOptionPane.showMessageDialog(null, "Hey. It's nice to meet you. My name's Leon.");
		JOptionPane.showMessageDialog(null, "Leon used to be a priest before being put into a thousand year sleep. He's still trying to adjust to a more modern lifestyle, and "
				+ "has a tendency to make refrences that no one understands. He's very confident and charming, but also insecure about how little he knows about the modern world.");
	}//LeonIntro
	
	public void round1(String input){
		choice.ask1();
		choice.get1();
		
		if (input.equalsIgnoreCase()){
			
		}
	}
	

}//end
