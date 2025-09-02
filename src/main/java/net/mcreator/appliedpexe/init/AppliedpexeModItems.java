/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.appliedpexe.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.appliedpexe.item.InfinityPexeCellItem;
import net.mcreator.appliedpexe.AppliedpexeMod;

import java.util.function.Function;

public class AppliedpexeModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AppliedpexeMod.MODID);
	public static final DeferredItem<Item> INFINITY_PEXE_CELL = register("infinity_pexe_cell", InfinityPexeCellItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}