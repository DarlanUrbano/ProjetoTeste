import java.awt.event.ActionEvent;
import java.sql.Connection;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaPrincipal extends JFrame  {
	private JButton btnUsuario;
	private JButton btnFornecedor;
public TelaPrincipal() {
		
		    setSize(300	,300);
		    setLayout(null);
	        setTitle("Operador");
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
	        btnUsuario = new JButton(new AbstractAction("USUARIO") {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new TelaUsuario().setVisible(true);
				}
				
			});
			btnUsuario.setBounds(50, 40, 200, 30);
			getContentPane().add(btnUsuario);
			
			 btnFornecedor= new JButton(new AbstractAction("FORNECEDOR") {

					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						new TelaFornecedor().setVisible(true);
					}
					
				});
				btnFornecedor.setBounds(50, 120, 200, 30);
				getContentPane().add(btnFornecedor);

	        
	        }
public static void main(String[] args) {
	new TelaPrincipal().setVisible(true);
}
}
