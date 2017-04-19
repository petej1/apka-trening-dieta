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

    private Stage stage;
    Alert alert;


    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;

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

                GridPane grid1 = new GridPane();
                grid1.setAlignment(Pos.CENTER);
                grid1.setHgap(10);
                grid1.setVgap(10);
                grid1.setPadding(new Insets(25, 25, 25, 25));


                Button cal = new Button("Kalkulator twojego zdrowia");
                Button food = new Button("Przykładowe dania");
                grid1.add(cal,1,2);
                grid1.add(food,1,3);

                Scene scene = new Scene(grid1, 400, 275);
                primaryStage.setTitle("Menu");
                primaryStage.setScene(scene);

                cal.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        GridPane grid1 = new GridPane();
                        grid1.setAlignment(Pos.CENTER);
                        grid1.setHgap(50);
                        grid1.setVgap(10);


                        Button cal = new Button("BMI");
                        Button food = new Button("COS");
                        Button food1 = new Button("COS");
                        Button food2 = new Button("COS");
                        Button food3= new Button("COS");
                        grid1.add(cal,0,1);
                        grid1.add(food,1,1);
                        grid1.add(food1,2,1);
                        grid1.add(food2,0,2);
                        grid1.add(food3,1,2);


                        Scene scene = new Scene(grid1, 400, 275);
                        primaryStage.setTitle("Kalkulator");
                        primaryStage.setScene(scene);


                    }
                });

            }
        });

    }
}


