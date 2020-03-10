package presentation;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public final class GUI extends Application
{
	public void start(final Stage primaryStage)
	{
		// This will be a placeholder for until the application is in a stable enough state.
        try {
            StackPane root = new StackPane();
            Text text = new Text("The application is not ready yet! \n" + 
            					 "Once it's ready, this will be a lot less empty. \n" +
            					 "For now, have patience :)");
            text.setTextAlignment(TextAlignment.CENTER);
            root.getChildren().addAll(text);
            StackPane.setAlignment(text, Pos.CENTER);
            text.setStyle("-fx-font: 24 arial;");

            Scene scene = new Scene(root, 1000, 700);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
	}
}