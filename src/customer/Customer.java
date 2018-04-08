/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author MYousry
 */
public class Customer extends Application {

    public Pane root = new Pane();
    public Rectangle homeshadow = new Rectangle();

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        FileInputStream inputstream = new FileInputStream("F:\\gp\\customer\\src\\img\\775497.png");
        FileInputStream logoutstream = new FileInputStream("F:\\gp\\customer\\src\\img\\logout.png");
        FileInputStream homestream = new FileInputStream("F:\\gp\\customer\\src\\img\\home.png");
        FileInputStream aboutstream = new FileInputStream("F:\\gp\\customer\\src\\img\\about.png");
        FileInputStream profilestream = new FileInputStream("F:\\gp\\customer\\src\\img\\user.png");
        FileInputStream screen = new FileInputStream("F:\\gp\\customer\\src\\img\\monitor.png");
        FileInputStream profilepic = new FileInputStream("F:\\gp\\customer\\src\\img\\profile.png");
        FileInputStream emailpic = new FileInputStream("F:\\gp\\customer\\src\\img\\email.png");
        FileInputStream phonepic = new FileInputStream("F:\\gp\\customer\\src\\img\\phone.png");
        FileInputStream detailspic = new FileInputStream("F:\\gp\\customer\\src\\img\\details.png");
        Rectangle rectangle = new Rectangle();

        //bar
        rectangle.setX(0);
        rectangle.setY(0);
        rectangle.setWidth(1365.0f);
        rectangle.setHeight(80.0f);
        rectangle.setFill(Color.web("#ffc100"));
        //home shadow
        homeshadow.setX(680);
        homeshadow.setY(0);
        homeshadow.setWidth(100.0f);
        homeshadow.setHeight(80.0f);
        homeshadow.setFill(Color.web("#d8e1cf"));

        //Logo 
        Text logo1 = new Text("Pi");
        Text logo2 = new Text("Button");
        logo1.setLayoutX(10);
        logo1.setLayoutY(60);
        logo2.setLayoutX(50);
        logo2.setLayoutY(60);
        logo1.setFill(Color.web("#d8e1cf"));
        logo1.setStroke(Color.BLACK);

        // logo1.setFont(Font.font("Verdana", 30));
        logo1.setId("fancytext");
        logo2.setId("fancytext");

        //image Logo
        Image logoimage = new Image(inputstream);
        ImageView imageview = new ImageView(logoimage);
        imageview.setLayoutX(200);
        imageview.setLayoutY(0);
        imageview.setFitHeight(80);
        imageview.setFitWidth(80);

        //Line
        Line logoline = new Line();
        Line logoline1 = new Line();
        //Setting the Properties of the Line 
        logoline.setStartX(300.0f);
        logoline.setStartY(5.0f);
        logoline.setEndX(300.0f);
        logoline.setEndY(75.0f);
        logoline.setStroke(Color.BLACK);
        logoline.setStrokeWidth(2);
        //Setting the Properties of the Line
        logoline1.setStartX(305.0f);
        logoline1.setStartY(5.0f);
        logoline1.setEndX(305.0f);
        logoline1.setEndY(75.0f);
        logoline1.setStroke(Color.BLACK);
        logoline1.setStrokeWidth(2);

        //nav bar
        Text home = new Text("Home");
        Text contactus = new Text("About");
        Text edit = new Text("Edit Profile");
        Image logoutimage = new Image(logoutstream);
        Image homeimage = new Image(homestream);
        Image aboutimage = new Image(aboutstream);
        Image editimage = new Image(profilestream);
        ImageView logoutview = new ImageView(logoutimage);
        ImageView homeview = new ImageView(homeimage);
        ImageView aboutview = new ImageView(aboutimage);
        ImageView profileview = new ImageView(editimage);
        //Setting the Properties of the Texts
        home.setLayoutX(700);
        home.setLayoutY(60);
        contactus.setLayoutX(800);
        contactus.setLayoutY(60);
        edit.setLayoutX(900);
        edit.setLayoutY(60);
        //icons
        logoutview.setLayoutX(1250);
        logoutview.setLayoutY(10);
        homeview.setLayoutX(660);
        homeview.setLayoutY(25);
        aboutview.setLayoutX(760);
        aboutview.setLayoutY(25);
        profileview.setLayoutX(860);
        profileview.setLayoutY(25);

