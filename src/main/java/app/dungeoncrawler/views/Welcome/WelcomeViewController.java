package app.dungeoncrawler.views.Welcome;

import app.dungeoncrawler.views.AppScenes;
import app.dungeoncrawler.views.SceneNames;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class WelcomeViewController {
    @FXML
    public TextField textfield;
    
    @FXML
    public Button buttonNavigate;
    
    public void initialize() {
        textfield.setText("this is IVAN");
        buttonNavigate.setOnAction((event) -> {
            Node node = (Node) event.getSource();
            Stage thisStage = (Stage) node.getScene().getWindow();
            
            AppScenes.navigateTo(thisStage, SceneNames.CONFIGURATION);
        });
    }
}
