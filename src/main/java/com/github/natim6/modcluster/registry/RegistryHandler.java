package com.github.natim6.modcluster.registry;

import com.github.natim6.modcluster.init.ModItemGroups;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
	private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MODID);
	private static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MODID);

	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
			() -> new Block(Block.Properties.create(Material.GLASS).harvestTool(ToolType.PICKAXE).sound(SoundType.GLASS)
					.lightValue(8).hardnessAndResistance(3F, 3F).slipperiness(0.1F)));

	public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block",
			() -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

}
