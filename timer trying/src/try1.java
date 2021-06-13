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
		long start = System.currentTimeMillis();
		boolean x = false;
		while(!x) {
			System.out.println(System.currentTimeMillis()-start);
			if((System.currentTimeMillis()-start) == 2000) {
				sound();
				x = true;
			}}}
	public static void sound() {
		try
	    {
	        File musicPath = new File("/Users/jayatigupta/Downloads/hello my name is Anuj.wav");
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