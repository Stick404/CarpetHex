package net.stickia.carpethex.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.stickia.carpethex.CarpetHexClient;

/**
 * Fabric client loading entrypoint.
 */
public class CarpetHexClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CarpetHexClient.init();
    }
}
