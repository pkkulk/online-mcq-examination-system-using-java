
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
public class B extends JFrame implements ActionListener
{  	Container ct;
     JButton b,d,result;
	 ButtonGroup bg[]=new ButtonGroup[10];
JRadioButton  ch[][]=new JRadioButton[10][4];
	 int c=1;
	 JPanel l1;
	 int y=20;
	 int cnt=0,select;
	 JLabel Name1,Name2,Name4,count,Name,enroll;
	 private JLabel l11,l22;
	 JButton b11[]=new JButton[50];
	 JPanel p21,p22;
	 JPanel p[]=new JPanel[10];
	 JLabel l[]=new JLabel[10];
	 int dot[]=new int[10];
	 Font f;
	public B()
	{ f=new Font("TimesNewRoman",Font.PLAIN,20);
	Border bzz=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED); 
	Dimension D;
	     D=Toolkit.getDefaultToolkit().getScreenSize();
				int w,h;
				w=(int)D.getWidth();
               h=(int)D.getHeight();
	p22=new JPanel();
	p21=new JPanel(new GridLayout(0,5));
	l1=new JPanel(new GridLayout(5,10,10,10));
		Container ct=getContentPane();
		ct.add(p22);
		ct.add(p21);
		ct.add(l1);
		d=new JButton("previous");
		l1.add(d);
		result=new JButton("Result");
	
		b=new JButton("next");
		l22=new JLabel(); 
		l11=new JLabel(); 
       enroll=new JLabel("Enroll no:2000160399");
       Name=new JLabel("Name:Prathmesh KUlkarni");
	    Name1=new JLabel("program code=IF5I");
	    Name2=new JLabel("Course=EST(22447)");
	    //Name3=new JLabel("roll no=51");
	    Name4=new JLabel("Course=EST(22447)");
	   p21.add(enroll);
	   p21.add(Name1);
	   p21.add(Name2);
	   p21.add(Name);
	   //p21.add(Name3);
	   p21.add(Name4);
	   
	   enroll.setFont(f);
	   Name.setFont(f);
	   Name1.setFont(f);
	   Name2.setFont(f);
	   //Name3.setFont(f);
	   Name4.setFont(f);
	   //p21.setLayout(null);
	   enroll.setBounds(0,40,600,70);
	   Name.setBounds(0,5,600,70);
	   
	   enroll.setForeground(Color.RED);
	   Name.setForeground(Color.RED);
	   Name1.setForeground(Color.RED);
	   Name2.setForeground(Color.RED);
	   //Name3.setForeground(Color.RED);
	   Name4.setForeground(Color.RED);
       count=new  JLabel();
	   for(int i=0;i<50;i++)
		 {
			 b11[i]=new JButton(""+i);
			 b11[i].setBorder(bzz);
			 l1.add(b11[i]);
			  b11[i].setBackground(Color.BLUE);
			  b11[i].addActionListener(this);
		
		}	
	  b11[0].setBackground(Color.GREEN);
		for(int i=0;i<10;i++)
		{
			l[i]=new JLabel();
			dot[i]=-1;
		}
		for(int i=0;i<10;i++)
		{
			p[i]=new JPanel(new GridLayout(5,1));
			ct.add(p[i]);
		}
		for(int i=0;i<10;i++)
		{
			bg[i]=new ButtonGroup();
		}
		ct.setLayout(null);
		
		result.setBounds(300,540,100,50);
		b.setBounds(500,540,100,50);
		d.setBounds(40,540,100,50);
		count.setBounds(0,0,400,50);
		result.setBorder(bzz);
		b.setBorder(bzz);
	count.setBorder(bzz);
		d.setBorder(bzz);
		
		ct.add(d);
		ct.add(result);
		ct.add(count);
		ct.add(b);
		b.addActionListener(this);
		result.addActionListener(this);
		d.addActionListener(this);
		//setVisible(true);
		//setSize(600,600);
		
	p[0].setVisible(true);
	
	for(int i=0;i<10;i++)
		 {
			 for(int j=0;j<4;j++)
			 {  
				ch[i][j]=new JRadioButton();
			 }
		}
		for(int i=0;i<10;i++)
		 {
			 for(int j=0;j<4;j++)
			 {  
				bg[i].add(ch[i][j]);
			 }
		}	
	

