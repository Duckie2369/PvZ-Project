package Project_Plant_Vs_Zombies;

import javax.swing.*;

public class Window extends JFrame {
	enum Plants{
		None,
		Sunflower,
		Peashooter,
		FrozenPeashooter,
		CherryBomb,
		Wallnut
	}
	
	public Window() {
		setSize(1024,768);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
	}
}
