import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
public class MyController implements Initializable {
    @FXML
    private TextField inputField;
    @FXML
    private TextField outputField;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		inputField.setPromptText("enter text here then press button 1"); //Tell user what to do
        outputField.setText("final string goes here"); //Specifically not a prompt
        outputField.setDisable(true); //Output should always be disabled
	}	
	public void button1Method(ActionEvent e) throws IOException {
        outputField.setText(inputField.getText()+": from the center text field!"); //Get user input and set it on outputField
        //System.out.println("User had: " + inputField.getText());
	}
    public void button2Method(ActionEvent e) throws IOException {
        inputField.clear(); //Clear input so prompt shows again
        outputField.setText("final string goes here"); //Reset message in output
        //System.out.println("Cleared fields!");
    }
}
