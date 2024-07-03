package net.stickia.carpethex;

import net.stickia.carpethex.registry.CarpetHexIotaTypeRegistry;
import net.stickia.carpethex.registry.CarpetHexItemRegistry;
import net.stickia.carpethex.registry.CarpetHexPatternRegistry;
import net.stickia.carpethex.networking.CarpetHexNetworking;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is effectively the loading entrypoint for most of your code, at least
 * if you are using Architectury as intended.
 */
public class CarpetHex {
    public static final String MOD_ID = "carpethex";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


    public static void init() {
        LOGGER.info("Carpet Hex says hello!");

        CarpetHexAbstractions.initPlatformSpecific();
        CarpetHexItemRegistry.init();
        CarpetHexIotaTypeRegistry.init();
        CarpetHexPatternRegistry.init();
		CarpetHexNetworking.init();

        LOGGER.info(CarpetHexAbstractions.getConfigDirectory().toAbsolutePath().normalize().toString());
    }

    /**
     * Shortcut for identifiers specific to this mod.
     */
    public static ResourceLocation id(String string) {
        return new ResourceLocation(MOD_ID, string);
    }
}
