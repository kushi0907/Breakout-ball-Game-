		// the scores 		
		g.setColor(Color.white);
		g.setFont(new Font("serif",Font.BOLD, 25));
		g.drawString(""+score, 590,30);

		// when you won the game
		if(totalbricks <= 0)
		{
			play = false;
		    ballXdir = 0;
		    ballYdir = 0;
		    g.setColor(Color.RED);
		    g.setFont(new Font("serif",Font.BOLD, 30));
		    g.drawString("You Won", 260,300);
		             
		    g.setColor(Color.RED);
		    g.setFont(new Font("serif",Font.BOLD, 20));           
		    g.drawString("Press (Enter) to Restart", 230,350);  
		}
				
		// when you lose the game
		if(ballposY > 570)
		{
			play = false;
		    ballXdir = 0;
		    ballYdir = 0;
		    g.setColor(Color.RED);
		    g.setFont(new Font("serif",Font.BOLD, 30));
		    g.drawString("Game Over, Scores: "+score, 190,300);
		             
		    g.setColor(Color.RED);
		    g.setFont(new Font("serif",Font.BOLD, 20));           
		    g.drawString("Press (Enter) to Restart", 230,350);        
		}