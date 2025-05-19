package com.nouho.potionstacks;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(PotionStacksMain.MODID)
public class PotionStacksMain
{
    public static final String MODID = "potionstacks";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PotionStacksMain(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Hello from PotionStacks Main!");
    }
}
