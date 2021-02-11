/*
 * Copyright (c)
 * 11 Feb 2021 01:20
 * Created by Mission Link
 */

package com.missionlink.ui;

import com.missionlink.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    private String programVersion = LicenceCode.DEFAULT_USER.getName();
    private IDocumentWorker documentWorker = new DocumentWorker();

    @FXML
    TextField textField;
    @FXML
    Button openButton;
    @FXML
    Button editButton;
    @FXML
    Button saveButton;
    @FXML
    private TextArea textArea;
    @FXML
    private Button inputButton;
    @FXML
    private Label versionLabel;

    @FXML
    public void handleInputButtonClick() {
        String textFiledInput = textField.getText();
        if (textFiledInput.equals(LicenceCode.PRO_USER.getLicenceValue())) {
            versionLabel.setText(LicenceCode.PRO_USER.getName());
            programVersion = LicenceCode.PRO_USER.getName();
            documentWorker = new PRODocumentWorker();
        } else if(textFiledInput.equals(LicenceCode.EXPERT_USER.getLicenceValue())){
            versionLabel.setText(LicenceCode.EXPERT_USER.getName());
            programVersion = LicenceCode.EXPERT_USER.getName();
            documentWorker = new ExpertDocumentWorker();
        }else {
            versionLabel.setText(LicenceCode.DEFAULT_USER.getName());
            programVersion = LicenceCode.DEFAULT_USER.getName();
            documentWorker = new DocumentWorker();
        }
        versionLabel.setText(programVersion);
    }

    @FXML
    public void openButtonPressed() {
        clearFields();
        textArea.setText(documentWorker.openDocument());
    }

    @FXML
    public void editButtonPressed() {
        clearFields();
        textArea.setText(documentWorker.editDocument());
    }

    @FXML
    public void saveButtonPressed() {
        clearFields();
        textArea.setText(documentWorker.saveDocument());
    }

    private void clearFields() {
//        textField.clear();
        textArea.clear();
    }

}
