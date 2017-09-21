import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MainPanel extends JPanel implements ActionListener{
	private JButton button1,button2,button3,button4,button5;
	private JButton button6,button7,button8,button9,button0;
	private JButton button00,button11;
	private JButton m1,m2,m3;
	private JPanel p1,p2,p3,p11;
	private JLabel label;
	private JButton a1,a2,a3,a4,a5,a6;
	 
	Timer timer=new Timer(2000,this); 
      public MainPanel() {
    	  setPreferredSize(new Dimension(500,500));
          setLayout(new BorderLayout());   // 主面板为边框布局
    	  setBackground(Color.black); 	// 设置背景色   	
          ButtonListener listener=new ButtonListener(); 
              // 创建按纽监听器
    	
    	    p1=new JPanel();  // 创建数字键盘面板
    	    p1.setLayout(new GridLayout(5,3));  // 设置为4*3的网格布局
    	    p1.setBorder(BorderFactory.createRaisedBevelBorder()); 
               //设置突出斜面边缘边框
    	    button1=new JButton("1");
    	    button2=new JButton("2");
    	    button3=new JButton("3");
    	    button4=new JButton("4");
    	    button5=new JButton("5");
    	    button6=new JButton("6");
    	    button7=new JButton("7");
    	    button8=new JButton("8");
    	    button9=new JButton("9");
    	    button0=new JButton("0");
    	    button00=new JButton("00");
    	    button11=new JButton(".");	
    	    m1=new JButton("AC");
    	    m2=new JButton("+/-");
    	    m3=new JButton("%");
    	    m1.setBackground(Color.LIGHT_GRAY);
    	    m2.setBackground(Color.LIGHT_GRAY);
    	    m3.setBackground(Color.LIGHT_GRAY);

    	    button1.addActionListener(listener);
    	    button2.addActionListener(listener);
    	    button3.addActionListener(listener);
    	    button4.addActionListener(listener);
    	    button5.addActionListener(listener);
    	    button6.addActionListener(listener);
    	    button7.addActionListener(listener);
    	    button8.addActionListener(listener);
    	    button9.addActionListener(listener);
    	    button0.addActionListener(listener);
    	    button00.addActionListener(listener);
    	    button11.addActionListener(listener);	
    			
    	    p1.add(m1);
    	    p1.add(m2);
    	    p1.add(m3);  	    
    	    p1.add(button7);
    	    p1.add(button8);
    	    p1.add(button9);
    	    p1.add(button4);
    	    p1.add(button5);
    	    p1.add(button6);
    	    p1.add(button1);
    	    p1.add(button2);
    	    p1.add(button3);
    	    p1.add(button0);
    	    p1.add(button00);
    	    p1.add(button11);
    	    
    	    p11=new JPanel();		// 创建按钮面板
    	    p11.setLayout(new GridLayout(6,1));  // 设置为网格布局
    	    p11.setBorder(BorderFactory.createRaisedBevelBorder()); 
               //设置突出斜面边缘边框
			   p11.add(m1);
    	    p11.add(m2);
    	    p11.add(m3);  
    	    a1=new JButton("OFF");
    	    a2=new JButton("/");
    	    a3=new JButton("*");
    	    a4=new JButton("-");
    	    a5=new JButton("+");
			a6=new JButton("=");
    	    p3=new JPanel();  // 创建标签面板
    	    p3.setBackground(Color.gray);
    	    a1.setBackground(Color.orange); 
    	    a2.setBackground(Color.orange);
    	    a3.setBackground(Color.orange);
    	    a4.setBackground(Color.orange);
    	    a5.setBackground(Color.orange);
			a6.setBackground(Color.orange);
    	    
    	    p11.add(p3);
    	    p11.add(a1);
    	    p11.add(a2);
    	    p11.add(a3);
    	    p11.add(a4);
    	    p11.add(a5);
			p11.add(a6);
    	
    	    a1.addActionListener(listener);
    	    a2.addActionListener(listener);
    	    a3.addActionListener(listener);
    	    a4.addActionListener(listener);
		    a5.addActionListener(listener);
    	   
    	       	       	    
    	    p2=new JPanel();  // 创建标签面板
    	    p2.setBackground(Color.black);
    	    p2.setBorder(BorderFactory.
              createLoweredBevelBorder());  
            // 设置边框
        
    	    label=new JLabel(" ");   // 显示标签
    	    label.setForeground(Color.red);
    	    label.setFont(new Font("SAN_SERIF",Font.BOLD,20)); 
    	    label.setHorizontalAlignment(SwingConstants.LEFT);
             // 设置标签内字体大小
            // label.setHorizontalAlignment(SwingConstants.LEFT); 
            // 标签内容显示水平居中。JLabel类已实现SwingConstants接口
    	    p2.add(label);

    	     add(p1,BorderLayout.CENTER);
    	     add(p2,BorderLayout.NORTH);
    	     add(p11,BorderLayout.EAST);
      }
    
      private class ButtonListener implements ActionListener  {
    	     private String s,s2;
    		 double x,y,z;
    		 int i;
    		 
    	     public void actionPerformed (ActionEvent event) {
    	    	 if (event.getSource()== a1)
    	    	 {	 label.setText("Welcome to use");
    	    	 		timer.start();
    	    	 }
    	    	 else if (event.getSource()== m1){	// 清除标签内容
    			     label.setText("Thanks for using");
    			     timer.start();
    	    	 }
    	    	 	
    	    	 else if (event.getSource()== a2)
    	    	 {
    	    		 i=2;
    	    		 s=label.getText();
    	    		 x=Double.parseDouble(s);
    	    		 label.setText(" "); 
    	    	 }
    	    	else if (event.getSource()== a6){
    	    			 s=label.getText();
    	    			 y=Double.parseDouble(s);
    	    			 label.setText(" "); 
    	    			 switch(i){
    	    			 case 2:{
    	    				 	if(y==0)
    	    				 		label.setText("ERROR");
    	    				 	else
    	    				 	{	z=x/y;
    	    				 		label.setText(" "+z);}
    	    				 		break;
    	    				 	}
    	    			 case 3:
    	    				 	label.setText(" "+(x*y));break;
    	 
    	    			 case 4:
 	    				 	label.setText(" "+(x-y));break;
    	    			 case 5:
 	    				 	label.setText(" "+(x+y));break;
    	    			 }
    	    		 }
    	    	else if (event.getSource()== a5){
    	    		i=5; 
    	    		s=label.getText();
    	    		 x=Double.parseDouble(s);
    	    		 label.setText(" "); 
    	    	}
    	    	else if (event.getSource()== a4){
   	    		 i=4;
    	    		s=label.getText();
   	    		 x=Double.parseDouble(s);
   	    		 label.setText(" "); 
   	    	   }
    	    	else if (event.getSource()== a3){
   	    		 i=3;
    	    		s=label.getText();
   	    		 x=Double.parseDouble(s);
   	    		 label.setText(" "); 
   	    	   }
    	    	
    	 
    	    	 else if (event.getSource()== button1)
    				      label.setText(label.getText()+"1");		
    		     else if (event.getSource()== button2)
    			 	      label.setText(label.getText()+"2");	 
    		     else if (event.getSource()== button3)
    			 	      label.setText(label.getText()+"3");	 
    	         else if (event.getSource()== button4)
    			 	      label.setText(label.getText()+"4");	 
    		     else if (event.getSource()== button5)
    			 	      label.setText(label.getText()+"5");	
    		     else if (event.getSource()== button6)
    			 	      label.setText(label.getText()+"6");	
    		     else if (event.getSource()== button7)
    			 	      label.setText(label.getText()+"7");	
    		     else if (event.getSource()== button8)
    			 	     label.setText(label.getText()+"8");
    		     else if (event.getSource()== button9)
    			 	     label.setText(label.getText()+"9");
    		     else if (event.getSource()== button0)
    			 	     label.setText(label.getText()+"0");
    		     else if (event.getSource()== button00)
			 	     label.setText(label.getText()+"00");
    		     else if (event.getSource()== button11)
			 	     label.setText(label.getText()+".");
    		     
			  }
	  }
    		     
    		     
	 					
     
    public void actionPerformed(ActionEvent e){
    	  if(e.getSource()==timer)
    		  label.setText(" ");
    	  timer.stop();
	}
}
  



public class MyCalcylator extends JFrame{

		public MyCalcylator(String s){
			super(s);
			Container contentPane=getContentPane();
			contentPane.setLayout(new BorderLayout());
			
			MainPanel my=new MainPanel();
			contentPane.add(my, BorderLayout.CENTER);
			
			setSize(400,300);
			setVisible(true);
		}
		
		public static void main(String arg[]){
			MyCalcylator F=new MyCalcylator("计算器");
		}
	}


