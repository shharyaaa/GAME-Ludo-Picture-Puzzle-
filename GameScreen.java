import LUDO_BUILD.*;
import java.awt.*;

import javax.swing.*;

public class GameScreen 
{
	public GameScreen()
	{
		JFrame jframe = new JFrame();
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		jframe.setSize(screenSize.width,screenSize.height);
        //jframe.setBounds(10,10,1000,600);
        jframe.setTitle("LUDO");
        //jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameMoves gm = new GameMoves();
        gm.setFocusable(true);
        gm.addKeyListener(gm);
        gm.addMouseListener(gm);
        jframe.add(gm);
        jframe.setVisible(true);
	   }
}
