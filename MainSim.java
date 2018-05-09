import java.awt.event.*;
import javax.swing.*;
import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;
public class MainSim extends GraphicsProgram{//begin
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
	GImage Farm = new GImage("FarmHouse.jpg");
	GImage Forest = new GImage("Forest .jpg");
	GImage Garden = new GImage("Garden.jpg");
	
	
	
	
	
	MainSimStory story = new MainSimStory();
	MainSimChoice choice = new MainSimChoice();
	
	
	public void init(){//initial
		setBackground(Color.WHITE);
		setSize(1000,1000);
		Amber.setSize(200,250);
		Arthur.setSize(200,250);
		Clorica.setSize(200,250);
		Dolce.setSize(200,250);
		Doug.setSize(150,250);
		Dylas.setSize(150,250);
		Forte.setSize(200,250);
		Frey.setSize(200,250);
		Kiel.setSize(200,250);
		Leon.setSize(200,250);
		Lest.setSize(200,250);
		Margret.setSize(200,250);
		Vishnal.setSize(150,250);
		XiaoPai.setSize(200,250);
		
		AllCharacters.setSize(500,500);
		Farm.setSize(500,500);
		Forest.setSize(500,500);
		Garden.setSize(500,500);
		
		
	}//initial
	
	public void run(){//main
		
		GLabel intro1 = new GLabel("A Rune Facotry 4 fan game");
		GLabel intro2 = new GLabel("Rune Factory 4: Selphia Soulmates");
		intro1.setColor(Color.BLACK);
		intro2.setColor(Color.BLACK);
		intro1.setFont("SansSerif-BOLD-12");
		intro2.setFont("SansSerif-BOLD-12");
		add(intro1,10,10);
		add(intro2,10,30);
		waitForClick();
		remove(intro1);
		remove(intro2);
		add(AllCharacters,10,10);
		JOptionPane.showMessageDialog(null,"Welcome to Rune Factory 4: Selphia Soulmates!");
		remove(AllCharacters);
		
		add(Lest,50,50);
		story.LestIntro();
		remove(Lest);
		
		add(Frey,50,50);
		story.FreyIntro();
		remove(Frey);
		
		add(Arthur,50,50);
		story.ArthurIntro();
		remove(Arthur);
		
		add(Kiel,50,50);
		story.KielIntro();
		remove(Kiel);
		
		add(Clorica,50,50);
		story.CloricaIntro();
		remove(Clorica);
		
		add(Amber,50,50);
		story.AmberIntro();
		remove(Amber);
		
		add(XiaoPai,50,50);
		story.XiaoPaiIntro();
		remove(XiaoPai);
		
		add(Doug,50,50);
		story.DougIntro();
		remove(Doug);
		
		add(Dylas,50,50);
		story.DylasIntro();
		remove(Dylas);
		
		add(Dolce,50,50);
		story.DolceIntro();
		remove(Dolce);
		
		add(Vishnal,50,50);
		story.VishnalIntro();
		remove(Vishnal);
		
		add(Forte,50,50);
		story.ForteIntro();
		remove(Forte);
		
		add(Margret,50,50);
		story.MargretIntro();
		remove(Margret);
		
		add(Leon,50,50);
		story.LeonIntro();
		remove(Leon);
		
		add(AllCharacters,50,50);
		JOptionPane.showMessageDialog(null, "Now that you've met everyone, let's begin the game!");
		remove(AllCharacters);
		
		JOptionPane.showMessageDialog(null,"Every year, on the ninth day of spring, Selphia holds a flower festival.");
		JOptionPane.showMessageDialog(null,"Many people consider this festival to be very special, because people usually ask their special someone to dance with them.");
		JOptionPane.showMessageDialog(null,"Will you dance with anyone at the flower festival?");
		
		add(Farm,50,50);
		
		
		
		
		
	}//main

}//end
