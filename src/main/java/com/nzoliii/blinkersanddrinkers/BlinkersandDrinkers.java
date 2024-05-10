package com.nzoliii.blinkersanddrinkers;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import com.nzoliii.blinkersanddrinkers.world.MWG_Crackhouse1WorldGen;
import com.nzoliii.blinkersanddrinkers.world.MWG_Crackshack1WorldGen;
import net.minecraftforge.fml.common.registry.GameRegistry;

// TODO:        Fix crackshack1's brewing stand spawn, at least it generates now.
//              Need to offset crackhouse1 to fit in one chunk.

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
        GameRegistry.registerWorldGenerator(new MWG_Crackhouse1WorldGen(), 0);
        GameRegistry.registerWorldGenerator(new MWG_Crackshack1WorldGen(), 0);
        System.out.println("Blinkers and Drinkers loaded?");

    }
}
