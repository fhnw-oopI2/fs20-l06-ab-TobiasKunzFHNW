package ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import org.w3c.dom.Text;

public class ApplicationUI extends BorderPane {
	private static final int MARGIN = 5;
	private Button buttonTop;
	private Button buttonRight;
	private Button buttonBottom;
	private Button buttonLeft;
	private TextArea textArea;


	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		buttonTop = new Button("Top");
		buttonTop.setMaxWidth(500);
		buttonRight = new Button("Right");
		buttonBottom = new Button("Bottom");
		buttonBottom.setMaxWidth(500);
		buttonLeft = new Button("Left");
		textArea = new TextArea("Enter text");


	}

	private void layoutControls() {
		setCenter(textArea);
		setTop(buttonTop);
		setRight(buttonRight);
		setBottom(buttonBottom);
		setLeft(buttonLeft);


		setMargin(getTop(), new Insets(MARGIN));
		setMargin(getRight(), new Insets(0,MARGIN,0,MARGIN));
		setMargin(getBottom(), new Insets(MARGIN));
		setMargin(getLeft(),new Insets(0,MARGIN,0,MARGIN));

	}
}
