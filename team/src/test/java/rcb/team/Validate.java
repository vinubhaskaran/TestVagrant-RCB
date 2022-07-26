package rcb.team;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Validate extends JsonRead {

	@Test
	public static void foreignPlayers() {
		int foreign = 0;
		for (int i = 0; i < plr.length; i++) {
			String data[] = plr[i].split(",");
			if (!data[1].equalsIgnoreCase("india"))
				foreign++;
		}
		System.out.println("Number of foreign players :" + foreign);
		Assert.assertEquals(foreign, 4);

	}

	@Test
	public static void wicketKeeper() {
		int wKeep = 0;
		for (int i = 0; i < plr.length; i++) {
			String data[] = plr[i].split(",");
			if (data[2].contains("Wicket"))
				wKeep++;
		}
		System.out.println("Number of Wicket Keepers :" + wKeep);
		if (wKeep == 0)
			Assert.fail();
	}
}