	         l[0].setText("Que1:which one among is not a primitive dataype?");
	        ch[0][0].setText("int");
			ch[0][1].setText("String");
			ch[0][2].setText("boolean");
			ch[0][3].setText("char");
			 l[1].setText("Que 2:which environment variabl1e is used to used to set the java path?");
	        ch[1][0].setText("MAVEN_PATH");
			ch[1][1].setText("JAVAPATH");
			ch[1][2].setText("java");
			ch[1][3].setText("JAVA_HOME");
			l[2].setText("Que 3:what is the extension of java code fil1es?");
	        ch[2][0].setText(".JS");
			ch[2][1].setText(".txt");
			ch[2][2].setText(".class");
			ch[2][3].setText(".java");		
			l[3].setText("Que 4:Which of these cannot be used for a variabl1e name in java?");
	        ch[3][0].setText("idebtifier&keyword");
			ch[3][1].setText("idebtifier");
			ch[3][2].setText("keyword");
			ch[3][3].setText("none");
			l[4].setText("Que 5:Which one of the fol1l1owing is not a java features? ");
	        ch[4][0].setText("JRE");
			ch[4][1].setText("JIT");
			ch[4][2].setText("JDE");
			ch[4][3].setText("JVM");
			l[5].setText("Que 6:who invented java programming?");
	        ch[5][0].setText("James Gosling");
			ch[5][1].setText("Guido van Rossum");
			ch[5][2].setText("Dennis Ritchie");
			ch[5][3].setText("Bjaene Strousstrup");
			l[6].setText("Que 7:which of the fol1l1owing is not java features??");
	        ch[6][0].setText("Dynamic");
			ch[6][1].setText("Architecture Neutrall");
			ch[6][2].setText("use of pointers");
			ch[6][3].setText("object oriented");
			l[7].setText("Que 8:Automatic type conversion is possil1e in which of possibl1e cases?");
	        ch[7][0].setText("Byte to int");
			ch[7][1].setText("int to long");
			ch[7][2].setText("long to int");
			ch[7][3].setText("Short to int");
			l[8].setText("Que9.What is size of Float and Doubl1e in java?");
	        ch[8][0].setText("32 and 64");
			ch[8][1].setText("32 and 32");
			ch[8][2].setText("64 and 64");
			ch[8][3].setText("64 and 32");
			l[9].setText("Que10. Number of primitive data types in java?"); 
	        ch[9][0].setText("6");
			ch[9][1].setText("7");
			ch[9][2].setText("8");
			ch[9][3].setText("ended");
			Border bz=BorderFactory.createLineBorder(Color.black);
Border blackl = BorderFactory.createTitledBorder("Questions");
	     for(int i=0;i<10;i++)
		 { p[i].setBounds(20,130,830,400);

	       p[i].setBorder(bz);p[i].setBorder(blackl);
	        p[i].setVisible(false);
			p[i].setBackground(Color.WHITE);
			p[i].add(l[i]);
			
			for(int j=0;j<4;j++)
			 {  
				bg[i].add(ch[i][j]);
				p[i].add(ch[i][j]);
				ch[i][j].setBackground(Color.WHITE);
			 }
		}	
			p21.setBounds(00,00,w,70);
		  p21.add(l22);
		  p21.add(l11);
			p22.setBounds(0,600,w,200);
			l1.setBounds(880,130,450,400);
			l1.setBorder(blackl);
Border blacklll = BorderFactory.createTitledBorder("online mcq Exam");
Border blackll = BorderFactory.createTitledBorder("Questions Summary");
	
