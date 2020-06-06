import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	
	/*
	 * Author: Chen Kevin
	 * Release: 2020.06.06
	 * Version: 1.0
	 * Commercial usage: Allowed
	 */
	
	public static JLabel ver;
	public static JTextField tf1;
	public static JTextField tf2;
	public static JButton button;
	
	public GUI() {
		
		String version;
		version = "1.0 version";
		
		JPanel p = new JPanel();
		JFrame f = new JFrame("Madárnyelv fordító");
		f.setSize(500,280);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.add(p);
		p.setLayout(null);
		
		ver = new JLabel(version);
		ver.setBounds(428,238,100,10);
		p.add(ver);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Ariel", Font.BOLD, 17));
		tf1.setBounds(20,30,450,40);
		p.add(tf1);
		
		button = new JButton("Fordítás");
		button.setFont(new Font("Ariel", Font.BOLD, 20));
		button.setBounds(20,90,450,60);
		button.addActionListener(this);
		p.add(button);
		
		tf2 = new JTextField();
		tf2.setFont(new Font("Ariel", Font.BOLD, 17));
		tf2.setBounds(20,170,450,40);
		p.add(tf2);
		
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String Text = tf1.getText();
		String x = new String(Text);
		String x1 = x.replace("i", "idi");
		String x2 = x1.replace("e", "ide");
		String x3 = x2.replace("a", "ida");
		String x4 = x3.replace("o", "ido");
		String x5 = x4.replace("u", "idu");
		String x6 = x5.replace("á", "idá");
		String x7 = x6.replace("é", "idé");
		String x8 = x7.replace("ó", "idó");
		String x9 = x8.replace("ú", "idú");
		String x10 = x9.replace("ö", "idö");
		String x11 = x10.replace("ü", "idü");
		String x12 = x11.replace("ő", "idű");
		String x13 = x12.replace("í", "idí");
		
		tf2.setText(x13);
	}
}
