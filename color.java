import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
FDemo()
   {

setLayout(new FlowLayout());
Font f=new Font("Arial Unicode MS",Font.ITALIC,25); 
setFont(f);
 b1=new Button("Blue");
add(b1);
 b2=new Button("pink");
add(b2);
b3=new Button("Grey");
add(b3);
b4=new Button("White");
add(b4);
b5=new Button("purple");
add(b5);
 b6=new Button("golden");
add(b6);
b7=new Button("Yellow");
add(b7);
b8=new Button("green");
add(b8);
 b9=new Button("skyblue");
add(b9);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
    }
  public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==b1)
	   {
	   setBackground(Color.black);
	   }
	   if(e.getSource()==b2)
	   {
	   setBackground(Color.blue);
	   }
	   if(e.getSource()==b3)
	   {
	   setBackground(Color. orange);
	   }
	   if(e.getSource()==b4)
	   {
	   setBackground(Color.white);
	   }
	   if(e.getSource()==b5)
	   {
	   setBackground(Color.orange);
	   }
	   if(e.getSource()==b6)
	   {
	   setBackground(Color.black);
	   }
	   if(e.getSource()==b7)
	   {
	   setBackground(Color.pink);
	   }
	   if(e.getSource()==b8)
	   {
	   setBackground(Color.white);
	   }
	   if(e.getSource()==b9)
	   {
	   setBackground(Color.green);
	   }
    }
}
class Demo63
{
public static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setLocation(100,200);
f.setSize(700,600);
//f.setBackground(Color.white);
//f.setForeground(Color.blue);
}
}