			p22.setBorder(blackll);
			p21.setBorder(blacklll);
			//ct.setBorder(blacklll);
	l1.setVisible(true);
	 Color cd=new Color(97,214,214);
	 ct.setBackground(cd);
	//p21.setBackground(Color.BLUE);
 //p22.setBackground(Color.BLUE);
	l1.setBackground(Color.WHITE);
p[0].setVisible(true);
	
	}
	public void actionPerformed(ActionEvent e)
	{ select=0; for(int i=0;i<50;i++)
		 {
			 
			  b11[i].setBackground(Color.BLUE);
		
		}for(int i=0;i<10;i++)
		{
	      p[i].setBackground(Color.WHITE);
	      
	        p[i].setVisible(false);
		}
		  
		if(e.getSource()==b && c!=10)
		{ c++;
		 }if(e.getSource()==d && c!=1)
		{ c--;
		 }
		b11[c-1].setBackground(Color.GREEN);
		 if(c==1 || e.getSource()==b11[0])
		 {
			p[0].setVisible(true);
		 }
		 if(c==2 || e.getSource()==b11[1])
		 {
			p[1].setVisible(true);
		 }
		 if(c==3 || e.getSource()==b11[2])
		 {
			p[2].setVisible(true);
		 }
		 if(c==4 || e.getSource()==b11[3])
		 {
			p[3].setVisible(true);
		 }
		 if(c==5 || e.getSource()==b11[4])
		 {
			p[4].setVisible(true);
		 }
		 if(c==6|| e.getSource()==b11[5])
		 {
			p[5].setVisible(true);
		 }
		 if(c==7|| e.getSource()==b11[6])
		 {
			p[6].setVisible(true);
		 }
		 if(c==8|| e.getSource()==b11[7])
		 {
			p[7].setVisible(true);
		 }
		 
		 if(c==9|| e.getSource()==b11[8])
		 {
			p[8].setVisible(true);
		 }
		 if(c==10|| e.getSource()==b11[9])
		 {
			p[9].setVisible(true);
		 }
		  if(e.getSource()==b11[0])
		 {  c=1;
			p[0].setVisible(true);
			
		 }
		 if( e.getSource()==b11[1])
		 { c=2;
			p[1].setVisible(true);
		}
		 if(e.getSource()==b11[2])
		 { c=3;
			p[2].setVisible(true);
		 }
		 if(e.getSource()==b11[3])
		 { c=4;
			p[3].setVisible(true);
		 }
		 if(e.getSource()== b11[4])
		 { c=5;
			p[4].setVisible(true);
		 }
		 if(e.getSource()==b11[5])
		 { c=6;
			p[5].setVisible(true);
		 }
		 if(e.getSource()==b11[6])
		 {c=7;
			p[6].setVisible(true);
		 }
		 if(e.getSource()==b11[7])
		 {c=8;
			p[7].setVisible(true);
		 }
		 
		 if( e.getSource()==b11[8])
		 {c=9;
			p[8].setVisible(true);
		 }
		 if(e.getSource()==b11[9])
		 { c=10;
			p[9].setVisible(true);
		 }
	if(e.getSource()==result)
	{
		if(ch[0][1].isSelected()&& dot[0]==-1)
		{cnt++; dot[0]=1;}
		if(ch[1][3].isSelected()&& dot[1]==-1)
	    {cnt++; dot[1]=1;}
		if(ch[2][3].isSelected()&& dot[2]==-1)
	   {cnt++; dot[2]=1;}
		if(ch[3][2].isSelected()&& dot[3]==-1)
		{cnt++; dot[3]=1;}
		if(ch[4][2].isSelected()&& dot[4]==-1)
		{cnt++; dot[4]=1;}
		if(ch[5][0].isSelected()&& dot[5]==-1)
	{cnt++; dot[5]=1;}
		if(ch[6][2].isSelected()&& dot[6]==-1)
		{cnt++; dot[6]=1;}
		if(ch[7][1].isSelected()&& dot[7]==-1)
	{cnt++; dot[7]=1;}
		if(ch[8][0].isSelected()&& dot[8]==-1)
	{cnt++; dot[8]=1;}
		if(ch[9][2].isSelected()&& dot[9]==-1)
		{cnt++; dot[9]=1;}
		for(int i=0;i<10;i++)
		{
			if(bg[i].getSelection()!=null)
			{
				select++;
			}
		}
		count.setText("correct ans="+cnt+"\n Attempted="+select+"\n Not attempted="+(10-(select+1)));
		p21.add(count);
		
	}
}
 
public static void main(String g[])
{
	B b=new B();
	 Dimension D;
	     D=Toolkit.getDefaultToolkit().getScreenSize();
				int w,h;
				w=(int)D.getWidth();
               h=(int)D.getHeight();
			   b.setSize(w+10,h+10);
			   b.setVisible(true);
			   
}
	
}