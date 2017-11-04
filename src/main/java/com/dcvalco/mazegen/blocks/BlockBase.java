package com.dcvalco.mazegen.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBase extends Block {
	
	private String Name;
	
	
	
	public BlockBase(Material materialIn, String name) {
		super(materialIn);
	Name=name;
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(CreativeTabs.REDSTONE);
	}

}
