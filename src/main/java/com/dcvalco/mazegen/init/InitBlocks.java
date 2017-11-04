package com.dcvalco.mazegen.init;

import com.dcvalco.mazegen.blocks.BlockBase;
import com.dcvalco.mazegen.utility.Reference;

import net.minecraft.block.material.Material;

public class InitBlocks {

	public static BlockBase blockStart;

	
	public static void init(){
		
		blockStart=new BlockBase(Material.ROCK, Reference.START);
		
		
		
	}
	
}
