package com.github.natim6.modcluster.init;

import com.github.natim6.modcluster.Main;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {
	
	public static class ModItemGroup extends ItemGroup {

		private final ItemStack icon;

		public ModItemGroup(final String name, final ItemStack icon) {
			super(name);
			this.icon = icon;
		}

		@Override
		public ItemStack createIcon() {
			return icon;
		}

	}
	
	public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(Main.MODID, new ItemStack(ModItems.EXAMPLE_ITEM));

}
