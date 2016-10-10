package controller;

import java.io.File;
import java.io.IOException;


/**
 * @Author Adam Wareing This is the controller that handles logic from when
 *         buttons are clicked
 */
public class Controller {
	/*
		*//**
			 * Called when the NewGame button is selected
			 *
			 * @param event
			 */
	/*
	 * public void setupGame(javafx.event.ActionEvent event) { Node node =
	 * (Node) event.getSource(); Stage stage = (Stage)
	 * node.getScene().getWindow(); Parent root = null; try { root = new
	 * FXMLLoader().load(getClass().getResource("/unused/scenes/new_game.fxml"))
	 * ; } catch (IOException e1) { e1.printStackTrace(); } Scene scene = new
	 * Scene(root); stage.setScene(scene); stage.show(); }
	 *
	 *//**
		 * Called when the LoadGame button is selected
		 *
		 * @param event
		 */
	/*
	 * public void loadGame(javafx.event.ActionEvent event) {
	 *
	 * FileChooser fileChooser = new FileChooser(); // add .txt extension filter
	 * FileChooser.ExtensionFilter extFilter = new
	 * FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
	 * fileChooser.getExtensionFilters().add(extFilter); // Set title and launch
	 * fileChooser.setTitle("Open Resource File"); File gameFile =
	 * fileChooser.showOpenDialog(null); if (gameFile != null) { new
	 * GameLoader(gameFile); } }
	 *
	 *//**
		 * Called when the Settings button is selected
		 *
		 * @param event
		 */
	/*
	 * public void settings(javafx.event.ActionEvent event) { Node node = (Node)
	 * event.getSource(); Stage stage = (Stage) node.getScene().getWindow();
	 * Parent root = null; try { root = new
	 * FXMLLoader().load(getClass().getResource("/unused/scenes/settings.fxml"))
	 * ; } catch (IOException e1) { e1.printStackTrace(); } Scene scene = new
	 * Scene(root); stage.setScene(scene); stage.show(); }
	 *
	 *//**
		 * Called when the BackButton button is selected from the settings view
		 *
		 * @param event
		 *//*
		 * public void backClickedFromSettings(ActionEvent event) { Node node =
		 * (Node) event.getSource(); Stage stage = (Stage)
		 * node.getScene().getWindow(); Parent root = null; try { root = new
		 * FXMLLoader().load(getClass().getResource(
		 * "/unused/scenes/home_screen.fxml")); } catch (IOException e1) {
		 * e1.printStackTrace(); } Scene scene = new Scene(root);
		 * stage.setScene(scene); stage.show(); }
		 *
		 * public void newGame(ActionEvent event) { Node node = (Node)
		 * event.getSource(); Stage stage = (Stage) node.getScene().getWindow();
		 * Parent root = null; try { root = new
		 * FXMLLoader().load(getClass().getResource("/unused/scenes/game.fxml"))
		 * ; } catch (IOException e1) { e1.printStackTrace(); } Scene scene =
		 * new Scene(root); stage.setScene(scene); stage.show(); }
		 *
		 * public static void main(String[] args) { Controller c = new
		 * Controller(); c.generateNewGameObject(); }
		 *
		 * public Game generateNewGameObject(){ // create new game object
		 *
		 * Game game; try { game = new Game(); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 *
		 * // load game map from text file
		 *
		 * // create new gaurd object
		 *
		 * // setup guard for floor 1 //game.setupGuards(1); //set up player on
		 * map //game.setupPlayers();
		 *
		 *
		 * return null;
		 *
		 * }
		 */
}
