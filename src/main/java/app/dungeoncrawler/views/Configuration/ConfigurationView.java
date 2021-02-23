package app.dungeoncrawler.views.Configuration;

import app.dungeoncrawler.views.SceneNames;
import app.dungeoncrawler.views.ViewBase;
import app.dungeoncrawler.views.Welcome.WelcomeViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ConfigurationView extends ViewBase {
    private Scene scene;

    public ConfigurationView(Stage stage) {
        super(stage, SceneNames.CONFIGURATION);
        this.buildScene();
    }

    @Override
    public void buildScene(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ConfigurationView.fxml"));
            GridPane box = loader.load();
            ConfigurationViewController controller = loader.getController();

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
