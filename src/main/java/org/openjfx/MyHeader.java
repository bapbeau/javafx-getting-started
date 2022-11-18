package org.openjfx;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class MyHeader extends VBox{
    public MyHeader(){
        getChildren().add(buildSampleMyHeader());
    }

    public Node buildSampleMyHeader() {
        Label label = new Label("MY_HEADER");
        Font font = Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 25);
        label.setFont(font);
        label.setTextFill(Color.RED);
        return label;
    }
}