/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverframe;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author lenovo
 */
public class BasicFrame extends JFrame {
    
    public BasicFrame(){
        String iconAddress = "E:\\Yamini\\Java Applications\\JavaApplication8\\src\\ClientFrame\\images\\icon.png";
        
//        addMouseListener(new MouseAdapter(){
//            public void mousePressed(MouseEvent e){
//            }
//        });
        
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        //setTitle("Communication Coders.");
        setBounds(500,200,200,200);
        ImageIcon icon = new ImageIcon(iconAddress);
        setIconImage(icon.getImage());
    }    
}
