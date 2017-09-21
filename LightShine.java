import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LightShine
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("Translation light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new ShinePanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}

    class ShinePanel extends JPanel
{
	private final int WIDTH=500,HEIGHT=500;
	private int JUMP;
	private int x,y;
    int count=0;
	Color color;
	private JButton push;

	
	public ShinePanel()
	{
		push=new JButton("ON");
		push.addActionListener(new ButtonListener());
		add(push);
		setBackground(Color.blue);
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setFocusable(true);
		
		
	}
	
	public void paintComponent(Graphics g)
	{

		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillRect(50,50,300,80);
		g.setColor(Color.gray);
		g.fillArc(60,60,60,60,0,360);
		g.fillArc(130,60,60,60,0,360);
		g.fillArc(200,60,60,60,0,360);
		g.setColor(color);
		g.fillArc(60+JUMP,60,60,60,0,360);
		   
		
	}

    private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			count++;
		   if(count%3==0)
		  {
			color=Color.red;
			JUMP=0;
		  }
		  if(count%3==1)
		  {
			color=Color.green;
		   JUMP=70;
		  }
		  if(count%3==2)
		  {
			color=Color.yellow;
		   JUMP=140;
		  }
		  
		  repaint();
		}
		
			
		
	}
}
	
