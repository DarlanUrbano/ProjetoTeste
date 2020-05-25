import java.awt.event.ActionEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TelaUsuario extends JFrame{
	
	private DefaultTableModel model;
	private JTable tbl;
	private JScrollPane scroll;
	private JButton btnAdicionar;
	private JButton btnExcluir;
	private JButton btnAlterar;
	private JButton btnFiltrar;
	private JLabel lblProduto;
	private JTextField TxfProduto;
	private JLabel lblDataIni;
	private JTextField TxfDataIni;
	private JLabel lblDataFim;
	private JTextField TxfDatafim;
	private JPanel pnlUsuario;
	private String produto,dataini,datafim,aux;
	private int cont=0,i;
	private String[] salvo;
	
	
		public TelaUsuario() {
			setSize(800	,600);
			 setLayout(null);
		        setTitle("Usuario");
		        setLocationRelativeTo(null);
		        setDefaultCloseOperation(EXIT_ON_CLOSE);
		        	        
		        lblProduto = new JLabel("Produto");
				lblProduto.setBounds(40, 20, 100, 50);
				getContentPane().add(lblProduto);
				
				TxfProduto = new JTextField();
				TxfProduto.setBounds(40, 60, 210, 25);
				getContentPane().add(TxfProduto);
				
				lblDataIni = new JLabel("Data Inicial");
				lblDataIni.setBounds(415, 30, 300, 25);
				getContentPane().add(lblDataIni);
					
				TxfDataIni = new JTextField();
				TxfDataIni.setBounds(400, 60, 100, 25);
				getContentPane().add(TxfDataIni);
				
				lblDataFim = new JLabel("Data Final");
				lblDataFim.setBounds(565, 30, 300, 25);
				getContentPane().add(lblDataFim);
					
				TxfDatafim = new JTextField();
				TxfDatafim.setBounds(550, 60, 100, 25);
				getContentPane().add(TxfDatafim);
				produto=TxfProduto.getText();
				dataini=TxfDataIni.getText();
				datafim=TxfDatafim.getText();
		        btnAdicionar = new JButton(new AbstractAction("Adicionar") {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(TxfDatafim.getText().isEmpty()||TxfDataIni.getText().isEmpty()||TxfDatafim.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Aviso", JOptionPane.WARNING_MESSAGE);}
						else if(!validaNum(TxfDatafim.getText())||!validaNum(TxfDataIni.getText())){
							JOptionPane.showMessageDialog(null, "Os campos 'Data Inicial' e 'Data Final' não podem conter letras", "Aviso", JOptionPane.WARNING_MESSAGE);}
						else {
						produto=TxfProduto.getText();
						dataini=TxfDataIni.getText();
						datafim=TxfDatafim.getText();
						model.addRow(new String[] {produto,"",dataini,datafim});
						salvo[cont]=dataini;
						cont++;
						
						}
						
					}
					
					
				});
				btnAdicionar.setBounds(40, 140, 150, 25);
				getContentPane().add(btnAdicionar);
				
				
				btnExcluir = new JButton(new AbstractAction("Excluir") {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						model.removeRow(0);
					}
					
				});
				btnExcluir.setBounds(225, 140, 150, 25);
				getContentPane().add(btnExcluir);
		        
				btnAlterar = new JButton(new AbstractAction("Alterar") {
					@Override
					public void actionPerformed(ActionEvent e) {
						//model.is
					}
					
				});
				btnAlterar.setBounds(410, 140, 150, 25);
				getContentPane().add(btnAlterar);
				
				btnFiltrar = new JButton(new AbstractAction("Filtrar") {
					@Override
					public void actionPerformed(ActionEvent e) {
						model.getRowCount();
					
					}
					
				});
				btnFiltrar.setBounds(590, 140, 150, 25);
				getContentPane().add(btnFiltrar);
				
		        model=new DefaultTableModel();
		        model.addColumn("Produto");
		        model.addColumn("Cotação");
		        model.addColumn("Data Inicial");
		        model.addColumn("Data Final");
		        
		        tbl=new JTable(model);
		        scroll=new JScrollPane(tbl);
		        scroll.setBounds(40, 180, 700, 350);
		        getContentPane().add(scroll);
		        model.isCellEditable(0, 0);
		}
		
		public static boolean validaNum(String texto) {
			Pattern pat = Pattern.compile("[0-9-,-.]+");      
			Matcher mat = pat.matcher(texto);
			return mat.matches();
			}
		public void ordem() {
			while(cont!=0) {
				for(i=0;i<=cont;i++) {
					
				}
			}
			
		}
	public static void main(String[] args) {
			new TelaUsuario().setVisible(true);
	}

}
