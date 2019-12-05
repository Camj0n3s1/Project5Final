import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Creates Scene and pane
		private final Scene scene = null;
		private final GridPane pane = null;
		
		// Slider
		private final Slider slider = new Slider(0, 4, 0);
		private final Slider happinessSlider = new Slider(0,4,0);
		
		// Labels
		private Label comparingLabel = null;
		private final Label sliderValue = new Label();
		private final Label happinessValue = new Label();
		private Label hammingDistLabel = null;
		private Label happinessLabel = null;
		private Label adviceLabel = new Label();
		
		// Buttons
		private Button calcHammingDistButton = null;
		private Button addStationButton = null;
		private Button showStationsButton = new Button();
		private Button showAdviceButton = new Button();
		
		// Distance labels
		private Label distance0 = new Label("Distance 0 ");
		private Label distance1 = new Label("Distance 1 ");
		private Label distance2 = new Label("Distance 2 ");
		private Label distance3 = new Label("Distance 3 ");
		private Label distance4 = new Label("Distance 4 ");
		private Label distance0Label = new Label("");
		private Label distance1Label = new Label("");
		private Label distance2Label = new Label("");
		private Label distance3Label = new Label("");
		private Label distance4Label = new Label("");
		
		// Text Field
		private TextField newStationName = null;

		// Combo Box
		private ComboBox<String> stationNamesComboBox = new ComboBox<String>();

		// List View
		private ListView<String> listView = new ListView<String>();
		
		// Sets the pane characteristics
					pane = new GridPane();
					pane.setPadding(new Insets(10, 10, 10, 10));
					scene = new Scene(pane);
					pane.setVgap(10);
					pane.setHgap(10);
		// Sets characteristics for the slider
					slider.setBlockIncrement(1);
					slider.setMajorTickUnit(1);
					slider.setShowTickLabels(true);
					
		//Sets characteristics for happiness slider
					happinessSlider.setBlockIncrement(1);
					happinessSlider.setMajorTickUnit(1);
					happinessSlider.setShowTickLabels(true);

		// Allows the button to be shown
					showStationsButton.setText("Show Station");

		// Initializes Buttons
					calcHammingDistButton = new Button("Calculate HD");
					addStationButton = new Button("Add Station");
					showAdviceButton = new Button("Show Advice");

					sliderValue.setAlignment(Pos.CENTER_LEFT);
					happinessValue.setAlignment(Pos.CENTER_RIGHT);
					hammingDistLabel = new Label("Enter Hamming Dist: ");
					comparingLabel = new Label("Compare with: ");
					happinessLabel = new Label("Current Happiness Level: ");

					// Initializes text field
					newStationName = new TextField();

					// Allows slider to change values
					slider.valueProperty().addListener(new ChangeListener<Number>() {
						@Override
						public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
							if (newValue == null) {
								sliderValue.setText("");
								return;
							}
							sliderValue.setText(Math.round(newValue.intValue()) + "");
						}
					});
					
					//Allows slider to change values
					happinessSlider.valueProperty().addListener(new ChangeListener<Number>() {
						@Override
						public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
							if (newValue == null) {
								sliderValue.setText("");
								return;
							}
							happinessValue.setText(Math.round(newValue.intValue()) + "");
						}
					});
	}
	
		public static void main(String[] args) {
			launch(args);

	}

}
