import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Email
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("Email");
		frame.setDefaultCloseOperation(
		JFrame.EXIT_ON_CLOSE);
		Container contenPane=frame.getContentPane();
		contenPane.add(new MyPanel());
		frame.pack();
		frame.setVisible(true);
	}
}

class MyPanel extends JPanel implements ActionListener
{
	JLabel label1,label2,label3,label4;
	JTextField add1,add2,add3,add4;
	JTextArea text;
	String item[]= {"http://www.yahoo.com.cn/","http://www.soho.com.cn/",
	"http://www.xidian.edu.cn/","http://www.baidu.com/"};
    JComboBox sadd=new JComboBox(item);
	JButton button1,button2;
	 ButtonListener listener=new ButtonListener(); 
	
	public MyPanel()
	{
		setBackground(Color.pink);
		setPreferredSize(new Dimension(350,300));
		
		label1=new JLabel("收件人");
		label1.setFont(new Font("黑体",Font.BOLD,15));
		label2=new JLabel("抄送地址");
		label2.setFont(new Font("黑体",Font.BOLD,15));
		label3=new JLabel("匿名地址");
		label3.setFont(new Font("黑体",Font.BOLD,15));
		label4=new JLabel("主题");
		label4.setFont(new Font("黑体",Font.BOLD,15));
		
		add1=new JTextField(20);
		add2=new JTextField(20);
		add3=new JTextField(20);
		add4=new JTextField(20);
		
		text=new JTextArea("信件内容",10,40);
		text.setLineWrap(true);
		text.setForeground(Color.black);
		text.setFont(new Font("宋体",Font.BOLD,16));
		button1=new JButton("SEND");
		button1.addActionListener(listener);
		button2=new JButton("CANCEL");
		button2.addActionListener(listener);
		
		add(label1);
		add(add1);
		add(label2);
		add(add2);
		add(label3);
		add(add3);
		add(label4);
		add(add4);
		add(text);		
		add(button1);
		add(button2);
		
		
	}
private class ButtonListener implements ActionListener{
	

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1){
			
		
		String text0=text.getText();
		System.out.println(text0);
		}
		if(e.getSource()==button2)
		{
			text.setText("");
		}
	}
}

public void actionPerformed(ActionEvent e){
    	 
	
	
	
}
}
