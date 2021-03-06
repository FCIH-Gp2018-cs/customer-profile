/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import com.sun.javafx.charts.ChartLayoutAnimator;
import java.awt.image.BufferedImage;
import java.io.File;
import javafx.geometry.Insets;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import org.omg.CosNaming.NamingContextPackage.NotFound;

/**
 *
 * @author MYousry
 */
public class Customer extends Application {

    public Pane root = new Pane();
    public Rectangle homeshadow = new Rectangle();
    public Text viewresults;
    public Rectangle videoshadow;
    public Image seeresult;
    public ImageView play;
    public ImageView videoview;
    public Circle avatarshadow;
    public static ImageView profilepicview;
    public Label changeprofile;
    public Image profileimage;
    public Circle profile;
    public static BufferedImage bufferedImage;
    public static Image image;
    public Label username, email, phone, description;
    public TextField usernametext, emailtext, phonetext;
    public TextArea descrip;
    public Button editdata, savedata;

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
        FileInputStream pepsi = new FileInputStream("F:\\gp\\customer\\src\\img\\pepsi.jpg");
        FileInputStream playimage = new FileInputStream("F:\\gp\\customer\\src\\img\\play.png");
        FileInputStream editdatapic = new FileInputStream("F:\\gp\\customer\\src\\img\\edit.png");

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
        root.getChildren().addAll(rectangle, homeshadow, logo1, logo2, imageview, logoline, logoline1, logoutview, home, contactus, edit);

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

        profileimage = new Image(profilepic);
        profilepicview = new ImageView(profileimage);
        profilepicview.setX(80);
        profilepicview.setY(90);
        profilepicview.setFitHeight(150);
        profilepicview.setFitWidth(150);
        profilepicview.setId("profilepic");
        //user data
        username = new Label("Company Name");
        email = new Label("Company Email");
        phone = new Label("Company number phone");
        description = new Label("Company Description");
        //user data icons
        Image emailimage = new Image(emailpic);
        Image phoneimage = new Image(phonepic);
        Image detailsimage = new Image(detailspic);
        ImageView emailview = new ImageView(emailimage);
        ImageView phoneview = new ImageView(phoneimage);
        ImageView detailsview = new ImageView(detailsimage);

        //icons design
        emailview.setLayoutX(10);
        emailview.setLayoutY(400);
        phoneview.setLayoutX(10);
        phoneview.setLayoutY(430);
        detailsview.setLayoutX(10);
        detailsview.setLayoutY(460);

        emailview.setFitHeight(20);
        emailview.setFitWidth(30);
        phoneview.setFitHeight(20);
        phoneview.setFitWidth(30);
        detailsview.setFitHeight(20);
        detailsview.setFitWidth(30);
        //user data designs
        username.setLayoutX(90);
        username.setLayoutY(280);
        email.setLayoutX(50);
        email.setLayoutY(400);
        phone.setLayoutX(50);
        phone.setLayoutY(430);
        description.setLayoutX(50);
        description.setLayoutY(460);
        //username.getText();
        username.setId("username");
        email.setId("username");
        phone.setId("username");
        description.setId("username");

// Edit Profile
        profile = new Circle(150, 180, 80);
        profile.setStroke(Color.SEAGREEN);
        profile.setFill(Color.SNOW);
        profile.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
        //profile pic
        profile.setFill(new ImagePattern(profileimage));
        //
        profile.setCursor(Cursor.CLOSED_HAND);

        //change profile pic action
        changeprofile = new Label("Change");
        changeprofile.setId("username");
        changeprofile.setLayoutX(120);
        changeprofile.setLayoutY(225);
        changeprofile.setVisible(false);
        //edit data icon
        Image editdataicon = new Image(editdatapic);
        ImageView editdataview = new ImageView(editdataicon);
        editdataview.setLayoutX(50);
        editdataview.setLayoutY(600);
        editdataview.setFitHeight(50);
        editdataview.setFitWidth(70);
        //edit button
        editdata = new Button("Edit");
        editdata.setLayoutX(100);
        editdata.setLayoutY(600);
        editdata.setPrefSize(100, 50);
        editdata.setId("editdata");
        editdata.setCursor(Cursor.CLOSED_HAND);
        //save button
        savedata = new Button("Save");
        savedata.setLayoutX(100);
        savedata.setLayoutY(600);
        savedata.setPrefSize(100, 50);
        savedata.setId("editdata");
        savedata.setCursor(Cursor.CLOSED_HAND);
        savedata.setVisible(false);
        //edit texts
        usernametext = new TextField(username.getText());
        emailtext = new TextField(email.getText());
        phonetext = new TextField(phone.getText());
        descrip = new TextArea(description.getText());
        usernametext.setVisible(false);
        emailtext.setVisible(false);
        phonetext.setVisible(false);
        descrip.setVisible(false);

//edit profile actions
        profile.setOnMouseEntered(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                profile.setOpacity(0.5);
                changeprofile.setVisible(true);
            }

        });
        profile.setOnMouseExited(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                profile.setOpacity(1);
                changeprofile.setVisible(false);
            }

        });
        //change profile pic
        profile.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                FileChooser fileChooser = new FileChooser();

                //Set extension filter
                FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
                FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
                fileChooser.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);
                //Show open file dialog
                File file = fileChooser.showOpenDialog(null);
                try {
                    BufferedImage bufferedImage = ImageIO.read(file);
                    image = SwingFXUtils.toFXImage(bufferedImage, null);
//                    profilepicview.setImage(image);
                    profile.setFill(new ImagePattern(image));
                } catch (IOException ex) {
                    ex.getMessage();
                }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

