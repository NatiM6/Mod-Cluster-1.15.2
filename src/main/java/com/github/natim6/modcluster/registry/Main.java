package com.github.natim6.modcluster.registry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;

@Mod("modcluster")
@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class Main {
	public static final String MODID = "modcluster";
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public Main() {
		LOGGER.debug("ModCluster startup ready!");
		new RegistryHandler();
	}
}
