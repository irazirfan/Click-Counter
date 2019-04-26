package GUILayer;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class GameFrame extends JFrame{

	JPanel pnl;
	JLabel lblScore;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btnExit;
	Random rand;
	Timer  timer;
	int b = 0;
	private JButton selectedButton;
	int score=0;
	
	public GameFrame() {
		
		super("Click Counter");
		this.setSize(500,700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pnl = new JPanel();
		pnl.setLayout(null);
		pnl.setBackground(Color.CYAN);
		
		lblScore = new JLabel("Score: ");
		lblScore.setFont(new Font("Serif", Font.BOLD, 20));
		lblScore.setBackground(Color.GREEN);
		lblScore.setBounds(170, 50, 100, 40);
		pnl.add(lblScore);
		
		btn1 = new JButton("Button 1");
		btn1.setFont(new Font("Serif", Font.BOLD, 20));
		btn1.setBackground(Color.GREEN);
		btn1.setBounds(80, 130, 130, 40);
		btn1.addActionListener(new GameHandler());
		pnl.add(btn1);
		
		btn2 = new JButton("Button 2");
		btn2.setFont(new Font("Serif", Font.BOLD, 20));
		btn2.setBackground(Color.GREEN);
		btn2.setBounds(260, 130, 130, 40);
		btn2.addActionListener(new GameHandler());
		pnl.add(btn2);
		
		btn3 = new JButton("Button 3");
		btn3.setFont(new Font("Serif", Font.BOLD, 20));
		btn3.setBackground(Color.GREEN);
		btn3.setBounds(80, 190, 130, 40);
		btn3.addActionListener(new GameHandler());
		pnl.add(btn3);
		
		btn4 = new JButton("Button 4");
		btn4.setFont(new Font("Serif", Font.BOLD, 20));
		btn4.setBackground(Color.GREEN);
		btn4.setBounds(260, 190, 130, 40);
		btn4.addActionListener(new GameHandler());
		pnl.add(btn4);
		
		btn5 = new JButton("Button 5");
		btn5.setFont(new Font("Serif", Font.BOLD, 20));
		btn5.setBackground(Color.GREEN);
		btn5.setBounds(80, 250, 130, 40);
		btn5.addActionListener(new GameHandler());
		pnl.add(btn5);
		
		btn6 = new JButton("Button 6");
		btn6.setFont(new Font("Serif", Font.BOLD, 20));
		btn6.setBackground(Color.GREEN);
		btn6.setBounds(260, 250, 130, 40);
		btn6.addActionListener(new GameHandler());
		pnl.add(btn6);
		
		btn7 = new JButton("Button 7");
		btn7.setFont(new Font("Serif", Font.BOLD, 20));
		btn7.setBackground(Color.GREEN);
		btn7.setBounds(80, 310, 130, 40);
		btn7.addActionListener(new GameHandler());
		pnl.add(btn7);
		
		btn8 = new JButton("Button 8");
		btn8.setFont(new Font("Serif", Font.BOLD, 20));
		btn8.setBackground(Color.GREEN);
		btn8.setBounds(260, 310, 130, 40);
		btn8.addActionListener(new GameHandler());
		pnl.add(btn8);
		
		btn9 = new JButton("Button 9");
		btn9.setFont(new Font("Serif", Font.BOLD, 20));
		btn9.setBackground(Color.GREEN);
		btn9.setBounds(80, 370, 130, 40);
		btn9.addActionListener(new GameHandler());
		pnl.add(btn9);
		
		btn10 = new JButton("Button 10");
		btn10.setFont(new Font("Serif", Font.BOLD, 20));
		btn10.setBackground(Color.GREEN);
		btn10.setBounds(260, 370, 130, 40);
		btn10.addActionListener(new GameHandler());
		pnl.add(btn10);
		
		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Serif", Font.BOLD, 20));
		btnExit.setBackground(Color.YELLOW);
		btnExit.setBounds(80, 500, 310, 40);
		btnExit.addActionListener(new GameHandler());
		pnl.add(btnExit);
		
		this.add(pnl);
		
		this.rand = new Random();
		ActionListener timerListener = new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				
				b=rand.nextInt(10);
				if(b==1) {
					selectedButton=btn1;
					btn1.setBackground(Color.MAGENTA);
					btn2.setBackground(Color.GREEN);
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					btn7.setBackground(Color.GREEN);
					btn8.setBackground(Color.GREEN);
					btn9.setBackground(Color.GREEN);
					btn10.setBackground(Color.GREEN);					
				}
				else if(b==2) {
					selectedButton=btn2;
					btn2.setBackground(Color.MAGENTA);
					btn1.setBackground(Color.GREEN);
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					btn7.setBackground(Color.GREEN);
					btn8.setBackground(Color.GREEN);
					btn9.setBackground(Color.GREEN);
					btn10.setBackground(Color.GREEN);
				}
				else if(b==3) {
					selectedButton=btn3;
					btn1.setBackground(Color.GREEN);
					btn2.setBackground(Color.GREEN);
					btn3.setBackground(Color.MAGENTA);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					btn7.setBackground(Color.GREEN);
					btn8.setBackground(Color.GREEN);
					btn9.setBackground(Color.GREEN);
					btn10.setBackground(Color.GREEN);
				}
				else if(b==4) {
					selectedButton=btn4;
					btn1.setBackground(Color.GREEN);
					btn2.setBackground(Color.GREEN);
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.MAGENTA);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					btn7.setBackground(Color.GREEN);
					btn8.setBackground(Color.GREEN);
					btn9.setBackground(Color.GREEN);
					btn10.setBackground(Color.GREEN);
				}
				else if(b==5) {
					selectedButton=btn5;
					btn1.setBackground(Color.GREEN);
					btn2.setBackground(Color.GREEN);
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.MAGENTA);
					btn6.setBackground(Color.GREEN);
					btn7.setBackground(Color.GREEN);
					btn8.setBackground(Color.GREEN);
					btn9.setBackground(Color.GREEN);
					btn10.setBackground(Color.GREEN);
				}
				else if(b==6) {
					selectedButton=btn6;
					btn1.setBackground(Color.GREEN);
					btn2.setBackground(Color.GREEN);
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.MAGENTA);
					btn7.setBackground(Color.GREEN);
					btn8.setBackground(Color.GREEN);
					btn9.setBackground(Color.GREEN);
					btn10.setBackground(Color.GREEN);
				}
				else if(b==7) {
					selectedButton=btn7;
					btn1.setBackground(Color.GREEN);
					btn2.setBackground(Color.GREEN);
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					btn7.setBackground(Color.MAGENTA);
					btn8.setBackground(Color.GREEN);
					btn9.setBackground(Color.GREEN);
					btn10.setBackground(Color.GREEN);
				}
				else if(b==8) {
					selectedButton=btn8;
					btn1.setBackground(Color.GREEN);
					btn2.setBackground(Color.GREEN);
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					btn7.setBackground(Color.GREEN);
					btn8.setBackground(Color.MAGENTA);
					btn9.setBackground(Color.GREEN);
					btn10.setBackground(Color.GREEN);
				}
				else if(b==9) {
					btn1.setBackground(Color.GREEN);
					btn2.setBackground(Color.GREEN);
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					btn7.setBackground(Color.GREEN);
					btn8.setBackground(Color.GREEN);
					btn9.setBackground(Color.MAGENTA);
					btn10.setBackground(Color.GREEN);
				}
				else if(b==10) {
					
					selectedButton=btn10;
					btn1.setBackground(Color.GREEN);
					btn2.setBackground(Color.GREEN);
					btn3.setBackground(Color.GREEN);
					btn4.setBackground(Color.GREEN);
					btn5.setBackground(Color.GREEN);
					btn6.setBackground(Color.GREEN);
					btn7.setBackground(Color.GREEN);
					btn8.setBackground(Color.GREEN);
					btn9.setBackground(Color.GREEN);
					btn10.setBackground(Color.MAGENTA);
				}								
			}
		};
		int timerDelay = 400*4;
		Timer timer = new Timer(timerDelay,timerListener);
		timer.start();
		
 	}
	
	private class GameHandler implements ActionListener {

		public void actionPerformed(ActionEvent ae) {
			
			if(ae.getSource()==btnExit) {
				
				System.exit(0);
			}
			
			if(ae.getSource()==selectedButton)
			{
				score+=100;
				lblScore.setText("Score: "+score);
			}
			else
			{
				score-=50;;
				lblScore.setText("Score: "+score);
			}
		}

	}
}