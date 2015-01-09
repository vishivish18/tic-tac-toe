import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;


public class PlayFrame extends JFrame implements ActionListener 
{

	int aFlag=0;
	JFrame play;
	Container c;
	JLabel skin;
	int crosssum[]={0,0,0,0,0,0,0,0};
	int circlesum[]={0,0,0,0,0,0,0,0};
	JButton[][] click = new JButton[3][3];
	JLabel [][] circle=new JLabel[3][3];
	JLabel [][] cross=new JLabel[3][3];
	
	int [][]circlevalue = new int [3][3];
	int [][]crossvalue= new int [3][3];
	
	public PlayFrame()
	{
		
		play = new JFrame("Tic-Tac-Toe");
		play.setLayout(null);
		play.setLocation(200,200);
		play.setVisible(true);
		play.setSize(600,450);
		play.setDefaultCloseOperation(EXIT_ON_CLOSE);
		play.setResizable(false);
		//play.setBackground(Color.black);
		ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));
		play.setIconImage(img.getImage());
		
		///play.setIconImage( Image  )
	}
	
	public void addcomp()
	{
		c =play.getContentPane();
		c.setBackground(Color.black);
		//skin = new JLabel(new ImageIcon("images\\skin.png"));
		skin = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("skin.png")));
		c.add(skin);
		skin.setBounds(0,0,600,400);
		int y=0;
		for(int i=0;i<3;i++)
		{
			int x=0;
			for(int j=0;j<3;j++)
			{
				circle[i][j]= new JLabel(new ImageIcon(getClass().getClassLoader().getResource("circle.png")));
				c.add(circle[i][j]);
				circle[i][j].setBounds(85+x,25+y,107,95);
				circle[i][j].setVisible(false);
				
				
				
				
				cross[i][j]= new JLabel(new ImageIcon(getClass().getClassLoader().getResource("cross.png")));
				c.add(cross[i][j]);
				cross[i][j].setBounds(85+x,25+y,107,95);
				cross[i][j].setVisible(false);
				
				
				click[i][j]= new JButton(new ImageIcon(""));
				c.add(click[i][j]);
				click[i][j].setBounds(85+x,25+y,107,95);
				
				click[i][j].addActionListener(this);
				
				
				

		         click[i][j].setFocusPainted(false);
		         click[i][j].setMargin(new Insets(0, 0, 0, 0));
		         click[i][j].setContentAreaFilled(false);
		         click[i][j].setBorderPainted(false);
		         click[i][j].setOpaque(false);
				
		         x=x+165;
				
				
			}
			y=y+125;
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		
		PlayFrame pf = new PlayFrame();
		pf.addcomp();
		pf.WinnerLogic();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		///////////////cross clicks///////////////////////
		
		
		if(e.getSource()==click[0][0] )
		{
			
			if(aFlag==0)
			{
				cross[0][0].setVisible(true);
				crossvalue[0][0]=1;
				WinnerLogic();
				aFlag=1;
				click[0][0].setVisible(false);
			}
			else
			{
				circle[0][0].setVisible(true);
				circlevalue[0][0]=1;
				WinnerLogic();
				aFlag=0;
				click[0][0].setVisible(false);
			}
		}
		if(e.getSource()==click[0][1] )
		{
			
			if(aFlag==0)
			{	
			cross[0][1].setVisible(true);
			crossvalue[0][1]=1;
			WinnerLogic();
			aFlag=1;
			click[0][1].setVisible(false);
			}
			else
			{
				circle[0][1].setVisible(true);
				circlevalue[0][1]=1;
				WinnerLogic();
				
				aFlag=0;
				click[0][1].setVisible(false);
			}
			
		}

		if(e.getSource()==click[0][2] )
		{
			
			if(aFlag==0)
			{	
			cross[0][2].setVisible(true);
			crossvalue[0][2]=1;
			WinnerLogic();
			
			aFlag=1;
			click[0][2].setVisible(false);
			}
			else
			{
				circle[0][2].setVisible(true);
				circlevalue[0][2]=1;
				WinnerLogic();
				
				aFlag=0;
				click[0][2].setVisible(false);
			}			
		}

		if(e.getSource()==click[1][0] )
		{
			
			if(aFlag==0)
			{	
			cross[1][0].setVisible(true);
			crossvalue[1][0]=1;
			WinnerLogic();
			aFlag=1;
			click[1][0].setVisible(false);
			
			}
			else
			{
				circle[1][0].setVisible(true);
				circlevalue[1][0]=1;
				WinnerLogic();
				
				aFlag=0;
				click[1][0].setVisible(false);
			}
		}

		if(e.getSource()==click[1][1] )
		{
			
			if(aFlag==0)
			{	
			cross[1][1].setVisible(true);
			crossvalue[1][1]=1;
			WinnerLogic();
			aFlag=1;
			click[1][1].setVisible(false);
			}
			else
			{
				circle[1][1].setVisible(true);
				circlevalue[1][1]=1;
				WinnerLogic();
				
				aFlag=0;
				click[1][1].setVisible(false);
			}
		}

		if(e.getSource()==click[1][2] )
		{
			if(aFlag==0)
			{	
			cross[1][2].setVisible(true);
			crossvalue[1][2]=1;
			WinnerLogic();
			aFlag=1;
			click[1][2].setVisible(false);
			}
			else
			{
				circle[1][2].setVisible(true);
				circlevalue[1][2]=1;
				WinnerLogic();
				
				aFlag=0;
				click[1][2].setVisible(false);
			}
			
		}

		if(e.getSource()==click[2][0] )
		{
			
			if(aFlag==0)
			{	
			cross[2][0].setVisible(true);
			crossvalue[2][0]=1;
			WinnerLogic();
			aFlag=1;
			click[2][0].setVisible(false);
			}
			else
			{
				circle[2][0].setVisible(true);
				circlevalue[2][0]=1;
				WinnerLogic();
				
				aFlag=0;
				click[2][0].setVisible(false);
			}
			
		}

		if(e.getSource()==click[2][1] )
		{
			
			if(aFlag==0)
			{	
			cross[2][1].setVisible(true);
			crossvalue[2][1]=1;
			WinnerLogic();
			aFlag=1;
			click[2][1].setVisible(false);
			}
			else
			{
				circle[2][1].setVisible(true);
				circlevalue[2][1]=1;
				WinnerLogic();
				
				aFlag=0;
				click[2][1].setVisible(false);
			}
			
		}

		if(e.getSource()==click[2][2] )
		{
			
			if(aFlag==0)
			{	
			cross[2][2].setVisible(true);
			crossvalue[2][2]=1;
			WinnerLogic();
			aFlag=1;
			click[2][2].setVisible(false);
			}
			else
			{
				circle[2][2].setVisible(true);
				circlevalue[2][2]=1;
				WinnerLogic();
				
				aFlag=0;
				click[2][2].setVisible(false);
			}
			
		}
////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Cross");
		for(int m=0;m<3;m++)
		{
			
			for(int n=0;n<3;n++)
			{	
				
				System.out.print(""+crossvalue[m][n]+"	");
				
				//System.out.println("Circle");
				//System.out.print(""+circle[m][n]+"	");
				
			//System.out.println("indexes of circle matrix"+m+"and"+n+circle[m][n]);
				
				
				
			}
		System.out.println();
		}
		
		System.out.println();
	}
	
	public void  WinnerLogic()
	{
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				if(aFlag==0)
				{
				crosssum[0]=crossvalue[0][0]+crossvalue[0][1]+crossvalue[0][2];
				crosssum[1]=crossvalue[1][0]+crossvalue[1][1]+crossvalue[1][2];
				crosssum[2]=crossvalue[2][0]+crossvalue[2][1]+crossvalue[2][2];
				crosssum[3]=crossvalue[0][0]+crossvalue[1][0]+crossvalue[2][0];
				crosssum[4]=crossvalue[0][1]+crossvalue[1][1]+crossvalue[2][1];
				crosssum[5]=crossvalue[0][2]+crossvalue[1][2]+crossvalue[2][2];
				crosssum[6]=crossvalue[0][0]+crossvalue[1][1]+crossvalue[2][2];
				crosssum[7]=crossvalue[0][2]+crossvalue[1][1]+crossvalue[2][0];
				}
				else
				{		
				circlesum[0]=circlevalue[0][0]+circlevalue[0][1]+circlevalue[0][2];
				circlesum[1]=circlevalue[1][0]+circlevalue[1][1]+circlevalue[1][2];
				circlesum[2]=circlevalue[2][0]+circlevalue[2][1]+circlevalue[2][2];
				circlesum[3]=circlevalue[0][0]+circlevalue[1][0]+circlevalue[2][0];
				circlesum[4]=circlevalue[0][1]+circlevalue[1][1]+circlevalue[2][1];
				circlesum[5]=circlevalue[0][2]+circlevalue[1][2]+circlevalue[2][2];
				circlesum[6]=circlevalue[0][0]+circlevalue[1][1]+circlevalue[2][2];
				circlesum[7]=circlevalue[0][2]+circlevalue[1][1]+circlevalue[2][0];
				}
				
				
			}
			
			
		}
		
	for(int m=0;m<crosssum.length;m++)
	{
		
		System.out.println(crosssum[m]);
		if(crosssum[m]==3)
		{
			JOptionPane.showMessageDialog(null,"Cross is the Winner !!!!!!!!!!!!!!");
			int y=0;
			for(int i=0;i<3;i++)
			{
				int x=0;
				for(int j=0;j<3;j++)
				{
					
					circle[i][j].setVisible(false);
					cross[i][j].setVisible(false);
					
				}
			}
			c.repaint();
			c.revalidate();
			
			
		}
		
		System.out.println(circlesum[m]);
		if(circlesum[m]==3)
		{
			JOptionPane.showMessageDialog(null,"Circle is the Winner !!!!!!!!!!!!!!");
			for(int i=0;i<3;i++)
			{
				int x=0;
				for(int j=0;j<3;j++)
				{
					
					circle[i][j].setVisible(false);
					cross[i][j].setVisible(false);
					
				}
			}
			c.repaint();
			c.revalidate();
			
			
		}
			
	}
		
	
	
	
	
	
	
	System.out.println();
		
	}
	
	
	
}
