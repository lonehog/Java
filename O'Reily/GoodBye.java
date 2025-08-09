import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GoodBye {
    public static void main(String[]args){
        JFrame frame = new JFrame("Hello JAVA2!");
        frame.add(new HelloComponent2("Hello Java 2"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
   
}

class HelloComponent2 extends JComponent
     implements MouseMotionListener{
    String theMessage;
    int messageX = 150, messageY = 150; //Co ordinates of message

    public HelloComponent2(String message){
        theMessage = message;
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g){
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e){
        //getv co ordinates and pass them to varaiables
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e){}
}