//edit data action(username-email-description)
        editdata.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                //visability
                username.setVisible(false);
                email.setVisible(false);
                description.setVisible(false);
                phone.setVisible(false);
                editdata.setVisible(false);
                usernametext.setVisible(true);
                emailtext.setVisible(true);
                phonetext.setVisible(true);
                descrip.setVisible(true);
                savedata.setVisible(true);
                //set texts
                usernametext.setText(username.getText());
                emailtext.setText(email.getText());
                phonetext.setText(phone.getText());
                descrip.setText(description.getText());
                //designs
                usernametext.setLayoutX(90);
                usernametext.setLayoutY(280);
                emailtext.setLayoutX(50);
                emailtext.setLayoutY(400);
                phonetext.setLayoutX(50);
                phonetext.setLayoutY(430);
                descrip.setLayoutX(50);
                descrip.setLayoutY(460);
                descrip.setPrefSize(250, 100);
                descrip.setWrapText(true);
                savedata.setVisible(true);
                
                // root.getChildren().addAll(usernametext, emailtext, phonetext, descrip);

                

                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
//save data button
        savedata.setOnAction(new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent t) {
                        username.setText(usernametext.getText());
                        email.setText(emailtext.getText());
                        phone.setText(phonetext.getText());
                        description.setText(descrip.getText());
                        username.setVisible(true);
                        email.setVisible(true);
                        description.setVisible(true);
                        phone.setVisible(true);
                        editdata.setVisible(true);
                        usernametext.setVisible(false);
                        emailtext.setVisible(false);
                        phonetext.setVisible(false);
                        descrip.setVisible(false);
                        savedata.setVisible(false);

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                });
        
        
        
        
        
        
        root.getChildren().addAll(profilebar, username, email, phone, description, emailview, phoneview, detailsview, profile, changeprofile, editdata, usernametext, emailtext, phonetext, descrip,savedata);
//        root.getChildren().addAll(avatarshadow);
/////////////////////////////Videos Screen///////////////////////////////////
        HBox videopane = new HBox();
        videopane.setLayoutX(310);
        videopane.setLayoutY(80);
        videopane.setPrefSize(1050, 700);
        videopane.setId("videopane");
        videopane.setSpacing(5);
        //video shadow
//        videoshadow = new Rectangle(300, 75);
//        videoshadow.setLayoutX(335);
//        videoshadow.setLayoutY(230);
//        videoshadow.setFill(Color.web("#b5b4bb"));
//        videoshadow.setOpacity(0.2);
//        videoshadow.setVisible(false);
        seeresult = new Image(playimage);
        play = new ImageView(seeresult);
        play.setLayoutX(335);
        play.setLayoutY(270);
        play.setFitHeight(30);
        play.setFitWidth(30);
        play.setCursor(Cursor.CLOSED_HAND);
        //pepsi image
        Image videoimage = new Image(pepsi);
        videoview = new ImageView(videoimage);
        videoview.setLayoutX(335);
        videoview.setLayoutY(105);
        videoview.setFitHeight(200);
        videoview.setFitWidth(300);
        videoview.setCursor(Cursor.CLOSED_HAND);
        //videos    
        Rectangle video1 = new Rectangle();
        Rectangle video2 = new Rectangle();
        Rectangle video3 = new Rectangle();
        viewresults = new Text("Show Result");
        viewresults.setVisible(false);
        viewresults.setLayoutX(405);
        viewresults.setLayoutY(210);
        viewresults.setId("viewresult");

        video1.setWidth(310.0f);
        video1.setHeight(210.0f);
        video1.setFill(Color.web("#ffffff"));
        video1.setStroke(Color.BLACK);
        video1.setStrokeWidth(5);

        video2.setWidth(300.0f);
        video2.setHeight(200.0f);
        video2.setFill(Color.web("#f2ca8c"));
        video2.setStrokeWidth(5);
        video2.setStroke(Color.BLACK);

        video3.setWidth(300.0f);
        video3.setHeight(200.0f);
        video3.setFill(Color.web("#ceeff2"));
        video3.setStroke(Color.BLACK);
        video3.setStrokeWidth(5);
// Actions

        videoview.setOnMouseEntered(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                viewresults.setVisible(true);
                videoview.setOpacity(0.3);
                //  seeresultview.setVisible(true);

                // videoshadow.setVisible(true);
                //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
        videoview.setOnMouseExited(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                videoview.setOpacity(1);
                viewresults.setVisible(false);
                //  seeresultview.setVisible(false);
                //  videoshadow.setVisible(false);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
        //show result action
        videoview.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                System.out.println("SHOW RESULTS");
//   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
        //paly video action
        play.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                System.out.println("paly video");
            }

        });
//end of actions

        video1.setId("videostyle");
        video2.setId("videostyle");
        video3.setId("videostyle");
        videopane.setMargin(video1, new Insets(20, 20, 20, 20));
        videopane.setMargin(video2, new Insets(20, 20, 20, 20));
        videopane.setMargin(video3, new Insets(20, 20, 20, 20));
        videopane.getChildren().addAll(video1);
        root.getChildren().addAll(videopane, videoview, viewresults, play);
        /////////////////////////////////////////////////////////
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
