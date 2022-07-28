package rcb.team;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.ReusableFunctions;

public class Validate extends JsonRead {
	private static Logger logger = LogManager.getLogger(ReusableFunctions.class);
	int foreign, wKeep;
	int[] a = new int[2];

	void check() {
		foreign = 0;
		wKeep = 0;
		for (int i = 0; i < plr.length; i++) {
			String data[] = plr[i].split(",");
			if (!data[1].equalsIgnoreCase("india"))
				foreign++;
			if (data[2].contains("Wicket"))
				wKeep++;
		}
	}

	@Test(priority = 0)
	void foreignPlayersCount() {
		check();
		logger.info("Number of foreign players :" + foreign);
		Assert.assertEquals(foreign, 4);

	}

	@Test(priority = 1)
	void wicketKeeperCount() {
		check();
		logger.info("Number of Wicket Keepers :" + wKeep);
		if (wKeep == 0)
			Assert.fail();
	}
}
