/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javax.management.Query.value;
import static javax.swing.Spring.height;

/**
 *
 * @author MYousry
 */
public class navbar {

   
    
    
    
    public Pane navbar(){
       Rectangle rectangle = new Rectangle();
       Pane pane = new Pane();
       rectangle.setX(0.0f); 
       rectangle.setY(0.0f); 
       rectangle.setWidth(1500.0f);
       rectangle.setHeight(75.0f);
       rectangle.setId("aaa");
       
       
        
        pane.getChildren().add(rectangle);
       
        pane.getStylesheets().add(getClass().getResource("navbar.css").toExternalForm());
        
        return pane;
    
    
    
    }

   
    
    
    
    
    
    
}
