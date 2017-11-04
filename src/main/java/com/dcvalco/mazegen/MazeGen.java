package com.dcvalco.mazegen;

import com.dcvalco.mazegen.init.InitBlocks;
import com.dcvalco.mazegen.utility.*;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class MazeGen {

	 @EventHandler
	    public void preinit(FMLPreInitializationEvent event)
	    {
	        // some example code
	      InitBlocks.init();
	    }
	
	 @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
	        // some example code
	        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
	    }

	 @EventHandler
	    public void postinit(FMLPostInitializationEvent event)
	    {
	        // some example code
	        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
	    }
	
}
