/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientFrame;

/**
 *
 * @author lenovo
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;



public class ClientFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String buttonAddress = "E:\\Yamini\\Java Applications\\JavaApplication8\\src\\ClientFrame\\images\\button.jpg";
                        
        BasicFrame b = new BasicFrame();
        ImageIcon image = new ImageIcon(buttonAddress);
        JLabel label = new JLabel(image);
        
        Container c = b.getContentPane();
        c.add(label);
        b.setBounds(500, 200, image.getIconWidth()+5, image.getIconHeight()+25);
        label.setBounds(0,0,image.getIconWidth(),image.getIconHeight());
        b.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                System.out.println(e.getX()+","+e.getY());
            }
        });
//        JLabel blabel = new JLabel(image);
//        //c.add(blabel);
//        blabel.setBounds(400,100,image.getIconWidth(),image.getIconHeight());
//        
//        Font f = new Font("Arial", Font.PLAIN,30);
//        label.setFont(f);
        
        //button.setBounds(200,200,20,20);
    }
    
}
