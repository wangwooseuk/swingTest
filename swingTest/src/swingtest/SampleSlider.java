package swingtest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class SampleSlider extends JFrame {
	public static void main(String[] args) {
		SampleSlider f = new SampleSlider();
		f.setTitle("SampleSlider");
		f.setBounds(550, 350, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
		SampleSlider() {
			JSlider s = new JSlider();
			s.setOrientation(JSlider.HORIZONTAL);
			
			JPanel p = new JPanel();
			p.add(s);
			Container c = getContentPane();
			c.add(p, BorderLayout.CENTER);
			
			JProgressBar bar = new JProgressBar(0, 200);
			bar.setStringPainted(true);
			bar.setValue(50);
			p.add(bar);
			
			JLabel label = new JLabel();
			label.setText("Raspberr PI");
			p.add(label);
			
			JTextField text = new JTextField();
			text.setColumns(25);
			text.setText("Raspberry PI");
			p.add(text);
			
			JButton button = new JButton();
			button.setText("Raspberry PI");
			p.add(button);
		}
	}
