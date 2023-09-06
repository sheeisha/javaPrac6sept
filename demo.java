package syit31prac;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class demo implements ItemListener{

		
	JTabbedPane jp;
	
	JPanel p;
	JFrame f;
	
	demo()
	{
		jp = new JTabbedPane();
		jp.add("fy", new FY());
		jp.add("sy", new SY());
		
		
		
		p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(jp);
		
		
		f = new JFrame();
		f.add(p);
		f.pack();
		f.setSize(500, 500);
		f.setVisible(true);
	}
	
	

class FY extends JPanel implements ItemListener{
	JComboBox<String> cb;
	JLabel j1;

	FY(){
		cb = new JComboBox<String>();
		cb.addItem("--select--");
		cb.addItem("it");
		cb.addItem("bms");
		cb.addItem("bmm");
		cb.addItemListener(this);
		j1 = new JLabel("courses");
		add(j1);
		add(cb);
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getStateChange()==ItemEvent.SELECTED)
		{
			String s =  e.getItem().toString();
			if(s!="--select--")
			{
				JOptionPane.showMessageDialog(null, s);
			}
		}
	}
}

class SY extends JPanel implements ItemListener{
	ImageIcon ic;
	JLabel j2;

	SY(){
		j2 = new JLabel("syhj");
		ic = new ImageIcon("C:\\Users\\Hp\\Pictures\\Screenshots\\Screenshot (95).png");
		j2.setIcon(ic);
		add(j2);
		}
	
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		/*
		 * String s = e.getItem().toString(); if(s!="--select--") {
		 * JOptionPane.showMessageDialog(null, s); }
		 */
	}
}

public static void main(String[] args) {
	new demo();
}

@Override
public void itemStateChanged(ItemEvent e) {
	// TODO Auto-generated method stub
	
}

}
