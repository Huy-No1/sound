package sample;

import java.io.File;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class d extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public static void sound() {
        String path = "E:/GIT/New folder/Sound/openingGame.mp3";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    @Override
    public void start(Stage arg) throws Exception {
        sound();
        System.out.println("D");
    }
}
