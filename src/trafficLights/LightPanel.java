package trafficLights;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class LightPanel extends JPanel {
	
	private int[] x;
	private int[] y;
	
	public void trigs(int x1, int y1, int x2, int y2, int x3, int y3){
        
        x = new int[] {x1, x2, x3};
        y = new int[] {y1, y2, y3};
	}    
		
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//setBackground(Color.ORANGE);
		
		g.setColor(Color.BLACK);
		g.fillArc(165, 88, 80, 36, 1, 179);//顶
		
		g.fillRoundRect(150, 110, 110, 305, 25, 25); //主体
		
		g.fillRoundRect(180, 418, 50, 65, 25, 25);
		
		//side
		
		g.fillRoundRect(85, 135, 60, 60, 25, 25);
		g.fillRoundRect(265, 135, 60, 60, 25, 25);
		
		g.fillRoundRect(85, 225, 60, 60, 25, 25);
		g.fillRoundRect(265, 225, 60, 60, 25, 25);
		
		g.fillRoundRect(85, 315, 60, 60, 25, 25);
		g.fillRoundRect(265, 315, 60, 60, 25, 25);
		
		//триугольник
		g.setColor(getBackground());
		
		//слвва
		trigs(85, 145, 55, 197, 139, 195);
        g.fillPolygon(x, y ,3);
		
        trigs(85, 235, 55, 287, 139, 285);
        g.fillPolygon(x, y ,3);
        
        trigs(85, 325, 55, 377, 139, 375);
        g.fillPolygon(x, y ,3);
        
        //справа
        
        trigs(325, 145, 265, 197, 355, 195);
        g.fillPolygon(x, y ,3);
        
        trigs(325, 235, 265, 287, 355, 285);
        g.fillPolygon(x, y ,3);
        
        trigs(325, 325, 265, 377, 355, 375);
        g.fillPolygon(x, y ,3);
        
        //red
		g.setColor(Color.WHITE);
		g.fillOval(157,118, 95, 95);
		
		g.setColor(Color.BLACK);
		g.fillOval(155, 128, 100, 100);
		
		g.setColor(Color.RED);
		g.fillOval(168, 133, 75, 75);
		
		//yellow
		g.setColor(Color.WHITE);
		g.fillOval(157,210, 95, 95);
		
		g.setColor(Color.BLACK);
		g.fillOval(155, 220, 100, 100);
		
		g.setColor(Color.YELLOW);
		g.fillOval(168, 225, 75, 75);
		
		//green
		g.setColor(Color.WHITE);
		g.fillOval(157,302, 95, 95);
		
		g.setColor(Color.BLACK);
		g.fillOval(155, 312, 100, 100);
		
		g.setColor(Color.GREEN);
		g.fillOval(168, 317, 75, 75);
			
	}

}