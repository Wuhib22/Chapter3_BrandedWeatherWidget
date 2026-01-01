package weatherwidget;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class WeatherWidgetController {

    public BorderPane createUI() {
        BorderPane root = new BorderPane();
        root.getStyleClass().add("main-container");

        // Header - Branding
        VBox header = new VBox(5);
        header.setAlignment(Pos.CENTER);
        header.getStyleClass().add("header");
        Label brandName = new Label("EcoLife");
        brandName.getStyleClass().add("brand-name");
        Label slogan = new Label("Sustainable Living");
        slogan.getStyleClass().add("slogan");
        header.getChildren().addAll(brandName, slogan);

        // Content - Weather Info
        VBox content = new VBox(20);
        content.setAlignment(Pos.CENTER);
        content.setPadding(new Insets(20));
        content.getStyleClass().add("content");

        Label location = new Label("San Francisco, CA");
        location.getStyleClass().add("location");

        // Temperature and Icon (Text representation)
        HBox tempBox = new HBox(10);
        tempBox.setAlignment(Pos.CENTER);
        Label temp = new Label("72°F");
        temp.getStyleClass().add("temperature");
        Label icon = new Label("☀"); // Unicode sun
        icon.getStyleClass().add("weather-icon");
        tempBox.getChildren().addAll(icon, temp);

        Label condition = new Label("Sunny & Clear");
        condition.getStyleClass().add("condition");

        // Details
        HBox details = new HBox(20);
        details.setAlignment(Pos.CENTER);
        Label humidity = new Label("Humidity: 45%");
        Label wind = new Label("Wind: 5 mph");
        details.getChildren().addAll(humidity, wind);
        details.getStyleClass().add("details");

        content.getChildren().addAll(location, tempBox, condition, details);

        // Footer
        VBox footer = new VBox();
        footer.setAlignment(Pos.CENTER);
        footer.setPadding(new Insets(10));
        footer.getStyleClass().add("footer");
        Label footerText = new Label("Powered by EcoWeather");
        footerText.getStyleClass().add("footer-text");
        footer.getChildren().add(footerText);

        root.setTop(header);
        root.setCenter(content);
        root.setBottom(footer);

        return root;
    }
}
