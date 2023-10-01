import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


 class pnl extends JPanel 
{  A az;
  pnl()
  {  JPanel p2=new JPanel(new GridLayout(8,0));
    Color c=new Color(98,210,210);
    JButton b=new JButton("ENVIRONMENTAL STUDIES EXAMS");
    b.setBackground(c);
  setLayout(null);
    JLabel j1=new JLabel("Time start : sep 28 2022 10:00 AM");
     JLabel j2=new JLabel("Time start : sep 28 2022 12:00 PM");
      JLabel j3=new JLabel("Time zone :Indian standard Time");
       JLabel j4=new JLabel("Total questions :70");
        JLabel j5=new JLabel("Exam Duration :90 Minutes ");
         JLabel j6=new JLabel("Time Remaining :90 Mins 0 secs");
         ImageIcon i=new ImageIcon("aaaa.png");
         
         JButton bf=new JButton("Proceed",i);
		 
        // bf.setLocation(150,450);
         p2.add(b);
		 //b.setBounds(450,100,300,50);
         p2.add(j1);
		 //j1.setBounds(450,150,300,50);
          p2.add(j2);
		 //j2.setBounds(450,200,300,50);
  
           p2.add(j3);
		   
		 //j3.setBounds(450,250,300,50);

            p2.add(j4);
		 //j4.setBounds(450,300,300,50);

			
             p2.add(j5);
		 //j5.setBounds(450,350,300,50);

			 
              p2.add(j6);
		 //j6.setBounds(450,400,300,50);

			  add(p2);
              p2.add(bf);
			  
			  p2.setBounds(450,100,300,300);
			  p2.setBackground(Color.WHITE);
			  A a=new A(this);
			  bf.addActionListener(a);
		 //bf.setBounds(450,450,300,50);     
  }
    
    
  }
   class cbf extends JPanel
{
   cbf()
  {
  JPanel p1=new JPanel(new GridLayout(8,0));
     Color c=new Color(97,214,214);
setLayout(null);
   
  
    JButton b=new JButton("MSBTE Advanced java Programming exam ");
     b.setBackground(c);
    JLabel j1=new JLabel("Time start : oct 08 2022 10:00 AM");
     JLabel j2=new JLabel("Time start : oct 08 2022 12:00 PM");
      JLabel j3=new JLabel("Time zone :Indian standard Time");
       JLabel j4=new JLabel("Total questions :70");
        JLabel j5=new JLabel("Exam Duration :90 Minutes ");
         JLabel j6=new JLabel("Time Remaining :90 Mins 0 secs");
         ImageIcon i=new ImageIcon("aaaa.png");
         
         JButton bf=new JButton("Proceed",i);
         //bf.setLocation(150,450);
         p1.add(b);
		 //b.setBounds(450,100,300,50);
         p1.add(j1);
		 //j1.setBounds(450,150,300,50);
          p1.add(j2);
		 //j2.setBounds(450,200,300,50);
  
           p1.add(j3);
		   
		 //j3.setBounds(450,250,300,50);

            p1.add(j4);
		 //j4.setBounds(450,300,300,50);

			
             p1.add(j5);
		 //j5.setBounds(450,350,300,50);

			 
              p1.add(j6);
		 //j6.setBounds(450,400,300,50);

			  
			  p1.setBounds(450,100,300,300);
			  p1.setBackground(Color.WHITE);
			  
              p1.add(bf);
			  add(p1);
		 //bf.setBounds(450,450,300,50);
  }
  }
  
    class OS extends JPanel
{
   OS()
  {
     Color c=new Color(97,214,214);
  JPanel p=new JPanel(new GridLayout(8,0));
   setLayout(null);
  
    JButton b=new JButton("MSBTE OPERATING SYSTEMS exam ");
     b.setBackground(c);
    JLabel j1=new JLabel("Time start : oct 12 2022 10:00 AM");
     JLabel j2=new JLabel("Time start : oct 12 2022 12:00 PM");
      JLabel j3=new JLabel("Time zone :Indian standard Time");
       JLabel j4=new JLabel("Total questions :70");
        JLabel j5=new JLabel("Exam Duration :90 Minutes ");
         JLabel j6=new JLabel("Time Remaining :90 Mins 0 secs");
         ImageIcon i=new ImageIcon("aaaa.png");
         
         JButton bf=new JButton("Proceed",i);
		 bf.setLocation(150,450);
         p.add(b);
		 //b.setBounds(450,100,300,50);
         p.add(j1);
		 //j1.setBounds(450,150,300,50);
          p.add(j2);
		 //j2.setBounds(450,200,300,50);
  
           p.add(j3);
		   
		 //j3.setBounds(450,250,300,50);

            p.add(j4);
		 //j4.setBounds(450,300,300,50);

			
             p.add(j5);
		 //j5.setBounds(450,350,300,50);

			 
              p.add(j6);
		 //j6.setBounds(450,400,300,50);

			  
              p.add(bf);
			  add(p);
			  
			  p.setBounds(450,100,300,300);
			  p.setBackground(Color.WHITE);
			  
		 //bf.setBounds(450,450,300,50);
  }
  }
     class CSS extends JPanel
{
   CSS()
  {
     Color c=new Color(127,24,214);

   JPanel p4=new JPanel(new GridLayout(8,0));
    setLayout(null);
	
    JButton b=new JButton("MSBTE CLIENT SIDE SCRIPTING exam ");
     b.setBackground(c);
    JLabel j1=new JLabel("Time start : oct 08 2022 10:00 AM");j1.setBackground(c);
     JLabel j2=new JLabel("Time start : oct 08 2022 12:00 PM");
      JLabel j3=new JLabel("Time zone :Indian standard Time");
       JLabel j4=new JLabel("Total questions :70");
        JLabel j5=new JLabel("Exam Duration :90 Minutes ");
         JLabel j6=new JLabel("Time Remaining :90 Mins 0 secs");
         ImageIcon i=new ImageIcon("aaaa.png");
         
         JButton bf=new JButton("Proceed",i);
         //bf.setLocation(150,450);
         p4.add(b);
		// b.setBounds(450,100,300,50);
         p4.add(j1);
		 //j1.setBounds(450,150,300,50);
          p4.add(j2);
		 //j2.setBounds(450,200,300,50);
  
           p4.add(j3);
		   
		 j3.setBounds(450,250,300,50);

            p4.add(j4);
		 //j4.setBounds(450,300,300,50);

			
             p4.add(j5);
		 //j5.setBounds(450,350,300,50);

			 
              p4.add(j6);
		 //j6.setBounds(450,400,300,50);
			  //setBackground(Color.WHITE);
              p4.add(bf);
			  add(p4);
			  
			  p4.setBounds(450,100,300,300);
			  p4.setBackground(Color.WHITE);
			  
		 //bf.setBounds(450,450,300,50);

           }
  }
  public class A extends JFrame implements ActionListener
  {   private String s="",d="";
  private JLabel  enroll;
  private JLabel   Name;
	    	 private JLabel Name1;
	    	private  JLabel Name2;
			pnl p;
    A(pnl p)
    { this.p=p; 
	}
	A(){
	JPanel new3=new JPanel(new BorderLayout());
    JPanel new2=new JPanel(new GridLayout(0,5));
	 JLabel l=new JLabel("hello");
      Container ct=getContentPane();
      JTabbedPane jtp=new JTabbedPane();
	  pnl p=new pnl();
	  cbf x=new cbf();
	  OS d=new OS();
	  CSS b=new CSS();
      jtp.addTab("EST",new pnl());
      jtp.addTab("AJP ",new cbf());
      jtp.addTab("OS",new OS());
      jtp.addTab("CSS",new CSS());
      ct.add(new3);
      ct.add(new2);
      ct.add(jtp);
	  ct.setLayout(null);  Dimension D;
	     D=Toolkit.getDefaultToolkit().getScreenSize();
				int w,h;
				w=(int)D.getWidth();
               h=(int)D.getHeight();
     Color cd=new Color(97,214,214);
	 new3.setBounds(0,650,w,50);
	  enroll=new JLabel();
	         Name=new JLabel();
	    	  Name1=new JLabel("program code=IF5I");
	    	 Name2=new JLabel("Course=EST(22447)");
	    //Name3=new JLabel("roll no=51");
	  	 JLabel  Name4=new JLabel("Course=EST(22447)");
	 new2.setBounds(0,0,w,150);
		   new2.add(enroll);
		   new2.add(Name);
		   new2.add(Name1);
		   new2.add(Name2);
		   new2.add(Name4);
		 Font f=new Font("TimesNewRoman",Font.PLAIN,20);
		   enroll.setFont(f);
	   Name.setFont(f);
	   Name1.setFont(f);
	   Name2.setFont(f);
	   //Name3.setFont(f);
	   Name4.setFont(f);
	   enroll.setForeground(Color.RED);
	   Name.setForeground(Color.RED);
	   Name1.setForeground(Color.RED);
	   Name2.setForeground(Color.RED);
	   //Name3.setForeground(Color.RED);
	   Name4.setForeground(Color.RED);
	  jtp.setBounds(0,150,w,500);
	  new3.setBackground(cd);
	  new2.setBackground(cd);
	  jtp.setBackground(Color.WHITE);
	  x.setBackground(Color.WHITE);
	  p.setBounds(0,150,w,600);
    }
	public void actionPerformed(ActionEvent e)
	  {
  Dimension D;
	     D=Toolkit.getDefaultToolkit().getScreenSize();
				int w,h;
				w=(int)D.getWidth();
               h=(int)D.getHeight();
			   
			   B page=new B();
       A z=new A();
		z.dispose();
			
            //make page visible to the user  
            page.setVisible(true);  
			
			page.setSize(w,h);
	  }
	public void my_update(String str,int dst) {
		enroll.setText("Enroll:"+dst);
		Name.setText("Name:"+str);
	}
	public static void main(String a[])
	{   Dimension D;
	D=Toolkit.getDefaultToolkit().getScreenSize();
				int w,h;
				w=(int)D.getWidth();
               h=(int)D.getHeight();
    
		A a1=new A();
	     
		a1.setVisible(true);
		a1.setSize(w,h);
		a1.setBackground(Color.YELLOW);
	}
  }
  
      
  