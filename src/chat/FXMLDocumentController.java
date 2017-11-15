/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import com.sun.prism.paint.Color;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.TextFlow;

/**
 *
 * @author Fahad-pc
 */
public class FXMLDocumentController implements Initializable {
    
   @FXML
   public ComboBox style;
   @FXML
   public ComboBox size;
   @FXML
   public ColorPicker color;
   @FXML
   public TextFlow history;
   @FXML
   public TextArea text;
   @FXML
   public Button send;
   @FXML
   public Button clear;
   @FXML
   public AnchorPane pane;
   @FXML
   public Pane p;
   @FXML
        private void send(ActionEvent Event)
        {
            System.out.println("clicked");
            text.setText("Fahad");
        }
       @FXML
       private void selectsize(ActionEvent Event)
       {        
          int font1 =  Integer.valueOf((String)size.getValue());
            font1 = font1+10;
          text.setFont(Font.font(font1));
       }
     
     @FXML
        private void selectstyle(ActionEvent Event)
        {
            
             String color =  (String)style.getValue();
           //  pane.setBackground(color);
          // pane.setBackground(new Background(new BackgroundFill(Color.web("black"), CornerRadii.EMPTY, Insets.EMPTY)));
           p.setStyle("-fx-background-color:"+color+";");
           // pane.setBackground(Background.EMPTY);
        }
        @FXML
            private void setclear(ActionEvent event)
            {
                text.setText("");
            }
   @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       // style.getItems().removeAll(style.getItems());
    style.getItems().addAll("black", "silver", "gray","pink","white","gold","blue");
    size.getItems().addAll("1", "2", "3","4","5","6");
    
//style.getSelectionModel().select("Option B");
    }
    
}
