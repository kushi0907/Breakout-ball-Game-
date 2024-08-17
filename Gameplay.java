private MapGenerator map;

public Gameplay()
{
	map = new MapGenerator(4,9);
        addKeyListener(this); //to detect keys
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start(); //to start the game cycle
}