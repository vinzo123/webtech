import java.awt.*; 
import java.awt.event.*; 
import java.applet.*;
/*<applet code="exp" width=400 height=400> </applet>*/
public class exp extends Applet implements ItemListener
{ 
int currcolor=5;
int flag=1;
String text="Click any of the buttons"; 
Button buttons[]=new Button[5];
String colours[]={"Red","Blue","Green","Yellow","Magenta"};
Image img;
CheckboxGroup cbg=new CheckboxGroup();
Checkbox box1=new Checkbox("Background Color",cbg,true); 
Checkbox box2=new Checkbox("Text Color",cbg,false); 
Checkbox box3=new Checkbox("Loading Image",cbg,false);
public void init()
{
for(int i=0;i<5;i++)
{
buttons[i]=new Button(" "); 
add(buttons[i]);
}
buttons[0].setBackground(Color.red); 
buttons[1].setBackground(Color.blue); 
buttons[2].setBackground(Color.green); 
buttons[3].setBackground(Color.yellow); 
buttons[4].setBackground(Color.magenta); 
add(box1);
add(box2);
add(box3); 
box1.addItemListener(this); 
box2.addItemListener(this); 
box3.addItemListener(this);
}
public void itemStateChanged(ItemEvent ev)
{
  if(box1.getState()==true) 
  flag=1;
 else if(box2.getState()==true)
{
text="Default color is black"; flag=2;
}
else if(box3.getState()==true)
{
	img=getImage(getDocumentBase(),"ktm.jpg"); 
	flag=3;
}
repaint();
}
public void paint (Graphics g)
{
if(flag==2)
{
g.drawString(text,30,100); 
switch (currcolor)
{
	case 0: g.setColor(Color.red); 
	break;
	case 1: g.setColor(Color.blue); 
	break;
	case 2: g.setColor(Color.green); 
	break;
	case 3: g.setColor(Color.yellow);
	 break;
	case 4: g.setColor(Color.magenta); 
	break; 
	case 5: g.setColor(Color.black);
	break;
}
g.drawString(text,30,100);
} 
else if(flag==1)
{
g.drawString(text,30,100); 
switch(currcolor)
{
	case 0: setBackground(Color.red); 
	break;
	case 1: setBackground(Color.blue); 
	break; 
	case 2: setBackground(Color.green); 
	break;
 	case 3: setBackground(Color.yellow); 
	break; 
	case 4: setBackground(Color.magenta); 
	break; 
	case 5: setBackground(Color.white); 
	break;
}
} 
else if(flag==3)
{
	g.drawImage(img,20,90,this);
}
}
public boolean action(Event e,Object o)
{ 
	for(int i=0;i<5;i++)
{
if(e.target==buttons[i])
{ 
	currcolor=i;
	text="You have chosen "+colours[i]; 
repaint ();
return true;
}
}
return false;
}
}
