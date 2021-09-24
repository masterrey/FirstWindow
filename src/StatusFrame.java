import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class StatusFrame extends JFrame {

	private JPanel contentPane;

	JTextPane saidaRelatorio;
	/**
	 * Create the frame.
	 */
	public StatusFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		saidaRelatorio = new JTextPane();
		saidaRelatorio.setBounds(45, 21, 348, 217);
		contentPane.add(saidaRelatorio);
	
		
	}
	
	public void UpdateWindow() {
		String saida="";
		
		for(int i=0;i<MainFrame.window.GetUsuarios().length;i++) {
			saida +=MainFrame.window.GetSingleUsuario(i).nome+" ";
			saida +=MainFrame.window.GetSingleUsuario(i).idade+ " ";
			saida +=MainFrame.window.GetSingleUsuario(i).altura;
			saida +=System.getProperty("line.separator");
		}
		
		saidaRelatorio.setText(saida);
		
	
	}
}
