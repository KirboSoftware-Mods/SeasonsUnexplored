package com.kirbosoftware.seasons_unexplored;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeasonsUnexplored implements ModInitializer  {
    private static final String MOD_ID = "seasons_unexplored";
    public static final Logger LOGGER = LoggerFactory.getLogger("Seasons Unexplored");

    @Override
    public void onInitialize() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
            if (FabricLoader.getInstance().isModLoaded("seasons")) {
                LOGGER.info("[" + "Seasons Unexplored" + "]" + " successfully loading compatibility between Regions Unexplored & Fabric Seasons");
            }
        });
    }
}
