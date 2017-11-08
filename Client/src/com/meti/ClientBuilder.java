package com.meti;

import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class ClientBuilder {
    private final Console console;

    public ClientBuilder(Console console) {
        this.console = console;
    }

    public void openDialog(Stage primaryStage) throws IOException {
        console.log("Opening dialog");

        ClientCreator creator = Utility.buildFXML(new File("Client\\assets\\fxml\\ClientCreator.fxml"), primaryStage);

        //TODO: custom client loading
    }
}
