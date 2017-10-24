package com.meti.client;

import com.meti.client.fxml.ClientDisplay;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;

import static com.meti.Main.getInstance;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 10/20/2017
 */
public class ClientCreator {
    @FXML
    private TextField address;

    @FXML
    private TextField port;

    @FXML
    private TextField password;

    public void start() throws IOException {
        URL url = new File("assets\\fxml\\ClientCreator.fxml").toURI().toURL();
        Parent parent = FXMLLoader.load(url);
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void connect() throws IOException {
        InetAddress addressObj = InetAddress.getByName(address.getText());
        int portInt = Integer.parseInt(port.getText());
        Client client = new Client(addressObj, portInt, password.getText());

        //controller returning null... hmmmm
        Object controller = getInstance().buildStage("assets\\fxml\\ClientDisplay.fxml", null);
        if (controller instanceof ClientDisplay) {
            ((ClientDisplay) controller).setClient(client);
        } else {
            throw new RuntimeException("Controller not instance of ClientDisplay");
        }
    }
}
