import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JTextField;

public class MainFrame {

	private JFrame frmEspmGo;
	private JLabel messageOut;
	private JTextField entradaNome;
	private JTextField entradaIdade;
	private JLabel lblNewLabel_1;
	
	private Usuario[] usuarios;
	int usuarioIndex=0;
	private JButton nextButton;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmEspmGo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
		usuarios=new Usuario[3];
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEspmGo = new JFrame();
		frmEspmGo.getContentPane().setForeground(Color.CYAN);
		frmEspmGo.getContentPane().setLayout(null);
		frmEspmGo.setTitle("Espm Go");
		frmEspmGo.setBounds(100, 100, 450, 300);
		frmEspmGo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmEspmGo.getContentPane().add(Button1());
		
		messageOut = new JLabel("");
		messageOut.setBounds(10, 241, 416, 13);
		frmEspmGo.getContentPane().add(messageOut);
		
		entradaNome = new JTextField();
		entradaNome.setBounds(39, 37, 186, 19);
		frmEspmGo.getContentPane().add(entradaNome);
		entradaNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(39, 23, 45, 13);
		frmEspmGo.getContentPane().add(lblNewLabel);
		
		entradaIdade = new JTextField();
		entradaIdade.setBounds(39, 87, 96, 19);
		frmEspmGo.getContentPane().add(entradaIdade);
		entradaIdade.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(39, 66, 45, 13);
		frmEspmGo.getContentPane().add(lblNewLabel_1);
		
		nextButton = new JButton("Next");
		nextButton.setBounds(289, 210, 101, 21);
		frmEspmGo.getContentPane().add(nextButton);
	}
	
	JButton Button1() {
		JButton Cadastrar = new JButton("Cadastrar");
		Cadastrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//System.out.print(" teste ");
				if(usuarioIndex<usuarios.length) {
					String nome=entradaNome.getText();
					int idade=Integer.parseInt(entradaIdade.getText());
					
					usuarios[usuarioIndex]=new Usuario(nome,idade);
					usuarioIndex++;
					messageOut.setText("cadastrado "+nome);
					entradaNome.setText("");
					entradaIdade.setText("");
				}else {
					messageOut.setText("memoria cheia");
				}
			}
			
		});
		Cadastrar.setBackground(Color.RED);
		Cadastrar.setBounds(289, 86, 101, 21);
		return Cadastrar;
	}
}
