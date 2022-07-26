package rcb.team;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeSuite;

public class JsonRead {
	static FileReader read;
	static String[] plr;

	@BeforeSuite
	public static void readfile() throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		try {
			read = new FileReader("./jsonfiles/TeamRCB.json");
		} catch (FileNotFoundException e) {
			read = new FileReader("./team/jsonfiles/TeamRCB.json");
		}
		Object obj = parser.parse(read);
		JSONObject jsonObject = (JSONObject) obj;
		String teamName = (String) jsonObject.get("name");
		String location = (String) jsonObject.get("location");
		JSONArray players = (JSONArray) jsonObject.get("player");
		plr = new String[players.size()];

		for (int i = 0; i < players.size(); i++) {
			JSONObject player = (JSONObject) players.get(i);
			String name = (String) player.get("name");
			String country = (String) player.get("country");
			String role = (String) player.get("role");
			String price = (String) player.get("price-in-crores");

			plr[i] = name + "," + country + "," + role + "," + price;
		}
	}
}
