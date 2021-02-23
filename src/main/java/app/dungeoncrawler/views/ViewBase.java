package app.dungeoncrawler.views;

import javafx.stage.Stage;

public abstract class ViewBase implements ViewMaker {
    protected Stage stage;
    SceneNames sceneName;
    public ViewBase(Stage stage, SceneNames name) {
        if (name == null) {
            throw new IllegalArgumentException("ViewBase: sceneName cant be null");
        }
        
        if (stage == null) {
            throw new IllegalArgumentException("ViewBase: stage cant be null");
        }
        this.sceneName = name;
        this.stage = stage;
    }
    
    public abstract void buildScene();
    
    public void mountingScene() {
        System.out.println(String.format("%s: mounting", this.sceneName));
    }
    
    public void unMountingScene() {
        System.out.println(String.format("%s: unmounting", this.sceneName));
    }
}
