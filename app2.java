import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class app2 extends Applet implements ActionListener
{
	TextField t1=new TextField(20);
	TextField t2=new TextField(20);
	TextField t3=new TextField(20);
	Label l1=new Label("Enter side for cube ");
	Button b1=new Button("Surface area of cube");
    Button b2=new Button("Volume of cube");
 
public void init()
 {
 	add(l1);
 	add(t1);
 	add(b1);
 	add(t2);
 	add(b2);
 	add(t3);
    b1.addActionListener(this);
    b2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
String s1,s2;
int a,b,c;

s1=t1.getText();
a=Integer.parseInt(s1);
if(e.getSource()==b1)
{
	b=6*a*a;
	s2=String.valueOf(b);
	t2.setText(s2);
}

if(e.getSource()==b2)
{
	b=a*a*a;
	s2=String.valueOf(b);
	t3.setText(s2);
}

 }
}