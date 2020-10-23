package swingtest;

import javax.swing.JFrame;

public class SwingTest01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("응용프로그램");
//		frame.setTitle(title);
//		frame.setSize(400, 300);
//		frame.setLocation(300, 300);
		frame.setBounds(200, 200, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
