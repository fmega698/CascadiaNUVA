package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import player.player;

public class scene3 extends player{
	private static Scene scene;

	static {
		try {
			FXMLLoader loader = new FXMLLoader(Scene2.class.getResource("Scene3.fxml"));
			Parent root = loader.load();

			TextField textfield1 = (TextField) root.lookup("#textbox1");
			TextField textfield2 = (TextField) root.lookup("#textbox2");
			TextField textfield3 = (TextField) root.lookup("#textbox3");
			Button button5 = (Button) root.lookup("#Button5");

			button5.setOnAction(event -> {
				gettext(textfield1.getText());
				gettext(textfield2.getText());
				gettext(textfield3.getText());
				player.playercount = 3;
				Stage stage = (Stage) button5.getScene().getWindow();
			    stage.setScene(GamePanel.getScene());
			    stage.show();


			}); 
			
			

			scene = new Scene(root);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void gettext(String g) {

		player.addplayer(g);
		System.out.println(g);
		
	}

	public static Scene getScene() {
		return scene;
	}
}