package swingtest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	public MyFrame() {
		
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;
		// �г� �����ϰ� ��ġ �����ڸ� FlowLayout���� ����
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		//�гο� ��ư�� �����Ͽ� �߰�
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("B4"));
		panel.add(new JButton("Long Button5"));
		add(panel);  //�г��� �����ӿ� �߰�
		pack();
		setResizable(false); //ũ�� ���� �Ұ�
		setVisible(true);
	}
}

public class FlowTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
