package ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
	private static final int PADDING = 10;
	private Label label;
	private TextField textField;
	private TextArea textArea;
	private Button button;


	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		label = new Label("I'm a label!");
		textField = new TextField("You can enter some text here.");
		textArea = new TextArea("You can enter lots of text here");
		button = new Button("Hello World");
	}

	private void layoutControls() {
		getChildren().addAll(label, textField, textArea, button);
		setPadding(new Insets(PADDING));
	}
}
