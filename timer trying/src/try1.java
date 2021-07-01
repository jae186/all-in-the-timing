import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.*;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

 
public class try1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Type go to start");
		if(in.next().equals("go")) {
			timer();
		}}
	
	public static void timer() {
		long ltime = 0; long ctime = 0;
		long start = System.currentTimeMillis();
		boolean x = false;
		while(!x) {
			ctime = (System.currentTimeMillis()- start)/1000;
			if(ltime != ctime && ctime%5==0)
				System.out.println(ctime);
			ltime = (System.currentTimeMillis()- start)/1000;
		
			if((System.currentTimeMillis()-start) == 600000) {
				sound();
				x = true;
			}}}
	public static void sound() {
		try
	    {
	        File musicPath = new File("/Users/jayatigupta/Downloads/favorite crime updated.wav");
	        if(musicPath.exists())
	        {
	        	AudioInputStream audioInput =  AudioSystem.getAudioInputStream(musicPath);
	        	Clip clip = AudioSystem.getClip();
	        	clip.open(audioInput);
	        	clip.start();
	        	clip.loop(Clip.LOOP_CONTINUOUSLY);
	        	JOptionPane.showMessageDialog(null, "Press ok to stop playing");
	        	clip.stop();
	        }
	        else
	        { 
	        	System.out.println("Can't find file");

	        }
	    } 
		catch(Exception e) {
			e.printStackTrace();
		}
	}		
	}