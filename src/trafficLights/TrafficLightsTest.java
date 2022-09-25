package trafficLights;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class TrafficLightsTest{
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
		public void run() {
		MyFrame frame = new MyFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
		});
			
	}
	

}

class MyFrame extends JFrame{
	
	public MyFrame() {
	setTitle("交通灯");
	setSize(400, 700);
	LightPanel panel = new LightPanel();
	add(panel);
	}

}
