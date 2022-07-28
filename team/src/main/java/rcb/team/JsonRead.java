package rcb.team;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeSuite;

import commonFunctions.ReusableFunctions;

public class JsonRead extends ReusableFunctions {
	FileReader read;
	public static String teamName, location;
	public static JSONArray players;

	@BeforeSuite
	public void readfile() throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		try {
			read = new FileReader("./jsonfiles/TeamRCB.json");
		} catch (FileNotFoundException e) {
			read = new FileReader("./team/jsonfiles/TeamRCB.json");
		}
		Object obj = parser.parse(read);
		JSONObject jsonObject = (JSONObject) obj;
		teamName = (String) jsonObject.get("name");
		location = (String) jsonObject.get("location");
		players = (JSONArray) jsonObject.get("player");
		header();
		allPlayers();
	}

}