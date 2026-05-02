package beezymod.com.item;

import beezymod.com.Beezymod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class ModItemTags {
	public static final TagKey<Item> OBSIDIAN_TOOL_MATERIALS = of("obsidian_tool_materials");

	private static TagKey<Item> of(String path) {
		return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Beezymod.MOD_ID, path));
	}

	private ModItemTags() {}
}
