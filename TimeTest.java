import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import javax.swing.*;
import java.applet.*;
import java.awt.Container;
import javax.swing.JFrame;
public class TimeTest {
		public static void main(String arg[]){
			JFrame j=new JFrame("计时器");
			j.setLocation(500,300);
			
			Container contantPanel=j.getContentPane();
			contantPanel.add(new MyJpanel().p2);
			j.pack();
			
			j.setResizable(true);
			j.setVisible(true);
			j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}

	}

class MyJpanel extends JPanel implements ActionListener {
	JButton start,stop,reset;
	JPanel p1,p2,p3;
	JLabel time1,time2,time3;
	JLabel m1,m2;
	int a1=0,a2=0,a3=0;
	Timer testimer=new Timer(1000,this);
	DecimalFormat form=new DecimalFormat("00");
	public MyJpanel(){
		p1=new JPanel();
		start=new JButton("start");
		stop=new JButton("stop");
		reset=new JButton("reset");
		start.addActionListener(this);
		stop.addActionListener(this);
		reset.addActionListener(this);
		p1.add(start);
		p1.add(stop);
		p1.add(reset);
	
		time1=new JLabel();
		time2=new JLabel();
		time3=new JLabel();
		time1.setText("00");
		time2.setText("00");
		time3.setText("00");
		time1.setFont(new Font("黑体",Font.BOLD,40));
		time2.setFont(new Font("黑体",Font.BOLD,40));
		time3.setFont(new Font("黑体",Font.BOLD,40));
		m1=new	JLabel(":");
		m2=new	JLabel(":");
		m1.setFont(new Font("黑体",Font.BOLD,20));
		m2.setFont(new Font("黑体",Font.BOLD,20));
		
		p3=new JPanel();
		p3.add(time1);
		p3.add(m1);
		p3.add(time2);
		p3.add(m2);
		p3.add(time3);
		
		
		p2=new JPanel();
		p2.setLayout(new BorderLayout());
		
		p2.add(p1, BorderLayout.EAST);
		p2.add(p3, BorderLayout.CENTER);
		
	}
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==start){
			testimer.start();			
		}
			
	
		if(e.getSource()==testimer){
			
			a3++;
			
			if(a3==60){
				a2++;
				a3=0;
				if(a2==60){
					a1++;
					a2=0;
				}
				}			
			time3.setText(""+form.format(a3));
			time2.setText(""+form.format(a2));
			time1.setText(""+form.format(a1));
			
		}
		else if(e.getSource()==stop){
			testimer.stop();
		}
		
		else if(e.getSource()==reset){
			time1.setText("00");
			time2.setText("00");
			time3.setText("00");
			a1=0;a2=0;a3=0;
			testimer.stop();
		}
		
	}	
 
}
