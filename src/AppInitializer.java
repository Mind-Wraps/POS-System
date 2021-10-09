/**
 * @author Sanjaya Sandakelum <sandakelumsanjaya@gmail.com> (CREATIVE-2)
 * @since 2021-10-09
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass()
                .getResource("lk/mindwraps/pos/view/Dashboard.fxml"))));
        primaryStage.show();
    }
}
