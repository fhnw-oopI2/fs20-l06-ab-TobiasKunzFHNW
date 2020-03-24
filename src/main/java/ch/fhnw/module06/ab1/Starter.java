package ch.fhnw.module06.ab1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Parent rootPane = new ApplicationUI();
		Scene myScene = new Scene(rootPane);

		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(myScene);
		primaryStage.setWidth(400);
		primaryStage.setHeight(300);
		primaryStage.show();
	}
}
