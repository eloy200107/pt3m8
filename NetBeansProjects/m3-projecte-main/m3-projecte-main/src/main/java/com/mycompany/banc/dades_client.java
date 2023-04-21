package com.mycompany.banc;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class dades_client {
    @FXML
    private TextField nom_client;
    @FXML
     private TextField cognoms_client;
    @FXML
      private TextField DNI_client;
    @FXML
       private TextField num_compte_client;
   
    @FXML
    void initialize() {
        Usuario u = App.banc.getUsuariActual();
        u.getPassword();
        u.getUsername();
        nom_client.setText(u.getNom_client());
        cognoms_client.setText(u.getCognoms_client());
        DNI_client.setText(u.getDNI_client());
        num_compte_client.setText(u.getNº_compteclient());
        u.getCognoms_client();
        u.getDNI_client();
        u.getNº_compteclient();
        u.getNom_client();
    }
    

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("secondry1");
    }
     @FXML
    private void escull() throws IOException {
        App.setRoot("comptes");
    }
}
 