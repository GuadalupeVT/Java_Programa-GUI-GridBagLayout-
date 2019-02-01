import java.awt.*;
import javax.swing.*;

public class Prueba extends JFrame{
	GridBagLayout gbl=new GridBagLayout();
	GridBagConstraints gbc =new GridBagConstraints();
	public Prueba() {
		crearComponentes();
	}
	public void crearComponentes() {
		//configuracion de ventana
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.WHITE);
		setTitle("Registro");
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		Font fuente = new Font("Arial", 523, 14);
		JLabel label1 = new JLabel("<html><p> The <b>Clasic Form</b> to includes all visible fields for <br> this list </p></html>");
		label1.setFont(fuente);
		metodoMagico(label1, 2, 2, 1,1);
		
		JLabel label2 = new JLabel("<html><br> Form options</html>");
		label2.setFont(new Font("Arial", 523, 18));
		metodoMagico(label2,2,5,1,1);
		
		JLabel label3 = new JLabel("Include the following: ");
		label3.setFont(fuente);
		metodoMagico(label3,2,10,1,1);
		
		JCheckBox caja1 = new JCheckBox("a little for your form");
		caja1.setFont(fuente);
		metodoMagico(caja1,2,15,1,1);
		
		JTextField textField1 =new JTextField("Subscribe to our mailing list");
		textField1.setFont(fuente);
		metodoMagico(textField1,2,20,1,1);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton rboton1 = new JRadioButton("only requiered fields");
		bg.add(rboton1);
		rboton1.setFont(fuente);
        metodoMagico(rboton1,2,30,1,1);
		
		JRadioButton rboton2 = new JRadioButton("all fields");
		bg.add(rboton2);
		rboton2.setFont(fuente);
		metodoMagico(rboton2,2,35,1,1);
		
		
		
		pack();
}
	public void metodoMagico(JComponent componente,int x,int y, int width, int height) {
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=width;
	    gbc.gridheight=height;
	    gbc.fill=GridBagConstraints.BOTH;
	    gbl.setConstraints(componente, gbc);
	    add(componente);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				new Prueba();
				
			}
		});
	}

}
