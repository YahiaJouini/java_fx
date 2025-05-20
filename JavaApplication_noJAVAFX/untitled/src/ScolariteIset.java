import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ScolariteIset extends Application implements EventHandler<ActionEvent> {
    private RadioButton rdL1, rdL2, rdL3;
    private ComboBox<String> departementCombo, optionCombo;
    private TextField nomField;
    private Button ouvrirBtn, annulerBtn;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        AnchorPane lePanneau = new AnchorPane();

        Label titre = new Label("ouvrir groupe");
        lePanneau.getChildren().add(titre);
        AnchorPane.setTopAnchor(titre,30.);
        AnchorPane.setLeftAnchor(titre,70.);

        Font ft = new Font(36);
        Font fet= new Font(14);
        titre.setFont(ft);
        Scene sc = new Scene(lePanneau);
        primaryStage.setScene(sc);
        primaryStage.setTitle("Nouveau groupe.");
        primaryStage.setHeight(400);
        primaryStage.setWidth(350);

        ToggleGroup niveau = new ToggleGroup();

        rdL1 = new RadioButton("L1");
        rdL1.setFont(new Font(14));
        rdL1.setSelected(true);
        rdL1.setToggleGroup(niveau);
        AnchorPane.setTopAnchor(rdL1, 100.0);
        AnchorPane.setLeftAnchor(rdL1, 80.0);

        rdL2 = new RadioButton("L2");
        rdL2.setFont(new Font(14));
        rdL2.setToggleGroup(niveau);
        AnchorPane.setTopAnchor(rdL2, 100.0);
        AnchorPane.setLeftAnchor(rdL2, 130.0);

        rdL3 = new RadioButton("L3");
        rdL3.setFont(new Font(14));
        rdL3.setToggleGroup(niveau);
        AnchorPane.setTopAnchor(rdL3, 100.0);
        AnchorPane.setLeftAnchor(rdL3, 180.0);

        lePanneau.getChildren().add(rdL1);
        lePanneau.getChildren().add(rdL2);
        lePanneau.getChildren().add(rdL3);

        Label niveauLabel = new Label("niveau :");

        lePanneau.getChildren().add(niveauLabel);
        AnchorPane.setTopAnchor(niveauLabel,100.);
        AnchorPane.setLeftAnchor(niveauLabel,32.);

        departementCombo = new ComboBox<>();
        departementCombo.getItems().addAll("TI", "SESG", "GM", "GE", "GC");
        departementCombo.setValue("TI");
        AnchorPane.setTopAnchor(departementCombo, 150.0);
        AnchorPane.setLeftAnchor(departementCombo, 120.0);

        Label departementLabel = new Label("Departement :");
        departementCombo.setMinWidth(180);

        lePanneau.getChildren().add(departementLabel);
        AnchorPane.setTopAnchor(departementLabel,155.);
        AnchorPane.setLeftAnchor(departementLabel,32.);

        lePanneau.getChildren().add(departementCombo);

        optionCombo = new ComboBox<>();
        optionCombo.setItems(FXCollections.observableArrayList("TC", "DSI", "RSI", "SEM"));
        optionCombo.setValue("TC");

        Label lblOption = new Label("option :");
        AnchorPane.setTopAnchor(lblOption, 205.);
        AnchorPane.setLeftAnchor(lblOption, 30.0);

        AnchorPane.setTopAnchor(optionCombo, 200.);
        AnchorPane.setLeftAnchor(optionCombo, 120.0);

        optionCombo.setMinWidth(180);
        lePanneau.getChildren().add(optionCombo);
        lePanneau.getChildren().add(lblOption);


        // Label: nom
        Label lblNom = new Label("nom :");
        lblNom.setFont(new Font(14));
        AnchorPane.setTopAnchor(lblNom, 250.0);
        AnchorPane.setLeftAnchor(lblNom, 32.0);

        lePanneau.getChildren().add(lblNom);

        nomField = new TextField();
        nomField.setPromptText("1 ou 2 ... ou cs ou cl L3");
        AnchorPane.setTopAnchor(nomField, 250.0);
        AnchorPane.setLeftAnchor(nomField, 120.);
        lePanneau.getChildren().add(nomField);

        nomField.setMinWidth(180);


        ouvrirBtn = new Button("_ouvrir");
        ouvrirBtn.setDefaultButton(true);
        ouvrirBtn.setMnemonicParsing(true);
        AnchorPane.setTopAnchor(ouvrirBtn, 300.0);
        AnchorPane.setLeftAnchor(ouvrirBtn, 110.0);
        lePanneau.getChildren().add(ouvrirBtn);


        annulerBtn = new Button("an_nuler");
        annulerBtn.setCancelButton(true);
        annulerBtn.setMnemonicParsing(true);
        AnchorPane.setTopAnchor(annulerBtn, 300.0);
        AnchorPane.setLeftAnchor(annulerBtn, 167.0);

        lePanneau.getChildren().add(annulerBtn);

        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Groupe Info");
        alert.setHeaderText("Groupe créé");
        alert.setContentText(leGroupe.toString());
        alert.showAndWait();
    }
}
