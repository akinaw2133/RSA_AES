package Client;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import Encription.Message;
import Encription.PublicKeys;
import Encription.RSA;
import Encription.ServerConnectionEvents;

public class Controller extends ServerConnectionEvents {

    private RSA rsa;

    private Client client;

    private PublicKeys serverPublicKey;

    @FXML
    TextArea message_box;

    @FXML
    TextArea message_list;

    @FXML
    TextArea public_key;

    @FXML
    TextArea public_exponent;


    public Controller() {

        rsa = new RSA(2048);

        client = new Client("192.168.0.104", 1225, this);

    }

    public void initialize() {
        public_key.setText(rsa.getModulus().toString());
        public_key.setWrapText(true);
        public_exponent.setText(rsa.getPublicKey().toString());
    }

    public void connectServer() {

        client.setPublicKeys(getPublicKeys(rsa));

        client.start();
    }

    public void sendMessage() {

        Message message = encrypt(rsa, message_box, serverPublicKey);

        client.sendMessage(message);
    }

    void onMessageArrived(Message message) {

        messageArrived(message, rsa, serverPublicKey, message_list);

    }

    @Override
    public void onPublicKeyArrived(PublicKeys serverPublicKey) {
        this.serverPublicKey = serverPublicKey;
    }
}


