package net.yaboiiii_xd.voidcrazed.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yaboiiii_xd.voidcrazed.Voidcrazed;

public class ModItems {
    public static final Item RAW_DARKSTEEL_ORE = registerItem("raw_darksteel_ore", new Item(new Item.Settings()));
    public static final Item DARKSTEEL_INGOT = registerItem("darksteel_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
      return Registry.register(Registries.ITEM, Identifier.of(Voidcrazed.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Voidcrazed.LOGGER.info("Registering items for " + Voidcrazed.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RAW_DARKSTEEL_ORE);
            fabricItemGroupEntries.add(DARKSTEEL_INGOT);
        });
    }
}
