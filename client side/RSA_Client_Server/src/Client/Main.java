package Client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("client.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("RSA Client Home");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

    }
    void HomeClient(String args)
    {
         launch(args);
    }
    public static void main(String[] args) {
       Login log=new Login();
       log.show();
    }
}
