import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Exercise extends Frame implements ActionListener{
	Button button;
	TextField textfield1 = new TextField(20);
	TextField textfield2 = new TextField(20);
	TextField textfield3 = new TextField(20);
	TextField textfield4 = new TextField(20);
	Exercise(){
		//Frame Settings
		setTitle("Registration Form");
		setSize(280,300);
		setVisible(true);
		setLayout(new FlowLayout());
		button = new Button("Submit");
		//label settings                                                                                                                                                                                                                                                                                                                 
		Label label1 = new Label("Name: ");
		label1.setAlignment(Label.CENTER);
		Label label2 = new Label("Age: ");
		label2.setAlignment(Label.CENTER);
		Label label3 = new Label("E-mail: ");
		label3.setAlignment(Label.CENTER);
		Label label4 = new Label("Mobile No: ");
		label4.setAlignment(Label.CENTER);
		label1.setSize(500,100);
		label2.setSize(500,100);
		label3.setSize(500,100);
		label4.setSize(500,100);
		
		
		//adding components into frame
		add(label1);
		add(textfield1);
		add(label2);
		add(textfield2);
		add(label3);
		add(textfield3);
		add(label4);
		add(textfield4);
	
		add(button);
		//setting the details
		/*textfield1.setText("Name: ");
		textfield2.setText("Age: ");
		textfield3.setText("E-mail: ");
		textfield4.setText("Mobile No: ");*/
		button.addActionListener(this);//registering
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Name: "+textfield1.getText());
		System.out.println("Age: "+textfield2.getText());
		System.out.println("E-mail: "+textfield3.getText());
		System.out.println("Mobile No: "+textfield4.getText());
		
	}
	public static void main(String[] args) {
		Exercise demo = new Exercise();
	}
}
