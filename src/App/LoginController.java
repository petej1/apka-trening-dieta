package App;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginController extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    Alert alert;

    @Override
    public void start(Stage primaryStage) throws Exception {

        DBConnect connect = new DBConnect();
        connect.getData();

        primaryStage.setTitle("Ekran logowania");

        primaryStage.show();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 400, 275);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Witaj");
        grid.add(scenetitle,0,0,2,1);

        Label userName = new Label("Login użytkownika");
        grid.add(userName,0,1);

        TextField userTextField = new TextField();
        grid.add(userTextField,1,1);

        Label pw = new Label("Password: ");
        grid.add(pw,0,2);

        PasswordField pwField = new PasswordField();
        grid.add(pwField,1,2);

        Button ok = new Button("Press me");
        grid.add(ok,1,3);
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("halo halo");
                alert.showAndWait();
            }
        });

    }
    }


