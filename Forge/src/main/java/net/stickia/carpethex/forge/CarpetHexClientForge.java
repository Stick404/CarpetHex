package net.stickia.carpethex.forge;

import net.stickia.carpethex.CarpetHexClient;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Forge client loading entrypoint.
 */
public class CarpetHexClientForge {
    public static void init(FMLClientSetupEvent event) {
        CarpetHexClient.init();
    }
}
