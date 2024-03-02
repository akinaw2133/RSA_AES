package Server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("server.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("RSA Server Home");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

    }
     void HomePage(String args)
    {
          launch(args);
    }
    public static void main(String[] args) {
        //launch(args);
        Login log =new Login();
        log.show();
    }
}
