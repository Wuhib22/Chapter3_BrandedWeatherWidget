package weatherwidget;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        WeatherWidgetController controller = new WeatherWidgetController();

        BorderPane root = controller.createUI();
        Scene scene = new Scene(root, 420, 520);

        scene.getStylesheets().add(
                getClass().getResource("/weatherwidget/style.css").toExternalForm()
        );

        stage.setTitle("EcoLife Weather Widget");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
