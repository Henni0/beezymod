package beezymod.com.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public final class ModToolMaterials {
	public static final ToolMaterial OBSIDIAN = new ToolMaterial(
			BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
			2500,
			9.0F,
			4.0F,
			12,
			ModItemTags.OBSIDIAN_TOOL_MATERIALS
	);

	private ModToolMaterials() {}
}
