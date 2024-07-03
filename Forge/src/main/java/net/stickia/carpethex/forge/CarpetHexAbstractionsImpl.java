package net.stickia.carpethex.forge;

import net.stickia.carpethex.CarpetHexAbstractions;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class CarpetHexAbstractionsImpl {
    /**
     * This is the actual implementation of {@link CarpetHexAbstractions#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
	
    public static void initPlatformSpecific() {
        CarpetHexConfigForge.init();
    }
}
