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
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Registro");
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		Font fuente = new Font("Arial", 523, 14);
		JLabel label1 = new JLabel("<html><p> The <b>Clasic Form</b> to includes all visible fields for <br> this list </p></html>");
		label1.setFont(fuente);
		metodoMagico(label1, 2, 2, 50,1);
		
		JLabel label2 = new JLabel("<html><br> Form options</html>");
		label2.setFont(new Font("Arial", 523, 18));
		metodoMagico(label2,2,5,50,1);
		
		JLabel label3 = new JLabel("Include the following: ");
		label3.setFont(fuente);
		metodoMagico(label3,2,10,50,1);
		
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
