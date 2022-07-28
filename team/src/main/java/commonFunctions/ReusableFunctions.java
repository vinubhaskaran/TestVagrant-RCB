package commonFunctions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;

import rcb.team.JsonRead;

public class ReusableFunctions {
	private static Logger logger = LogManager.getLogger(ReusableFunctions.class);
	public static String[] plr;

	public static void header() {
		logger.info("TEAM-----" + JsonRead.teamName);
		logger.info("LOCATION-----" + JsonRead.location);
		logger.info("--------------------------------");
	}

	public static void allPlayers() {

		plr = new String[JsonRead.players.size()];
		for (int i = 0; i < JsonRead.players.size(); i++) {
			JSONObject player = (JSONObject) JsonRead.players.get(i);
			String s1 = (String) player.get("name");
			String s2 = (String) player.get("country");
			String s3 = (String) player.get("role");
			String s4 = (String) player.get("price-in-crores");
			logger.info("Player name :" + s1);
			logger.info("Country :" + s2);
			logger.info("Role :" + s3);
			logger.info("Crores :" + s4);
			logger.info("");

			plr[i] = s1 + "," + s2 + "," + s3 + "," + s4;
		}
	}

}
