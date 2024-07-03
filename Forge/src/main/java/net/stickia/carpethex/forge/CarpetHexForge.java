package net.stickia.carpethex.forge;

import dev.architectury.platform.forge.EventBuses;
import net.stickia.carpethex.CarpetHex;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * This is your loading entrypoint on forge, in case you need to initialize
 * something platform-specific.
 */
@Mod(CarpetHex.MOD_ID)
public class CarpetHexForge {
    public CarpetHexForge() {
        // Submit our event bus to let architectury register our content on the right time
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(CarpetHex.MOD_ID, bus);
        bus.addListener(CarpetHexClientForge::init);
        CarpetHex.init();
    }
}
