package app.dungeoncrawler.views.Welcome;

import app.dungeoncrawler.views.AppScenes;
import app.dungeoncrawler.views.SceneNames;
import app.dungeoncrawler.views.ViewBase;
import app.dungeoncrawler.views.ViewMaker;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeView extends ViewBase {
	private Scene scene;
	public WelcomeView(Stage stage) {
		super(stage, SceneNames.WELCOME);
		this.buildScene();
	}
	
	public void buildScene() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("WelcomeView.fxml"));
			GridPane box = loader.load();
			WelcomeViewController controller = loader.getController();
			
			this.scene = new Scene(box, this.stage.getWidth(), this.stage.getHeight());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Scene getScene() {
		return scene;
	}
}
