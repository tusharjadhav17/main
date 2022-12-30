// package swing;
import javax.swing.*;
import java.awt.*;
public class Form_1 
{
	public static void main(String[] args) {
		JFrame jf=new JFrame("Registration Form");
       
		JLabel jl=new JLabel("Personal Details");
        jl.setBounds(240, 0, 120, 50);
        
        JLabel j1=new JLabel("Name:");
        j1.setBounds(150, 60, 80, 30);
        
        JTextField jt1=new JTextField(200);
        jt1.setBounds(240, 60, 190, 30);
        
        JLabel j2=new JLabel("Password:");
        j2.setBounds(150, 90, 80, 30);
		
        JPasswordField jt2=new JPasswordField();
        jt2.setBounds(240, 90, 190, 30);
        
        JLabel j3=new JLabel("Email Id:");
        j3.setBounds(150, 120, 80, 30);
        
        JTextField jt3=new JTextField(200);
        jt3.setBounds(240, 120, 190, 30);
        
        JLabel j4=new JLabel("Gender:");
        j4.setBounds(150, 150, 80, 30);
        
        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("Female");
        r1.setBounds(240, 150, 80, 30);
        r2.setBounds(330, 150, 80, 30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        JLabel j5=new JLabel("Contact:");
        j5.setBounds(150, 180, 80, 30);
        
        JTextField jt5=new JTextField(200);
        jt5.setBounds(240, 180, 190, 30);
        
        JLabel j6=new JLabel("Education Qualification");
        j6.setBounds(230, 240, 200, 30);
        
        JLabel j7=new JLabel("Degree:");
        j7.setBounds(150, 300, 80, 30);
        
        String deg[]= {"B.E","B.Sc","BCA","BBA"};
        JComboBox jt7=new JComboBox(deg);
        jt7.setBounds(240, 300, 190, 30);
        
        
        JLabel j8=new JLabel("Course:");
        j8.setBounds(150, 340, 80, 30);
        
        String course[]= {"Mechanical","Automobile","Computer","IT","EXTC"};
        JComboBox jt8=new JComboBox(course);
        jt8.setBounds(240, 340, 190, 30);
        
        JLabel j9=new JLabel("Hobbies:");
        j9.setBounds(150, 370, 80, 30);
        
        JCheckBox jcb1=new JCheckBox("Playing");
    	jf.add(jcb1);
    	jcb1.setBounds(240, 370, 100, 30);
    	JCheckBox jcb2=new JCheckBox("Swimming");
    	jf.add(jcb2);
    	jcb2.setBounds(240, 400, 100, 30);
    	JCheckBox jcb3=new JCheckBox("Watching Anime");
    	jf.add(jcb3);
    	jcb3.setBounds(240, 430, 120, 30);
    	
    	JLabel j10=new JLabel("Address");
        j10.setBounds(260, 460, 80, 30);
      
        JTextField jt10=new JTextField(300);
        jt10.setBounds(150, 490, 300, 100);
      
        JButton j11=new JButton("Submit");
        j11.setBounds(250, 620, 80, 30);
        jf.add(j11);
        
        jf.add(jl);
		jf.add(j1);
		jf.add(jt1);
		jf.add(j2);
		jf.add(jt2);
		jf.add(j3);
		jf.add(jt3);
		jf.add(j4);
		jf.add(r1);
		jf.add(r2);
		jf.add(j5);
		jf.add(jt5);
		jf.add(j6);
		jf.add(j7);
		jf.add(jt7);
		jf.add(j8);
		jf.add(jt8);
        jf.add(j9);
        jf.add(j10);
        jf.add(jt10);
        
        
        jf.setSize(600, 1000);
        jf.setLayout(null);
        jf.setVisible(true);
	  
	}

}