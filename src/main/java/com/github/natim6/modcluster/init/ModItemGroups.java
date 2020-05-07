package com.github.natim6.modcluster.init;

import java.util.function.Supplier;

import com.github.natim6.modcluster.Main;
import com.github.natim6.modcluster.RegistryHandler;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {
	
	public static class ModItemGroup extends ItemGroup {

		private final Supplier<ItemStack> iconSupplier;

		public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
			super(name);
			this.iconSupplier = iconSupplier;
		}

		@Override
		public ItemStack createIcon() {
			return iconSupplier.get();
		}

	}
	
	public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(Main.MODID, () -> new ItemStack(RegistryHandler.EXAMPLE_ITEM.get()));

}