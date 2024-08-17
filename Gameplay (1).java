package breakoutBall;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

import javax.swing.JPanel;

public class Gameplay extends JPanel implements ActionListener, KeyListener{
	
	@Override
	public void keyPressed(KeyEvent e) {
                //when right key is pressed
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
                        //checking if it doesn't go outside the panel
			if(playerX >= 600) {
				playerX = 600;
			}
			else {
				moveRight();
			}
		}
		
                //when right key is pressed
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
                        //checking if it doesn't go outside the panel
			if(playerX < 10) {
				playerX = 10;
			}
			else {
				moveLeft();
			}
		}
		
                //if enter key is pressed
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
		{          
			if(!play)
			{
                                //to restart the game
				play = true;
				ballposX = 120;
				ballposY = 350;
				ballXdir = -1;
				ballYdir = -2;
				playerX = 310;
				score = 0;
				totalbricks = 36;
				map = new MapGenerator(4, 9);
			
				repaint(); 
			}
                }		
			
	}

	public void moveLeft() {
		play = true;
		playerX -=15;		
	}

	public void moveRight() {
		play = true;
		playerX += 15;
	}

}