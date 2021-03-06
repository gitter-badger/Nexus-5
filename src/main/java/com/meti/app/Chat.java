package com.meti.app;

import com.meti.util.fxml.Controller;
import com.meti.util.fxml.FXUtil;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 1/14/2018
 */
public class Chat extends Controller implements Initializable {
    @FXML
    private BorderPane contentPane;

    @FXML
    private TextField inputField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TextArea area = new TextArea();
        //TODO: replace area with RichTextFX API in chat

        FXUtil.zeroAnchors(area);
        contentPane.setCenter(area);
    }

    @FXML
    public void handleInput() {
        String value = inputField.getText();
        //TODO: handle value for input in the chat
    }
}
