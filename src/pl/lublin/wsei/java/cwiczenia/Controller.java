package pl.lublin.wsei.java.cwiczenia;

import javafx.event.ActionEvent;
import javafx.application.HostServices;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    FileChooser fileChooser = new FileChooser();


    public void btnOpenFileAction(ActionEvent actionEvent) throws FileNotFoundException {
        ArrayList<Noblista> noblista;
        noblista = new ArrayList<>();
        File plik = new File("nobel_prize_by_winner.csv");
        Scanner sc = new Scanner(plik);
        String linia = sc.nextLine();
        try{
            linia = new String(Files.readAllBytes(Paths.get("nobel_prize_by_winner_csv")));
        }
        catch(IOException e){
            System.out.println("Błąd wczytywania pliku => "+ e.getLocalizedMessage());
            e.printStackTrace();
            linia = "";
        }
        String[] items = linia.split(",");
        for(int i =1; i < items.length; i++){
            noblista.add(new Noblista());
        }
    }
}
