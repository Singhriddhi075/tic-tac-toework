package Game;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tictactoe extends JFrame implements ActionListener {
	public static int Board_Size=3;
	public static enum Gamestatus{
		Incomplete,Xwins,Zwins,tie;
	}
	private JButton[][] buttons=new JButton[Board_Size][Board_Size];
	boolean crossturn=true;
	
	public Tictactoe() {
		super.setTitle("TICTACTOE");
		super.setSize(800,800);
		GridLayout grid=new GridLayout(Board_Size,Board_Size);
		super.setLayout(grid);
		Font font=new Font("Comic sans",1,150);
		for(int row=0;row<Board_Size;row++) {
			for(int col=0;col<Board_Size;col++) {
				JButton button=new JButton("");
				buttons[row][col]=button;
				button.setFont(font);
				button.addActionListener(this);
				super.add(button);
			}
		}
		super.setResizable(false);
		super.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton Clickedbutton=(JButton)e.getSource();
		makeMove(Clickedbutton);
		Gamestatus gs=this.getGamestatus();
	}
	

	private void makeMove(JButton Clickedbutton) {
		String btntext=Clickedbutton.getText();
		if(btntext.length()>0) {
			JOptionPane.showMessageDialog(this, "Invalid move");
		}else {
			if(crossturn) {
				Clickedbutton.setText("X");
				
			}else {
				Clickedbutton.setText("0");
			}
			crossturn=!crossturn;
		}
	}
	private Gamestatus getGamestatus() {
		String text1="",text2="";
	}

}
