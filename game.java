import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color.*; 
import java.awt.Font.*;

import LUDO_BUILD.*;
import PicturePuzzle.*;
public class game 
{
	JButton b1,b2;
	game()
	{
		JFrame jf = new JFrame("GAME");
		JLabel jt1;
		jf.setContentPane(new JLabel(new ImageIcon("/exports/AG6/Project/cloud.jpg")));

		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		jf.setSize(screen.width,screen.height);

		jt1=new JLabel(" Choose one game! ");
		jt1.setForeground(Color.WHITE);
		Font fnt2=new Font("Times new Roman",Font.BOLD,40);
		jt1.setBackground(Color.YELLOW);
		jt1.setBounds(300,10,500,500);
		jt1.setFont(fnt2);

		JButton b1= new JButton("Ludo");
		b1.setBounds(200,300,280,100);
		b1.setFont(new Font("Times new Roman",Font.BOLD,30));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		JButton b2= new JButton("Picture Puzzle");
		b2.setBounds(600,300,280,100);
		b2.setFont(new Font("Times new Roman",Font.BOLD,30));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);

		jf.add(b1);
		jf.add(b2);
		jf.add(jt1);
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			GameScreen gm=new GameScreen();
		}
	});
	b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			picpuzzle pz=new picpuzzle();
		}
	});
	jf.setSize(300,300);
	jf.setLayout(null);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
	jf.setSize(screenSize.width,screenSize.height);
	}
	public static void main(String args[])
	{
		game obj=new game();
	}
}
