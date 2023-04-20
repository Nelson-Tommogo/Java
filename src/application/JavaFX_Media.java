package application;
import java.io.File;  
  
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.media.Media;  
import javafx.scene.media.MediaPlayer;  
import javafx.scene.media.MediaView;  
import javafx.stage.Stage;  
public class JavaFX_Media  extends Application  
{  
  
    public void start (Stage primaryStage) throws Exception {  

        String path = "/home/Downloads/vybzkartel.mp3";  
          

        
        Media media = new Media(new File(path).toURI().toString());  
        

        
        MediaPlayer mediaPlayer = new MediaPlayer(media);  
        

        
        mediaPlayer.setAutoPlay(true);  
        primaryStage.setTitle("Playing Audio");  
        primaryStage.show();  
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
      
} 