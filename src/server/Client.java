package server;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import controller.GameController;
import model.floor.Location;

public class Client {
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String serverIP;
	private Socket connection;
	private PrintStream p;
	private Scanner sc;
	private GameController player = new GameController(false);
	private Scanner getInput = new Scanner(System.in);

	// Constructor
	public Client(String host) {
		serverIP = host;
	}

	// Connect to server
	public void startRunning() {
		try {
			connectionToServer();
			setupStreams();
			update();

		} catch (EOFException e) {
			System.out.println("Client terminated connection");
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			closeCrap();
		}
	}

	// Connecting to Server
	private void connectionToServer() throws IOException {
		System.out.println("Attempting connection...");
		connection = new Socket(InetAddress.getByName(serverIP), 6789);
		System.out.println("Connected to: " + connection.getInetAddress().getHostName());
	}

	// set up the stream to send and receive message!
	private void setupStreams() throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		System.out.println("You are now connected");
	}

	private void update() throws IOException {
		while (true) {
			sendData();
			recieveData();
		}
	}

	private void sendData() throws IOException {
		double[] playerPos = player.getPlayerPosition();
		output.writeDouble(playerPos[0]);
		output.flush();
		output.writeDouble(playerPos[1]);
		output.flush();
		output.writeDouble(playerPos[2]);
		output.flush();
		int timer = player.getPlayer().timer;
		output.writeInt(timer);
		output.flush();
		String room = player.getPlayer().getCurrentPlayer().getLevelName();
		output.writeObject(room);
		output.flush();

		Location loc = player.getPlayer().getCurrentPlayer().getLocation();
		int x = loc.locX(); int y = loc.locY();
		output.writeInt(x);
		output.flush();
		output.writeInt(y);
		output.flush();
	}

	private void recieveData() throws IOException {

		try {
			double guardPosX = (double) input.readDouble();
			double guardPosY = (double) input.readDouble();
			double guardPosZ = (double) input.readDouble();
			double[] newPos = new double[] { guardPosX, guardPosY, 0 };
			player.setGuardPosition(newPos);
			String room = (String) input.readObject();
			player.getPlayer().getOtherPlayer().setRoom(room);
			int x = (int) input.readInt();
			int y = (int) input.readInt();
			player.getPlayer().getOtherPlayer().setLocation(new Location(x,y));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// close streams and sockets after you are done chatting!!
	private void closeCrap() {
		System.out.println("Closing connectin...");
		try {

			output.close();
			input.close();
			connection.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}