        //text Design
        home.setId("menu");
        contactus.setId("menu");
        edit.setId("menu");
        logoutview.setFitHeight(60);
        logoutview.setFitWidth(60);
        homeview.setFitHeight(50);
        homeview.setFitWidth(50);
        aboutview.setFitHeight(50);
        aboutview.setFitWidth(50);
        profileview.setFitHeight(50);
        profileview.setFitWidth(50);

        //Actions
        home.setCursor(Cursor.CLOSED_HAND);
        contactus.setCursor(Cursor.CLOSED_HAND);
        edit.setCursor(Cursor.CLOSED_HAND);
        logoutview.setCursor(Cursor.CLOSED_HAND);
        homeshadow.setVisible(false);
        root.getChildren().addAll(rectangle, homeshadow, logo1, logo2, imageview, logoline, logoline1, logoutview, aboutview, profileview, homeview);

        home.setOnMouseEntered(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                homeshadow.setX(680);
                homeshadow.setY(0);
                homeshadow.setVisible(true);

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
        home.setOnMouseExited(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                homeshadow.setVisible(false);

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        contactus.setOnMouseEntered(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {

                homeshadow.setX(780);
                homeshadow.setY(0);

                homeshadow.setVisible(true);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
        contactus.setOnMouseExited(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {

                homeshadow.setVisible(false);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        edit.setOnMouseEntered(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {

                homeshadow.setX(880);
                homeshadow.setY(0);
                homeshadow.setWidth(150);
                homeshadow.setVisible(true);

                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
        edit.setOnMouseExited(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {

                homeshadow.setVisible(false);
                homeshadow.setWidth(100);

                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        //////////////////////profile screen///////////////////////////////////////   
        VBox profilebar = new VBox();
        profilebar.setLayoutX(0);
        profilebar.setLayoutY(80);
        profilebar.setId("profilebar");
        profilebar.setPrefSize(305, 700);
        //profile avatar 
        Image profileimage = new Image(profilepic);
        ImageView profilepicview = new ImageView(profileimage);
        profilepicview.setX(80);
        profilepicview.setY(90);
        profilepicview.setId("profilepic");
        //user data
        Label username = new Label("Company Name");
        Label email = new Label("Company Email");
        Label phone = new Label("Company number phone");
        Label Description = new Label("Company Description");
        //user data icons
        Image emailimage = new Image(emailpic);
        Image phoneimage = new Image(phonepic);
        Image detailsimage = new Image(detailspic);
        ImageView emailview = new ImageView(emailimage);
        ImageView phoneview = new ImageView(phoneimage);
        ImageView detailsview = new ImageView(detailsimage);

        //icons design
        emailview.setLayoutX(10);
        emailview.setLayoutY(280);
        phoneview.setLayoutX(10);
        phoneview.setLayoutY(310);
        detailsview.setLayoutX(10);
        detailsview.setLayoutY(340);

        emailview.setFitHeight(20);
        emailview.setFitWidth(30);
        phoneview.setFitHeight(20);
        phoneview.setFitWidth(30);
        detailsview.setFitHeight(20);
        detailsview.setFitWidth(30);
        //user data designs
        username.setLayoutX(85);
        username.setLayoutY(230);
        email.setLayoutX(50);
        email.setLayoutY(280);
        phone.setLayoutX(50);
        phone.setLayoutY(310);
        Description.setLayoutX(50);
        Description.setLayoutY(340);
        //username.getText();
        username.setId("username");
        email.setId("username");
        phone.setId("username");
        Description.setId("username");

        root.getChildren().addAll(profilebar, profilepicview, username, email, phone, Description, emailview, phoneview, detailsview);
        /////////////////////////////Videos Screen///////////////////////////////////
        Image screenimage = new Image(screen);
        ImageView screenview = new ImageView(screenimage);

        screenview.setLayoutX(25);
        screenview.setLayoutY(90);
        screenview.setFitHeight(750);
        screenview.setFitWidth(1300);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Customer Profile");
        scene.getStylesheets().add(getClass().getResource("navbar.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
