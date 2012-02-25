package svetotsh;

import java.awt.Color;
import java.awt.Graphics;
import java.util.*;
import javax.swing.*;
import java.awt.Color;
import svetotsh.id_int_resurs;

public class dizain extends JPanel implements id_int_resurs {
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g); 

		g.setColor(Color.gray); 
		g.fillRect(90, 0, 6, 50);
		
		g.setColor(Color.gray); // 
		g.drawRoundRect(50, 50, 85, 205,15,15);
		
		g.setColor(c1); //  Верх
		g.fillOval(62, 60, 60, 60); 
										
        g.setColor(c3); // Среднее
        g.drawOval(62, 123, 60, 60); 
		
        g.setColor(c3); // Среднее
        g.fillOval(62, 123, 60, 60); 
		
        g.setColor(c2); // Низ
		g.fillOval(62, 186, 60, 60); 
	}	


	


	public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(200, 350);
        f.setTitle(name);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(new dizain());
        f.setVisible(true);
    }
}