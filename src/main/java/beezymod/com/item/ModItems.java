package beezymod.com.item;

import beezymod.com.Beezymod;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public final class ModItems {
    private static final ResourceKey<CreativeModeTab> INGREDIENTS_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB,
            Identifier.withDefaultNamespace("ingredients"));

    private static final float OBSIDIAN_SWORD_ATTACK_DAMAGE = 3.0F;
    private static final float OBSIDIAN_SWORD_ATTACK_SPEED = -2.4F;
    private static final float OBSIDIAN_PICKAXE_ATTACK_DAMAGE = 1.5F;
    private static final float OBSIDIAN_PICKAXE_ATTACK_SPEED = -2.0F;

    public static final Item EXAMPLE_ITEM = register("example_item", new Item.Properties());
    public static final Item OBSIDIAN_SWORD = register(
            "obsidian_sword",
            new Item.Properties().sword(ModToolMaterials.OBSIDIAN, OBSIDIAN_SWORD_ATTACK_DAMAGE,
                    OBSIDIAN_SWORD_ATTACK_SPEED));
    public static final Item OBSIDIAN_PICKAXE = register(
            "obsidian_pickaxe",
            new Item.Properties().pickaxe(ModToolMaterials.OBSIDIAN, OBSIDIAN_PICKAXE_ATTACK_DAMAGE,
                    OBSIDIAN_PICKAXE_ATTACK_SPEED));

    private static Item register(String name, Item.Properties properties) {
        Identifier id = Identifier.fromNamespaceAndPath(Beezymod.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        return Registry.register(BuiltInRegistries.ITEM, key, new Item(properties.setId(key)));
    }

    private static final ResourceKey<CreativeModeTab> COMBAT_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB,
            Identifier.withDefaultNamespace("combat"));

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(INGREDIENTS_TAB).register(output -> output.accept(EXAMPLE_ITEM));
        CreativeModeTabEvents.modifyOutputEvent(COMBAT_TAB).register(output -> output.accept(OBSIDIAN_SWORD));
    }

    private ModItems() {
    }
}
