package com.github.natim6.modcluster.init;

import com.github.natim6.modcluster.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final BlockBase EXAMPLE_BLOCK = new BlockBase(Block.Properties.create(Material.AIR).doesNotBlockMovement().noDrops());
}
