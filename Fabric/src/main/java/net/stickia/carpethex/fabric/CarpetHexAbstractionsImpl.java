package net.stickia.carpethex.fabric;

import net.fabricmc.loader.api.FabricLoader;
import net.stickia.carpethex.CarpetHexAbstractions;

import java.nio.file.Path;

public class CarpetHexAbstractionsImpl {
    /**
     * This is the actual implementation of {@link CarpetHexAbstractions#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
	
    public static void initPlatformSpecific() {
        CarpetHexConfigFabric.init();
    }
}
