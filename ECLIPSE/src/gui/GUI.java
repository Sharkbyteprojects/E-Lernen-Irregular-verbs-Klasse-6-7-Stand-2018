package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {
    int varv = 0;
    int richt = 0;
    int count = 0;
	private JPanel contentPane;
	private JTextField answer;
	private JTextField quest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setFont(new Font("Arial", Font.PLAIN, 12));
		setResizable(false);
		setTitle("ENGLISCH IRREGULAR VERBS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[][][][][]"));
		
		JLabel lblFrage = new JLabel("Frage");
		contentPane.add(lblFrage, "cell 0 0");
		
		quest = new JTextField();
		quest.setEditable(false);
		contentPane.add(quest, "cell 0 1,growx");
		quest.setColumns(10);
		
		JLabel lblAntwort = new JLabel("Antwort:");
		contentPane.add(lblAntwort, "cell 0 2");
		
		answer = new JTextField();
		contentPane.add(answer, "cell 0 3,growx");
		answer.setColumns(10);
		
		JButton btnPrfe = new JButton("Starte");
		btnPrfe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String stris;
				if (varv == 1) {
				count++;
				stris = answer.getText();
				if (stris.equals("was,were")) {
				   answer.setText("Super, das hast du es Richtig");
				   richt++;
				}else {
					answer.setText("Leider ist das die Falsche antwort");
				}
				quest.setText("come");
				varv++;
				}else if(varv == 2){
					count++;
					stris = answer.getText();
					if (stris.equals("came")) {
					   answer.setText("Super, das hast du es Richtig");
					   richt++;
					}else {
						answer.setText("Leider ist das die Falsche antwort");
					}
					varv++;
					quest.setText("build");
				}else if(varv == 3){
					count++;
					stris = answer.getText();
					if (stris.equals("built")) {
						   answer.setText("Super, das hast du es Richtig");
						   richt++;
						}else {
							answer.setText("Leider ist das die Falsche antwort");
						}
						varv++;
						quest.setText("fly");
				}else if(varv == 4){
					count++;
					stris = answer.getText();
					if (stris.equals("flew")) {
						   answer.setText("Super, das hast du es Richtig");
						   richt++;
						}else {
							answer.setText("Leider ist das die Falsche antwort");
						}
						varv++;
						quest.setText("get");
				}else if(varv == 5){
					count++;
					stris = answer.getText();
					if (stris.equals("flew")) {
						   answer.setText("Super, das hast du es Richtig");
						   richt++;
						}else {
							answer.setText("Leider ist das die Falsche antwort");
						}
						varv++;
						quest.setText("Alle Fragen Durchgespielt!");
						answer.setEditable(false);
						btnPrfe.setText("Zeige Ergebnis");
				}else if(varv == 6){
					btnPrfe.setEnabled(false);
					answer.setText("Du hast " + richt + " von " + count + " Richtig");
				}else {
			      quest.setText("be | (ANTWORT KLEINSCHREIBEN, kommagetrennt)");
			      varv++;
			      btnPrfe.setText("Pr\u00FCfe");
			    }
			}
		});
		contentPane.add(btnPrfe, "cell 0 4,grow");
	}

}
