package net.yaboiiii_xd.voidcrazed;

import net.fabricmc.api.ModInitializer;

import net.yaboiiii_xd.voidcrazed.block.ModBlocks;
import net.yaboiiii_xd.voidcrazed.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Voidcrazed implements ModInitializer {
	public static final String MOD_ID = "voidcrazed";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}