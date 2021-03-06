import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SearchResult extends JFrame {

	public SearchResult(Object[][] data) {
		super("Search Results");
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
		
		JLabel label = new JLabel("Search Results");
		label.setAlignmentX(CENTER_ALIGNMENT);
		label.setFont(new Font("Helvetica",Font.BOLD,24));
		
		String[] columns = {"DocID","Title","Publisher Name"};
		JTable table = new JTable(data,columns);
		JScrollPane scroll = new JScrollPane(table);
		
		
		JButton back = new JButton("Back");
		back.setAlignmentX(CENTER_ALIGNMENT);
		back.addActionListener(new Back());
		
		panel.add(new JLabel(" "));
		panel.add(label);
		panel.add(new JLabel(" "));
		panel.add(scroll);
		panel.add(new JLabel(" "));
		panel.add(back);
		panel.add(new JLabel(" "));
		add(panel);
		
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(480,275);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		
	}
	
	public SearchResult(Object[][] data, String[] colTitles) {
		super("Search Results");
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
		
		JLabel label = new JLabel("Search Results");
		label.setAlignmentX(CENTER_ALIGNMENT);
		label.setFont(new Font("Helvetica",Font.BOLD,24));
		
		String[] columns = colTitles;
		JTable table = new JTable(data,columns);
		JScrollPane scroll = new JScrollPane(table);
		
		
		JButton back = new JButton("Back");
		back.setAlignmentX(CENTER_ALIGNMENT);
		back.addActionListener(new Back());
		
		panel.add(new JLabel(" "));
		panel.add(label);
		panel.add(new JLabel(" "));
		panel.add(scroll);
		panel.add(new JLabel(" "));
		panel.add(back);
		panel.add(new JLabel(" "));
		add(panel);
		
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(480,275);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		
	}

	class Back implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			dispose();
		}
		
		
	}
}