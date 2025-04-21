package com.smithy.darcevo;

import com.smithy.darcevo.items.TourmalineItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DarcEvolution implements ModInitializer {
	public static final String MOD_ID = "darcevo";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		TourmalineItems.registerTourmalineItems();

	}
}