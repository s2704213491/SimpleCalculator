import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.colorchooser.ColorChooserComponentFactory;
public class Calc implements ActionListener {	
	boolean isOperatorClicked=false;
	String oldValue,newValue;
	JFrame jf;
	JLabel displaylabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton subbutton;
	JButton multiplebutton;
	JButton divbutton;
	JButton plusbutton;
	JButton pointbutton;
	JButton equalbutton;
	JButton zerobutton;
	JButton clearbutton;
	public Calc() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(400,200);
		displaylabel=new JLabel();
		displaylabel.setBounds(30,50,540,70);
		displaylabel.setBackground(Color.darkGray);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.white);
		
		
		
		
		jf.add(displaylabel);
		
		
		
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(30, 130, 80, 80);
		sevenbutton.addActionListener(this);
		sevenbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(sevenbutton);
		
		
		eightbutton=new JButton("8");
		eightbutton.setBounds(130, 130, 80, 80);
		eightbutton.addActionListener(this);
		eightbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(eightbutton);
		
		
		
		ninebutton=new JButton("9");
		ninebutton.setBounds(230, 130, 80, 80);
		ninebutton.addActionListener(this);
		ninebutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(ninebutton);
		
		
		
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(30, 230, 80, 80);
		fourbutton.addActionListener(this);
		fourbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(fourbutton);
		
		
		
		fivebutton=new JButton("5");
		fivebutton.setBounds(130, 230, 80, 80);
		fivebutton.addActionListener(this);
		fivebutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(fivebutton);
		
		
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(230, 230, 80, 80);
		sixbutton.addActionListener(this);
		sixbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(sixbutton);
		
		
		
		onebutton=new JButton("1");
		onebutton.setBounds(30, 330, 80, 80);
		onebutton.addActionListener(this);
		onebutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(onebutton);
		
		
		
		twobutton=new JButton("2");
		twobutton.setBounds(130, 330, 80, 80);
		twobutton.addActionListener(this);
		twobutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(twobutton);
		
		
		
		threebutton=new JButton("3");
		threebutton.setBounds(230, 330, 80, 80);
		threebutton.addActionListener(this);
		threebutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(threebutton);
		
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(130, 430, 80, 80);
		zerobutton.addActionListener(this);
		zerobutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(zerobutton);
		
		
		
		equalbutton=new JButton("=");
		equalbutton.setBounds(230, 430, 80, 80);
		equalbutton.addActionListener(this);
		equalbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(equalbutton);
		
		
		pointbutton=new JButton(".");
		pointbutton.setBounds(30, 430, 80, 80);
		pointbutton.addActionListener(this);
		pointbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(pointbutton);
		
		
		divbutton=new JButton("/");
		divbutton.setBounds(330, 130, 80, 80);
	    divbutton.addActionListener(this);
		divbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(divbutton);
		
		
		multiplebutton=new JButton("*");
		multiplebutton.setBounds(330, 230, 80, 80);
		multiplebutton.addActionListener(this);
		multiplebutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(multiplebutton);
		
		
		subbutton=new JButton("-");
		subbutton.setBounds(330, 330, 80, 80);
		subbutton.addActionListener(this);
		subbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(subbutton);
		
		
	    plusbutton=new JButton("+");
		plusbutton.setBounds(330, 430, 80, 80);
		plusbutton.addActionListener(this);
		plusbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(plusbutton);
		
		
		clearbutton=new JButton("C");
		clearbutton.setBounds(430, 430, 80, 80);
		clearbutton.addActionListener(this);
		clearbutton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(clearbutton);
		
		jf.setVisible(true);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new Calc();
	} 
	
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		if(e.getSource()==sevenbutton) {
			if(isOperatorClicked) {
				displaylabel.setText("7");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"7");
			}
		}else if(e.getSource()==eightbutton) {
			if(isOperatorClicked) {
				displaylabel.setText("8");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"8");
			}
		}else if(e.getSource()==ninebutton) {
			if(isOperatorClicked) {
				displaylabel.setText("9");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"9");
			}
		}else if(e.getSource()==fourbutton) {
			if(isOperatorClicked) {
				displaylabel.setText("4");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"4");
			}
		}else if(e.getSource()==fivebutton) {
			if(isOperatorClicked) {
				displaylabel.setText("5");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"5");
			}
		}else if(e.getSource()==sixbutton) {
			if(isOperatorClicked) {
				displaylabel.setText("6");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"6");
			}
		}else if(e.getSource()==onebutton) {
			if(isOperatorClicked) {
				displaylabel.setText("1");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"1");
			}
		}else if(e.getSource()==twobutton) {
			if(isOperatorClicked) {
				displaylabel.setText("2");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"2");
			}
		}else if(e.getSource()==threebutton) {
			if(isOperatorClicked) {
				displaylabel.setText("3");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"3");
			}
		}else if(e.getSource()==zerobutton) {
			if(isOperatorClicked) {
				displaylabel.setText("0");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"0");
			}
		}else if(e.getSource()==pointbutton) {
			if(isOperatorClicked) {
				displaylabel.setText(".");
				isOperatorClicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+".");
			}
		}else if(e.getSource()==plusbutton) {
			oldValue=displaylabel.getText();
			isOperatorClicked=true;
		}else if(e.getSource()==subbutton) {
			oldValue=displaylabel.getText();
			isOperatorClicked=true;
		}else if(e.getSource()==multiplebutton) {
			oldValue=displaylabel.getText();
			isOperatorClicked=true;
		}else if(e.getSource()==divbutton) {
			oldValue=displaylabel.getText();
			isOperatorClicked=true;
		}else if(e.getSource()==clearbutton) {
			oldValue=displaylabel.getText();
		    displaylabel.setText("");	
		}else if(e.getSource()==equalbutton) {
			String newValue=displaylabel.getText();
			float oldValueF=Float.parseFloat(oldValue);   
			float newValueF=Float.parseFloat(newValue);
			float result=oldValueF+newValueF;
			
			displaylabel.setText(result+"");
			
		}
		
		
		
	}


}
