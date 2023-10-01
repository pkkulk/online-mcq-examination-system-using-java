
//import required classes and packages  
import javax.swing.*;  
import java.awt.*; 
import javax.swing.BorderFactory; 
import javax.swing.border.*; 
import java.awt.event.*;  
import java.sql.*;
import java.lang.Exception;  
 class DisplayGraphics extends Canvas{
	 
	 public void paint(Graphics g)
	 {
		 
		 g.drawString("hallo",250,280);
	 }
}  
//create CreateLoginForm class to create login form  
//class extends JFrame to create a window where our component c.add  
//class implements ActionListener to perform an action on button click  
class CreateLoginForm extends JFrame implements ActionListener  
{  JPanel Panel1,Panel2,newPanel,new2,p3,p4;
    //initialize button, panel, label, and text field  
  JLabel lo1,stu,l1,l3,l4,l2;
  JPasswordField t2;
  JButton j;
  ImageIcon i,i2,i3,i4,i5;
  JTextField t1,t3,t4;
  Container cp;
  Color cd;
  Statement stmt;
  Connection con;
  ResultSet rs;
  int bob=0;
  DisplayGraphics g;
  Font f;
    //calling constructor  
    CreateLoginForm()  
    {  g=new DisplayGraphics();
		cd=new Color(242,242,242);
	 f=new Font("TimesNewRoman",Font.PLAIN,80);
	cp=getContentPane();
	setFont(f);
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
		 con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:xe","system","1805");
	stmt=con.createStatement();}
	catch(Exception e)
	{
	}
	cp=getContentPane();
	//Graphics g=getGraphics();
	//g.drawString("user",300,30);
      p3=new JPanel(new BorderLayout());	
    // p4=new JPanel(new FlowLayout(FlowLayout.CENTER));	
      new2=new JPanel(new FlowLayout(FlowLayout.CENTER));	
	 Panel2 = new JPanel();
	 Panel1 = new JPanel(new BorderLayout());
	 newPanel = new JPanel(new GridLayout(2,2));
	 JPanel last=new JPanel(new GridLayout(3,1));
	 last.setBounds(290,270,800,300);
	  Panel1.setBounds(270,270,800,90);
	  Panel2.setBounds(270,490,800,90);
	  newPanel.setBounds(270,360,800,120);
	  last.add(newPanel);
	  last.add(Panel1);
	  last.add(Panel2);
	  
	  
	 // p3.setBounds(250,410,900,110);
	  //p4.setBounds(250,410,900,90);
	       t1=new JTextField(20);
    t2=new JPasswordField(20);
    t3=new JTextField(20);
    t4=new JTextField(20);
	
	i5=new ImageIcon("logo31.PNG");
	i4=new ImageIcon("logo30.PNG");
	i3=new ImageIcon("logo33.PNG");
	i2=new ImageIcon("logo4.PNG");
	lo1=new JLabel(i2,JLabel.CENTER);
	stu=new JLabel(i3);
	stu.setBackground(Color.YELLOW);
	//stu.setSize(100,100);
	//j.setSize(100,100);
	l1=new JLabel(i4);
	//Panel1.setBackground(Color.LIGHTGRAY);
	new2.setBackground(Color.WHITE);
	//Panel2.setBackground(Color.WHITE);
//newPanel.setBackground(Color.WHITE);
//	p3.setBackground(Color.WHITE);
	//p4.setBackground(Color.WHITE);
	l2=new JLabel(i5);
	i=new ImageIcon("captcha.PNG");
	l3=new JLabel(i);
	j=new JButton("Login");
	Panel1.add(stu);
	newPanel.add(l1);
	new2.add(lo1);
	newPanel.add(t1);
	newPanel.add(l2);
	newPanel.add(t2);
	//p3.add(l3);
//	p4.add(t3);
	Panel2.add(j,BorderLayout.CENTER);
	Panel2.setVisible(true);
	last.setVisible(true);
	Panel1.setVisible(true);
	newPanel.setVisible(true);
	//p3.setVisible(true);
	//p4.setVisible(true);
	
		last.add(Panel1);
	last.add(newPanel);
        setLayout(null);
		last.add(Panel2);
		Border blackll = BorderFactory.createLineBorder(Color.blue);
		//Panel2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.red,Color.blue));
		//newPanel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.red,Color.blue));
		//new2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.red,Color.blue));
		last.setBorder(blackll);
		//setUndecorated(true);
		//getRootPane().setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.red));
			//cp.add(p3);
		//cp.add(p4);
		cp.add(last);
		cp.add(new2);
	
		
		newPanel.setBackground(Color.WHITE);
	
        //perform action on button click   
        j.addActionListener(this);     //c.add action listener to button  
         setTitle("LOGIN FORM");
		  Dimension D;
	     D=Toolkit.getDefaultToolkit().getScreenSize();
				int w,h;
				w=(int)D.getWidth();
               h=(int)D.getHeight();
           setSize(w,(h-80));
		   new2.setBounds(0,0,w,220);
		   setVisible(true);
	Panel2.setBackground(Color.WHITE);
    Panel1.setBackground(Color.WHITE);
		   
		  new2.setBackground(cd);
		  cp.setBackground(cd);
 //set title to the login form  
    } 
      
       
    public void actionPerformed(ActionEvent ae)     
    {  
        int userValue =Integer.parseInt(t1.getText());        //get user entered username from the t1  
        String passValue = t2.getText();        //get user entered pasword from the t2  
        try{  rs=stmt.executeQuery("select *from stu_app");
		  while(rs.next())
		  {
			  int enrollno=rs.getInt(2);
			  String s=rs.getString(3);
			  String sq=rs.getString(6);
			  if(enrollno==userValue && s.equals(passValue))
			  {   Dimension D;
	        D=Toolkit.getDefaultToolkit().getScreenSize();
				int w,h;
				w=(int)D.getWidth();
               h=(int)D.getHeight();
              bob=1;
            //create instance of the NewPage  
           A page=new A();
		   page.my_update(sq,enrollno);
		   dispose();
            //make page visible to the user  
            page.setVisible(true);  
			page.setSize(w,h);
				  break;
			  }
		  }
		  con.close();
		}
		catch(Exception e)
		{
		}
		  if(bob==0)
		  {
			//  JDialog jd=new JDialog(,"dialog example",true);
			  //jd.setVisible(true);
			  //jd.setBounds(300,300,100,100);
			  //jd.add(new Label("invalid details"));
		  } 
     //if (userValue.equals("prathmesh") && passValue.equals("1805")) {    
           //    Dimension D;
	     //D=Toolkit.getDefaultToolkit().getScreenSize();
				//int w,h;
				//w=(int)D.getWidth();
            //   h=(int)D.getHeight();
          // A page=new A();
		   //setVisible(false);  
            //page.setVisible(true);  
			//page.setSize(w,h);
        //}  
        //else{  
          //  System.out.println("Please enter valid username and password");  
        //}  
    }  
} 

class LoginDemo  
{  
    public static void main(String arg[])  
    {   Dimension D;
	     D=Toolkit.getDefaultToolkit().getScreenSize();
				int w,h;
				w=(int)D.getWidth();
               h=(int)D.getHeight();
        try  
        {  
            //create instance of the CreateLoginForm  
            CreateLoginForm form = new CreateLoginForm();

            form.setSize(w+10,h);  //set size of the frame  
            form.setVisible(true);  //make form visible to the user  
        }  
        catch(Exception e)  
        {     
            //handle exception   
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }  
}
