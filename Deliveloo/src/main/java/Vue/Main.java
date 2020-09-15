package Vue;

import com.sothawo.mapjfx.Projection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static javafx.application.Application.launch;

/**
 * Demo application for the mapjfx component.
 *
 * @author P.J. Meisch (pj.meisch@sothawo.com).
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String fxmlFile = "/fxml/VueDeliveloo.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent rootNode = fxmlLoader.load(getClass().getResourceAsStream(fxmlFile));

        Scene scene = new Scene(rootNode);

        primaryStage.setTitle("Deliveloo application");
        primaryStage.setScene(scene);
        primaryStage.show();

        final Controller controller = fxmlLoader.getController();
        final Projection projection = getParameters().getUnnamed().contains("wgs84")
                ? Projection.WGS_84 : Projection.WEB_MERCATOR;
        controller.initializeView(scene, projection, primaryStage);
        System.out.println(primaryStage);
    }
}
