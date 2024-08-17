package breakoutBall;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.Timer;
import javax.swing.JPanel;

public class Gameplay extends JPanel {
	
	private boolean play = false;
	private int score = 0;
	private int totalbricks = 36;
	
	//Timer
	private Timer timer;
	private int delay = 8;
	
	//position of paddle
	private int playerX = 310;
	
	//position of ball
	private int ballposX = 120;
	private int ballposY = 350;
	private int ballXdir = -1;
	private int ballYdir = -2;
	
	public void paint(Graphics g)
	{    		
		// background
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592);
		
		//drawing map
		map.draw((Graphics2D) g);
		
		// borders
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(681, 0, 3, 592);
		
		// the paddle
		g.setColor(Color.green);
		g.fillRect(playerX, 550, 100, 8);
		
		// the ball
		g.setColor(Color.yellow);
		g.fillOval(ballposX, ballposY, 20, 20);
		
	}
}