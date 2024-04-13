package com.nzoliii;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "blinkersanddrinkers";
    public static final String NAME = "Blinkers and Drinkers";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");
        System.out.println("[BID] [Main.java] Blinkers and Drinkers loaded?");

    }
}
