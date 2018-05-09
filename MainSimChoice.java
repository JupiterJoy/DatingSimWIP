import java.awt.event.*;
import javax.swing.*;
import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;
public class MainSimChoice extends GraphicsProgram{//begin
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
	GImage Forest = new GImage("Forest.jpg");
	GImage Garden = new GImage("Garden.jpg");
	GImage Farm = new GImage("FarmHouse.jpg");
	String input = "";
	
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
	
	public void ask1(){//ask1
		JOptionPane.showMessageDialog(null,"It's a beautiful morning in Selphia. It's the first day of spring, so after planting new seeds and tending to your garden, it's practically noon."
				+ "\n Luckily, you still have lots of time before the end of the day.");
		 input = JOptionPane.showInputDialog("Who would you like to spend your time with today? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask1
	public String get1(){//get1
		return input;
	}//get1
	
	public void ask2(){//ask2
		JOptionPane.showMessageDialog(null, "Today is the second day of spring! After tending to your garden, you have a few hours to kill before lunch.");
		input= JOptionPane.showInputDialog("Who would you like to spend your time with today? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");

	}//ask2
	public String get2(){//get2
		return input;
	}//get2
	
	public void ask3(){//ask3
		JOptionPane.showMessageDialog(null, "After having lunch at the restaurant, you have a few hours to spend with someone else.");
		input= JOptionPane.showInputDialog("Who would you like to spend your time with today? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask3
	public String get3(){//get3
		return input;
	}//get3
	
	public void ask4(){//ask4
		JOptionPane.showMessageDialog(null, "Today is the third day of spring! After tending to your garden, you think it might be nice to spend some time with a friend before lunch.");
		input= JOptionPane.showInputDialog("Who would you like to spend your time with today? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask4
	public String get4(){//get4
		return input;
	}//get4
	
	public void ask5(){//ask5
		JOptionPane.showMessageDialog(null, "After having lunch, you return to your home. However, you quickly grow bored, and want to spend time with someone.");
		input= JOptionPane.showInputDialog("Who would you like to spend your time with today? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask5
	public String get5(){//get5
		return input;
	}//get5
	
	public void ask6(){//ask6
		JOptionPane.showMessageDialog(null, "Today is the fourth day of spring! Your garden is coming along nicely, and small sprouts are beginning to poke out of the ground.");
		input= JOptionPane.showInputDialog("Who would you like to spend your time with today? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask6
	public String get6(){//get6
		return input;
	}//get6
	
	public void ask7(){//ask7
		JOptionPane.showMessageDialog(null, "After lunch, you want to spend time with someone else.");
		input= JOptionPane.showInputDialog("Who would you like to spend your time with today? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask7
	public String get7(){//get7
		return input;
	}//get7
	
	public void ask8(){//ask8
		JOptionPane.showMessageDialog(null, "Today is the fifth day of spring! It rained overnight, so tending to your garden this morning is fairly easy.");
		input= JOptionPane.showInputDialog("Who would you like to spend your time with today? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask8
	public String get8(){//get8
		return input;
	}//get8
	
	public void ask9(){//ask9
		JOptionPane.showMessageDialog(null, "It rains during lunch, so you have to eat lunch inside. When you open the door, someone greets you.");
		input= JOptionPane.showInputDialog("Who greets you at the door? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask9
	public String get9(){//get9
		return input;
	}//get9
	
	public void ask10(){//ask10
		JOptionPane.showMessageDialog(null, "Today is the sixth day of spring! Overnight a huge windy rain storm hit the town, causing your garden to get extremely messy. You decide to call"
				+ " a friend to come help you clean up.");
		input= JOptionPane.showInputDialog("Who would you like to help you clean up? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask10
	public String get10(){//get10
		return input;
	}//get10
	
	public void ask11(){//ask11
		JOptionPane.showMessageDialog(null, "Both of you are able to get the garden cleaned up fairly quickly. However, as soon as you sit down to take a break, a friend calls"
				+ " you up to ask if you can come and help them clean up their garden");
		input= JOptionPane.showInputDialog("Who calls you for help? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask11
	public String get11(){//get11
		return input;
	}//get11
	
	public void ask12(){//ask12
		JOptionPane.showMessageDialog(null, "Today is the seventh day of spring! After tending to your garden, you're exhausted. Gardening all day took a lot out of you!"
				+ " One of your friends stops by to check on you and bring you breakfast.");
		input= JOptionPane.showInputDialog("Who stops by to say hello? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask12
	public String get12(){//get12
		return input;
	}//get12
	
	public void ask13(){//ask13
		JOptionPane.showMessageDialog(null, "Your friend leaves after lunch, so you decide to take a nap. As soon as your head hits the pillow, you hear a knock on the door."
				+ " Someone else has stopped by.");
		input= JOptionPane.showInputDialog("Who stops by to say hello? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask13
	public String get13(){//get13
		return input;
	}//get13
	
	public void ask14(){//ask14
		JOptionPane.showMessageDialog(null, "Today is the eighth day of spring! Tomorrow is the flower festival! After tending to your garden, you see someone sitting on your front porch.");
		input= JOptionPane.showInputDialog("Who is sitting down and waiting for you? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask14
	public String get14(){//get14
		return input;
	}//get14
	
	public void ask15(){//ask15
		JOptionPane.showMessageDialog(null, "After you finish lunch, your friend leaves. However, you see someone walking down the road toward you.");
		input= JOptionPane.showInputDialog("Who is walking down the road? \n"
				+ "Lest, Frey, Arthur, Kiel, Clorica, \nAmber, Xiao Pai, Doug, Dylas, Dolce, \nVishnal, Forte, Margret, or Leon?");
	}//ask15
	public String get15(){//get15
		return input;
	}//get15
	
	public void LestConvo(){//LestConvo
		String Talk[] = {"Hey there! How are you?","What's up?","Hey! Let's hang out!","Want to go on an adventure?","Need something?"};
		
		Random Rand = new Random();
		int LestRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[LestRand]);
		JOptionPane.showMessageDialog(null, "You and Lest grew closer!");
		total = total + 1;
		LestNum = LestNum + 1;
		
	}//LestConvo
	
	public void FreyConvo(){//FreyConvo
		String Talk[] = {"Hi there!","Isn't it a beauiful day?","Let's do our best today!","Let's hang out!","Need anything?"};
		
		Random Rand = new Random();
		int FreyRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[FreyRand]);
		JOptionPane.showMessageDialog(null, "You and Frey grew closer!");
		total = total + 1;
		FreyNum = FreyNum + 1;
		
	}//FreyConvo
	
	public void ArthurConvo(){//ArthurConvo
		String Talk[] = {"Greetings.","Do you like my new glasses?","Do you have something cute to show me?","I guess I could take a break...","I quite enjoy talking to you."};
		
		Random Rand = new Random();
		int ArthurRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[ArthurRand]);
		JOptionPane.showMessageDialog(null, "You and Arthur grew closer!");
		total = total + 1;
		ArthurNum = ArthurNum + 1;
		
	}//ArthurConvo
	
	public void KielConvo(){//KielConvo
		String Talk[] = {"Hi there!","Read any good books lately?","Do you want to see a magic trick?","I just finished the best book!","We should start a book club!"};
		
		Random Rand = new Random();
		int KielRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[KielRand]);
		JOptionPane.showMessageDialog(null, "You and Kiel grew closer!");
		total = total + 1;
		KielNum = KielNum + 1;
		
	}//KielConvo
	
	public void CloricaConvo(){//CloricaConvo
		String Talk[] = {"*YAWN*","So sleepy...","Oh dear. I forgot what I've forgotten!","Do you need some help?","Zzzzzzzzz..."};
		
		Random Rand = new Random();
		int CloricaRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[CloricaRand]);
		JOptionPane.showMessageDialog(null, "You and Clorica grew closer!");
		total = total + 1;
		CloricaNum = CloricaNum + 1;
		
	}//CloricaConvo
	
	public void AmberConvo(){//AmberConvo
		String Talk[] = {"Hi hi!","You'll never guess what kind of flower I found!","Need some gardening help?","Oh look at all the cute plants!","It's such a nice day today!"};
		
		Random Rand = new Random();
		int AmberRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[AmberRand]);
		JOptionPane.showMessageDialog(null, "You and Amber grew closer!");
		total = total + 1;
		AmberNum = AmberNum + 1;
		
	}//AmberConvo
	
	public void XiaoPaiConvo(){//XiaoPaiConvo
		String Talk[] = {"Hi hi!","Hmmm. Is something wrong?","The sky is soaked in clouds...","Why do things break so easily?",""};
		
		Random Rand = new Random();
		int XiaoPaiRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[XiaoPaiRand]);
		JOptionPane.showMessageDialog(null, "You and Xiao Pai grew closer!");
		total = total + 1;
		XiaoPaiNum = XiaoPaiNum + 1;
		
	}//XiaoPaiConvo
	
	public void DougConvo(){//DougConvo
		String Talk[] = {"What's up?","I finally got out of the store!","Don't forget to take it easy, okay?","Don't tell me Dylas is with you...","Got any snacks?"};
		
		Random Rand = new Random();
		int DougRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[DougRand]);
		JOptionPane.showMessageDialog(null, "You and Doug grew closer!");
		total = total + 1;
		DougNum = DougNum + 1;
		
	}//DougConvo
	
	public void DylasConvo(){//DylasConvo
		String Talk[] = {"Hey.","Don't tell me Doug is with you...","...","What do you want?","Need some help?"};
		
		Random Rand = new Random();
		int DylasRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[DylasRand]);
		JOptionPane.showMessageDialog(null, "You and Dylas grew closer!");
		total = total + 1;
		DylasNum = DylasNum + 1;
		
	}//DylasConvo
	
	public void DolceConvo(){//DolceConvo
		String Talk[] = {"Hello. How are you?","You interrupted my knitting...","What's the matter?","It's a beautiful day.","Can I help you?"};
		
		Random Rand = new Random();
		int DolceRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[DolceRand]);
		JOptionPane.showMessageDialog(null, "You and Dolce grew closer!");
		total = total + 1;
		DolceNum = DolceNum + 1;
		
	}//DolceConvo
	
	public void VishnalConvo(){//VishnalConvo
		String Talk[] = {"Why hello there!","I'll do my best!","Ah, it's getting warm outside?","Is there anything I can help with?","I'll be the best butler in history!"};
		
		Random Rand = new Random();
		int VishnalRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[VishnalRand]);
		JOptionPane.showMessageDialog(null, "You and Vishnal grew closer!");
		total = total + 1;
		VishnalNum = VishnalNum + 1;
		
	}//VishnalConvo
	
	public void ForteConvo(){//ForteConvo
		String Talk[] = {"","W","","",""};
		
		Random Rand = new Random();
		int ForteRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[ForteRand]);
		JOptionPane.showMessageDialog(null, "You and Forte grew closer!");
		total = total + 1;
		ForteNum = ForteNum + 1;
		
	}//ForteConvo
	
	public void MargretConvo(){//MargretConvo
		String Talk[] = {"Why hello.","I'll protect you!","The weather's not looking good...","Wow! It's a nice day!","Need some help?"};
		
		Random Rand = new Random();
		int MargretRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[MargretRand]);
		JOptionPane.showMessageDialog(null, "You and Margret grew closer!");
		total = total + 1;
		MargretNum = MargretNum + 1;
		
	}//MargretConvo
	
	public void LeonConvo(){//LeonConvo
		String Talk[] = {"Hello there.","Good m...no, you know what? No. Let's go with 'bad night' instead.","What a mood-lifter!","Summer's just around the corner.","Can I help you?"};
		
		Random Rand = new Random();
		int LeonRand = Rand.nextInt(4);
		
		JOptionPane.showMessageDialog(null, Talk[LeonRand]);
		JOptionPane.showMessageDialog(null, "You and Leon grew closer!");
		total = total + 1;
		LeonNum = LeonNum + 1;
		
	}//LeonConvo
	
	public void LestFestival(){//LestFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see Lest"
				+ " standing there.");
		Lest.setSize(200,250);
		add(Lest,50,50);
		JOptionPane.showMessageDialog(null,"Hey there! Don't worry, I already took care of your garden for today. Anyways, why don't we go on a walk to the forest.");
		remove (Lest);
		pause(100);
		add(Forest,50,50);
		add(Lest,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("Hey. Sorry if this is kinda lame. I just wondered if you would maybe want to dance with me at the flower festival?");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"Wow really? I'm so excited!");
			JOptionPane.showMessageDialog(null,"As soon as Lest stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(Lest);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//LestFestival
	
	public void FreyFestival(){//FreyFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see Frey"
				+ " standing there.");
		Frey.setSize(200,250);
		add(Frey,50,50);
		JOptionPane.showMessageDialog(null,"Hi there! I got up early to come help with your garden. Anyways, why don't we go to the forest");
		remove (Frey);
		pause(100);
		add(Forest,50,50);
		add(Frey,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("Okay this is kinda embarassing, but I set all this up to ask if you want to dance with me at the flower festival?");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"Yay! Oh wow I'm so happy you said yes!");
			JOptionPane.showMessageDialog(null,"As soon as Frey stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(Frey);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//FreyFestival
	
	public void ArthurFestival(){//ArthurFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see Arthur"
				+ " standing there.");
		Arthur.setSize(200,250);
		add(Arthur,50,50);
		JOptionPane.showMessageDialog(null,"Good morning! I was walking by earlier when I decided to help out. Your garden is beautiful. \nWell, since your garden is tended to,\n"
				+ " how about you accompany me to the forest? I have some work I must attend to there.");
		remove(Arthur);
		pause(100);
		add(Forest,50,50);
		add(Arthur,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("I know this seems silly, but this is actually the work I was referring to. I wanted to ask if you would dance with me"
				+ " at the flower festival?");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"Oh how lovely! I can assure you that we'll be the best looking couple there.");
			JOptionPane.showMessageDialog(null,"As soon as Arthur stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(Arthur);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//ArthurFestival
	
	public void KielFestival(){//KielFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see Kiel"
				+ " standing there.");
		Kiel.setSize(200,250);
		add(Kiel,50,50);
		JOptionPane.showMessageDialog(null,"Hey there! I was just on my way to the forest actually. Why don't you come with? And I totally didn't see who tended your garden by the way.");
		remove (Kiel);
		pause(100);
		add(Forest,50,50);
		add(Kiel,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("I guess you probbaly figured out I tended your garden huh? I just wanted to get you here early so I could ask if you want"
				+ " to dance with me at the festival?");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"Oh wow! I didn't expect you to say yes. This is really magical, huh?");
			JOptionPane.showMessageDialog(null,"As soon as Kiel stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(Kiel);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//KielFestival
	
	public void CloricaFestival(){//CloricaFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see Clorica"
				+ " standing there.");
		Clorica.setSize(200,250);
		add(Clorica,50,50);
		JOptionPane.showMessageDialog(null,"*YAWN* Good morning. I um, think I might have tended to your garden in my sleep. Do you maybe want to go to the forest though?");
		remove (Clorica);
		pause(100);
		add(Forest,50,50);
		add(Clorica,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("Oh wow, I don't actually remember setting any of this up, but I know I did. I guess I just wanted to ask"
				+ "  if you would dance with me at the festival...");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"Wow really? Hopefully I don't fall asleep during the festival!");
			JOptionPane.showMessageDialog(null,"As soon as Clorica stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(Clorica);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//CloricaFestival
	
	public void AmberFestival(){//AmberFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see Amber"
				+ " standing there.");
		Amber.setSize(200,250);
		add(Amber,50,50);
		JOptionPane.showMessageDialog(null,"Dialog lets go to the forest stuff");
		remove (Amber);
		pause(100);
		add(Forest,50,50);
		add(Amber,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("Oh yea wanna dance");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"omg no way dude");
			JOptionPane.showMessageDialog(null,"As soon as  stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(Amber);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//AmberFestival
	
	public void XiaoPaiFestival(){//XiaoPaiFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see Xiao Pai"
				+ " standing there.");
		XiaoPai.setSize(200,250);
		add(XiaoPai,50,50);
		JOptionPane.showMessageDialog(null,"Mmm... the weather's nice today! Let's go to the forest, yes?");
		remove (XiaoPai);
		pause(100);
		add(Forest,50,50);
		add(XiaoPai,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("I'm very clumsy yes? But will you dance with me today?");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"Yay! This will be fun, yes?");
			JOptionPane.showMessageDialog(null,"As soon as Xiao Pai stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(XiaoPai);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//XiaoPaiFestival
	public void DougFestival(){//DougFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see Doug"
				+ " standing there.");
		Doug.setSize(150,250);
		add(Doug,50,50);
		JOptionPane.showMessageDialog(null,"Morning... I was just on my way to the forest actually. Why don't you come with?");
		remove (Doug);
		pause(100);
		add(Forest,50,50);
		add(Doug,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("So I was wondering... do you maybe want to dance with me at the festival today?");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"Sweet! I'm really bad at dancing though, so no laughing, okay?");
			JOptionPane.showMessageDialog(null,"As soon as Doug stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(Doug);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//DougFestival
	
	public void DylasFestival(){//DylasFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see Dylas"
				+ " standing there.");
		Dylas.setSize(150,250);
		add(Dylas,50,50);
		JOptionPane.showMessageDialog(null,"Hey. Let's go the forest.");
		remove (Dylas);
		pause(100);
		add(Forest,50,50);
		add(Dylas,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("Sorry that... that's nothing! I actually had something to ask you. Do you um... want to dance with me? Today at the festival, not now...");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"Huh? You're sure about that?");
			JOptionPane.showMessageDialog(null,"As soon as Dylas stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(Dylas);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//DylasFestival
	
	public void DolceFestival(){//DolceFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see "
				+ " standing there.");
		Dolce.setSize(200,250);
		add(Dolce,50,50);
		JOptionPane.showMessageDialog(null,"Would you mind accompanying me to the forest?");
		remove (Dolce);
		pause(100);
		add(Forest,50,50);
		add(Dolce,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("Seems there's a festival today. Would you dance with me?");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"Wow! I didn't expect you to say yes...");
			JOptionPane.showMessageDialog(null,"As soon as Dolce stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(Dolce);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//DolceFestival
	
	public void VishnalFestival(){//VishnalFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see Vishnal"
				+ " standing there.");
		Vishnal.setSize(150,250);
		add(Vishnal,50,50);
		JOptionPane.showMessageDialog(null,"Ah it's very nice outside. Why don't you accompany me to the forest?");
		remove (Vishnal);
		pause(100);
		add(Forest,50,50);
		add(Vishnal,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("I'm quite a good dancer you know. You can ask me anything about dancing. Or I could teach you, if you'd be my partner at the festival.");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"Well then, shall we get going?");
			JOptionPane.showMessageDialog(null,"As soon as Vishnal stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(Vishnal);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//VishnalFestival
	
	public void ForteFestival(){//ForteFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see Forte"
				+ " standing there.");
		Forte.setSize(200,250);
		add(Forte,50,50);
		JOptionPane.showMessageDialog(null,"Um... why don't we go to the forest?");
		remove (Forte);
		pause(100);
		add(Forest,50,50);
		add(Forte,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("Um... I... it's... will you dance with me at the festival?");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"Oh my! I didn't expect you to say yes...");
			JOptionPane.showMessageDialog(null,"As soon as Forte stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(Forte);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//ForteFestival
	
	public void MargretFestival(){//MargretFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see Margret"
				+ " standing there.");
		Margret.setSize(200,250);
		add(Margret,50,50);
		JOptionPane.showMessageDialog(null,"Ah! It's the start of a new day! Would you accompany me to the forest?");
		remove (Margret);
		pause(100);
		add(Forest,50,50);
		add(Margret,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("Would you mind terribly being my partner today at the festival? This is the first year I'm not playing the msuic...");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"Oh yay! I can't stop smiling!");
			JOptionPane.showMessageDialog(null,"As soon as Margret stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(Margret);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//MargretFestival
	
	public void LeonFestival(){//LeonFestival
		JOptionPane.showMessageDialog(null,"Good morning! Today is the day of the flower festival! As soon as you walk out the door, you see your garden has already been watered"
				+ " and all of your crops have been put in your shipping box. \nYou look around in awe, then look toward the gate to see Leon"
				+ " standing there.");
		Leon.setSize(200,250);
		add(Leon,50,50);
		JOptionPane.showMessageDialog(null,"Greetings. Why don't you accompany me to the forest?");
		remove (Leon);
		pause(100);
		add(Forest,50,50);
		add(Leon,100,100);
		JOptionPane.showMessageDialog(null,"When you get to the forest, you see a large clearing with a picnic set up.");
		String answer = JOptionPane.showInputDialog("So... there's a festival today. Would you be my dance partner?");
		if(answer.equalsIgnoreCase("yes")){//if yes
			JOptionPane.showMessageDialog(null,"Awesome! I can't wait!");
			JOptionPane.showMessageDialog(null,"As soon as Leon stops talking, you hear the festival bells from town start to ring. You two quickly rush back, and dance the night away"
					+ "at the flower festival");
			JOptionPane.showMessageDialog(null,"The end");
		}//if yes
		else{//else
			remove(Forest);
			remove(Leon);
			JOptionPane.showMessageDialog(null,"Okay buddy listen here, this game is a dating sim. You just turned down the character that you talked to the most. You're kidding me, right?"
					+ "\nOkay well that's game over so yea have fun replaying the whole game to try and get right back here.");
			}//else
		
	}//LeonFestival
	
	
	
	
	
	

}//end
