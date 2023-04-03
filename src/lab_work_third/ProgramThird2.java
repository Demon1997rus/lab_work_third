package lab_work_third;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class ProgramThird2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgramThird2 window = new ProgramThird2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProgramThird2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = 	new JFrame();
		frame.setBounds(100, 100, 657, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 489, 447);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Consolas", Font.PLAIN, 14));
		panel.add(textArea, BorderLayout.CENTER);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(509, 32, 122, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel = new JLabel("Размер фигуры");
		lblNewLabel.setBounds(509, 7, 122, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Отобразить");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int n = (int)spinner.getValue();
				String text = "";
				int i = 1;
				int number = 1;
				while(i <= n)
				{
					int j = n-i+1;
					while(j <= n)
					{
						text += number + "\t";
						number++;
						j++;
					}
					number = 1; 
					text += "\n";
					i++;
				}
				textArea.setText(text);
			}
		});
		btnNewButton.setBounds(509, 63, 122, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
