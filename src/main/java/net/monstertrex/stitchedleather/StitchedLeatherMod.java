package net.monstertrex.stitchedleather;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StitchedLeatherMod implements ModInitializer {
	public static final String MOD_ID = "stitchedleather";
    public static final Logger LOGGER = LoggerFactory.getLogger("stitchedleather");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}