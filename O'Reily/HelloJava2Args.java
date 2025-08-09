import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloJava2Args {
    public static void main(String[]args){
        JFrame frame = new JFrame("Hello JAVA2!");
        HelloComponent2 newObj = new HelloComponent2(args[0]);
        frame.add(newObj);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
   
}

class HelloComponent2 extends JComponent
     implements MouseMotionListener{
    String theMessage;
    int messageX = 125, messageY = 95; //Co ordinates of message

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

