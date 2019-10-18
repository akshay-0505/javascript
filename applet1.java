import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class applet1 extends Applet implements ActionListener
{
	TextField t1=new TextField(20);
	TextField t2=new TextField(20);
	TextField t3=new TextField(20);
	Label l1=new Label("Enter first no");
	Label l2=new Label("Enter second no");
	Label l3=new Label("Ans");
    Button b1=new Button("Square");
    Button b2=new Button("Cube");
    Button b3=new Button("Add");
    Button b4=new Button("Sub");
 
public void init()
 {
 	add(l1);
 	add(t1);
 	add(l2);
 	add(t2);
 	add(l3);
 	add(t3);
 	add(b1);
 	add(b2);
 	add(b3);
 	add(b4);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
String s1,s2,s3;
int a,b,c;

s1=t1.getText();
s2=t2.getText();
a=Integer.parseInt(s1);
b=Integer.parseInt(s2);

if(e.getSource()==b1)
{
	c=a*a;
	s3=String.valueOf(c);
	t3.setText(s3);
}

if(e.getSource()==b2)
{
	c=a*a*a;
	s3=String.valueOf(c);
	t3.setText(s3);
}

if(e.getSource()==b3)
{
	c=a+b;
	s3=String.valueOf(c);
	t3.setText(s3);
}

if(e.getSource()==b4)
{
	c=a-b;
	s3=String.valueOf(c);
	
	t3.setText(s3);
}
 }
}