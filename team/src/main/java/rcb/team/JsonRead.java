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
		System.out.println("TEAM-----" + teamName);
		System.out.println("LOCATION-----" + location);
		System.out.println("--------------------------------");

		JSONArray players = (JSONArray) jsonObject.get("player");
		plr = new String[players.size()];

		for (int i = 0; i < players.size(); i++) {
			JSONObject player = (JSONObject) players.get(i);
			String s1 = (String) player.get("name");
			String s2 = (String) player.get("country");
			String s3 = (String) player.get("role");
			String s4 = (String) player.get("price-in-crores");
			System.out.println("Player name :" + s1);
			System.out.println("Country :" + s2);
			System.out.println("Role :" + s3);
			System.out.println("Crores :" + s4);
			System.out.println();

			plr[i] = s1 + "," + s2 + "," + s3 + "," + s4;
		}
	}
}
