package me.hammer86gn.dfhelper;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DFHelper implements ModInitializer {
	private static DFHelper instance;

	private static final String MOD_ID = "dfhelper";
	private static final Logger LOGGER = LoggerFactory.getLogger(DFHelper.MOD_ID);

	@Override
	public void onInitialize() {
		instance = this;

		LOGGER.info("Initializing DFHelper :D");
	}

	public static DFHelper getInstance() {
		return DFHelper.instance;
	}

	public static Logger getModLogger() {
		return DFHelper.LOGGER;
	}

	public static String getModId() {
		return DFHelper.MOD_ID;
	}
}
