import java.awt.*;
import java.applet.*
public class applet1 extends Applet implements ActionListener
{
	TextFied t1=new TextFied(20);
	TextFied t2=new TextFied(20);
	TextFied t3=new TextFied(20);
	Label l1=new Label("Enter first no");
	Label l2=new Label("Enter second no");
	Label l3=new Label("Ans");
    Button b1=new Button("Square");
    Button b2=new Button("Cube");
    Button b3=new Button("Add");
    Button b1=new Button("Sub");
 
 public void init()
 {
 	add(l1);
 	add(t1);
 	add(l2);
 	add(t2);
 	add(l3);
 	add(t3);
    b1.addActionPerformed(this);
    b2.addActionPerformed(this);
    b3.addActionPerformed(this);
    b4.addActionPerformed(this);
 }
 public void ActionPerformed(ActionEvent e)
 {
String s1,s2 s3;
int a,b,c;

s1=t1.getText()
s2=t2.getText()
//a=Integer.parseInt()
//b=Integer.parseInt()

if(e.source()==b1)
{
	t1.setText(s1*s1)
}

if(e.source()==b2)
{
	t2.setText(s1*s1*s1)
}

if(e.source()==b3)
{
	t3.setText(s1+s2)
}

if(e.source()==b4)
{
	t1.setText(s1-s2)
}
 }
}