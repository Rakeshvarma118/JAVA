import java.awt.*;
import java.awt.event.*;
class Draw1 extends Frame
{
    Draw1()
    {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
            
        });
    }


public static void main(String[] args) {
    Draw1 d=new Draw1();
    d.setTitle("simple message");
    d.setSize(650,350);
    d.setVisible(true);
    
}
public void paint(Graphics g)
{
    g.setColor(Color.orange);
    g.drawLine(100,100,100,200);
    g.fillRect(50,50,100,100);
    g.fillRoundRect(300, 200,100,80,10,10);
    g.fillOval(170,150,60,40);
}

}