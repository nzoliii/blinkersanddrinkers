package com.nzoliii.blinkersanddrinkers;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import com.nzoliii.blinkersanddrinkers.world.ModWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

// TODO: FIX THIS LATER TO ALLOW GENERATING MORE CRACK SHACKS, FOR NOW IT WILL BE GOOD FOR 1.0

@Mod(modid = BlinkersandDrinkers.MODID, name = BlinkersandDrinkers.NAME, version = BlinkersandDrinkers.VERSION)
public class BlinkersandDrinkers
{
    public static final String MODID = "blinkersanddrinkers";
    public static final String NAME = "Blinkers and Drinkers";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {logger = event.getModLog();}

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        GameRegistry.registerWorldGenerator(new ModWorldGenerator(), 0);
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");

    }

}
