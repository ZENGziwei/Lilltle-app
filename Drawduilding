#Draw buildings
import java.awt.*;
import javax.swing.*;

public class DrawBuilding{
    public static void main(String args[]){
		JFrame frame=new JFrame("繁华城市");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame.add(new Panel());
		
		frame.pack();
		frame.setVisible(true);
		
	}		
	
}


class Building{
	private int width;
	private int height;
	private int windows;
	private  final  int MAX_WINDOWS=10;
	static final int BOTTOM=300;
	final int WINDOWS_SIZE=6;
	
	public Building(int width,int height)
	{
		this.width=width;
	    this.height=height;
	    windows=(int)(Math.random()*MAX_WINDOWS+1);
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getWindows(){
		return windows;
	}
	
	
	public void draw(Graphics g,int x_top){
		g.setColor(Color.black);  
		int y_top=BOTTOM-height;
		g.fillRect(x_top,y_top,width,height);
		
		g.setColor(Color.yellow);
		for(int i=1;i<windows;i++)
		{
			int x_side=x_top+(int)(Math.random()*width);
			if(x_side>=x_top+width-WINDOWS_SIZE)
				x_side-=WINDOWS_SIZE;
			int y_side=y_top+(int)(Math.random()*height);
			if(y_side>=BOTTOM-WINDOWS_SIZE)
				y_side=BOTTOM-WINDOWS_SIZE;
			  g.fillRect(x_side,y_side,WINDOWS_SIZE,WINDOWS_SIZE);
			
		}
	}
	
}

class Panel extends JPanel{
	private Building a1,a2,a3,a4,a5;
	public Panel()
	{
		setBackground(Color.blue);
		setPreferredSize(new Dimension(600,400));
		
		
		a1=new Building(50,255);
		a2=new Building(70,200);
		a3=new Building(30,179);
		a4=new Building(30,150);
		a5=new Building(100,255);
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.black);
	    g.drawLine(0,300,100000,300);
		a1.draw(g,20);
		a2.draw(g,80);
		a3.draw(g,160);
		a4.draw(g,200);
		a5.draw(g,250);
		

		
		
		
		
		
	}
}
