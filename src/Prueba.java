import java.awt.*;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class Prueba extends JFrame{
	GridBagLayout gbl=new GridBagLayout();
	GridBagConstraints gbc =new GridBagConstraints();
	
	JPanel panel1 = new JPanel();
	JPanel panel3 = new JPanel();
	public Prueba() {
		crearComponentes();
	}
	public void crearComponentes() {
		//configuracion de ventana
		
		
		panel1.setBackground(Color.WHITE);
	    panel1.setLayout(gbl);
		
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.WHITE);
		setTitle("Registro");
		//setLocationRelativeTo(null);
		setVisible(true);
		
		metodoMagico(new JLabel("   "),0,0,1,1);
		
		Font fuente = new Font("Arial", 523, 14);
		JLabel label1 = new JLabel("<html><p> The <b>Clasic Form</b> to includes all visible fields for <br> this list </p></html>");
		label1.setFont(fuente);
		metodoMagico(label1, 1, 0, 1,1);
		
		JLabel label2 = new JLabel("<html><br> Form options</html>");
		label2.setFont(new Font("Arial", 523, 18));
		metodoMagico(label2,1,1,1,1);
		
		JLabel label3 = new JLabel("Include the following: ");
		label3.setFont(fuente);
		metodoMagico(label3,1,2,1,1);
		
		JCheckBox caja1 = new JCheckBox("a little for your form");
		caja1.setFont(fuente);
		caja1.setBackground(Color.WHITE);
		metodoMagico(caja1,1,3,1,1);
		
		JTextField textField1 =new JTextField("Subscribe to our mailing list");
		textField1.setFont(fuente);
		metodoMagico(textField1,1,4,1,1);
		
		metodoMagico(new JLabel(" "), 1, 5, 1, 1);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton rboton1 = new JRadioButton("only requiered fields");
		bg.add(rboton1);
		rboton1.setFont(fuente);
		rboton1.setBackground(Color.WHITE);
        metodoMagico(rboton1,1,6,1,1);
		
		JRadioButton rboton2 = new JRadioButton("all fields");
		bg.add(rboton2);
		rboton2.setFont(fuente);
		rboton2.setBackground(Color.WHITE);
		metodoMagico(rboton2,1,7,1,1);
		
		JLabel label4 = new JLabel("<html>(edit requiered fields in <font color=\"blue\">the form builder</font>)</html>");
		label4.setFont(fuente);
		metodoMagico(label4, 1, 8, 1, 1);
		
		metodoMagico(new JLabel(" "), 1, 9, 1, 1);
		
		JCheckBox caja2 = new JCheckBox("interest group fields");
		caja2.setFont(fuente);
		caja2.setBackground(Color.WHITE);
		metodoMagico(caja2,1,10,1,1);
		
		JCheckBox caja3 = new JCheckBox("requiered field indicators");
		caja3.setFont(fuente);
		caja3.setBackground(Color.WHITE);
		metodoMagico(caja3,1,11,1,1);
		
		metodoMagico(new JLabel(" "),1,12,1,1);
		
		JLabel label7 = new JLabel("Set form width");
		label7.setFont(fuente);
		metodoMagico(label7,1,13,1,1);
		
		JTextField textField2=new JTextField();
		metodoMagico(textField2,1,14,1,1);
		
		metodoMagico(new JLabel(" "),1,15,1,1);
		
		JLabel label8 = new JLabel("Enhance your form");
		label8.setFont(fuente);
		metodoMagico(label8,1,16,1,1);
		
		JCheckBox caja4 = new JCheckBox("<html>enable <b>evil</b> popup mode </html>");
		caja4.setBackground(Color.WHITE);
		caja4.setFont(fuente);
		metodoMagico(caja4,1,17,1,1);
		
		JCheckBox caja5 = new JCheckBox("<html>disable all <b>JavaScript</b></html>");
		caja5.setBackground(Color.WHITE);
		caja5.setFont(fuente);
		metodoMagico(caja5,1,18,1,1);
		
		JCheckBox caja6 = new JCheckBox("include archive link");
		caja6.setBackground(Color.WHITE);
		caja6.setFont(fuente);
		metodoMagico(caja6,1,19,1,1);
		
		JCheckBox caja7 = new JCheckBox("<html>include<font color=\"blue\"> MonkeyRewards</font></html>");
		caja7.setBackground(Color.WHITE);
		caja7.setFont(fuente);
		metodoMagico(caja7,1,20,1,1);
		
		metodoMagico(new JLabel("           "),2,0,1,1);
		
		JLabel label10 = new JLabel("Preview");
		label10.setFont(new Font("Arial", 523, 18));
		metodoMagico(label10,3,0,1,1);
		
		JLabel label11 = new JLabel("<html><font color=\"white\">.....................................................</font><font color=\"red\">* </font>indicates required</html>");
		label11.setFont(fuente);
		label1.setAlignmentX(LEFT_ALIGNMENT);
		metodoMagico2(label11,0,0,1,1);
		
		JLabel label12 = new JLabel("Email Address");
		label12.setFont(fuente);
		metodoMagico2(label12,0,1,1,1);
		
		try {
			MaskFormatter mfCC = new MaskFormatter("##################################@gmail.com                                                     ");
			mfCC.setPlaceholderCharacter(' ');
			JFormattedTextField cajaEmail=new JFormattedTextField(mfCC);
			cajaEmail.setSize(50, 1);
			cajaEmail.setEditable(true);
			cajaEmail.setEnabled(true);
			metodoMagico2(cajaEmail,0,2,1,1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		panel3.setLayout(gbl);
		metodoMagico(panel3,3,1,1,1);
		
		
		add(panel1);
		pack();
}
	public void metodoMagico(JComponent componente,int x,int y, int width, int height) {
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=width;
	    gbc.gridheight=height;
	    gbc.fill=GridBagConstraints.BOTH;
	    gbl.setConstraints(componente, gbc);
	    panel1.add(componente);
	}
	
	public void metodoMagico2(JComponent componente,int x,int y, int width, int height) {
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=width;
	    gbc.gridheight=height;
	    gbc.fill=GridBagConstraints.BOTH;
	    gbl.setConstraints(componente, gbc);
	    panel3.add(componente);
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
