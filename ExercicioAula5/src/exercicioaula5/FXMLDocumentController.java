/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula5;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author eduardo-santos
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensagem, lblHora, lblIdioma, lblResolucao;
    private Button btnClick;
    
    @FXML
    public void clicouBotao(ActionEvent event) {
        Date relogio = new Date();
        Locale idioma = Locale.getDefault();
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension dimensao = resolucao.getScreenSize();
        
        
        lblMensagem.setText("ATRIBUTOS ABAIXO!");
        lblHora.setText(relogio.toString());
        lblIdioma.setText(idioma.getDisplayLanguage());
        lblResolucao.setText((int) dimensao.getWidth()+"x"+ (int) dimensao.getHeight());
    }
    
    public void clicouBotao2(ActionEvent event) {
        clicouBotao(event);
        Locale idioma = Locale.getDefault();
        lblMensagem.setText("Clicou no Segundo botão!!");
        lblIdioma.setText(idioma.getDisplayName());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
