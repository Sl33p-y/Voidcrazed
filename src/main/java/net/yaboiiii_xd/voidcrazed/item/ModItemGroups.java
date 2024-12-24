package net.yaboiiii_xd.voidcrazed.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.yaboiiii_xd.voidcrazed.Voidcrazed;
import net.yaboiiii_xd.voidcrazed.block.ModBlocks;

public class ModItemGroups {


    public static final ItemGroup VOIDCRAZED_ITEM_GROUP = Registry.register
            (Registries.ITEM_GROUP, Identifier.of(Voidcrazed.MOD_ID, "voidcrazed_items"),
                    FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DARKSTEEL_INGOT))
                            .displayName(Text.translatable("itemgroup.voidcrazed.voidcrazed_items"))
                            .entries((displayContext, entries) -> {
                                entries.add(ModItems.DARKSTEEL_INGOT);
                                entries.add(ModItems.RAW_DARKSTEEL_ORE);
                                entries.add(ModBlocks.DARKSTEEL_BLOCK);
                                entries.add(ModBlocks.RAW_DARKSTEEL_ORE_BLOCK);
                                entries.add(ModBlocks.DARKSTEEL_ORE);
                                entries.add(ModBlocks.VOIDSTONE);
                            })

                            .build());

    public static void registerItemGroups() {
        Voidcrazed.LOGGER.info("Registering Item Groups for" + Voidcrazed.MOD_ID);
    }
}
