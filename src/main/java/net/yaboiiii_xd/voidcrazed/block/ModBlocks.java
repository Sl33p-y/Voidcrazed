package net.yaboiiii_xd.voidcrazed.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.yaboiiii_xd.voidcrazed.Voidcrazed;

public class ModBlocks {

    public static final Block DARKSTEEL_BLOCK = registerBlock("darksteel_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(9.5f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));
    public static final Block RAW_DARKSTEEL_ORE_BLOCK = registerBlock("raw_darksteel_ore_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(6f).requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Voidcrazed.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Voidcrazed.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Voidcrazed.LOGGER.info("Registering Mod Blocks for " + Voidcrazed.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(DARKSTEEL_BLOCK);
            fabricItemGroupEntries.add(RAW_DARKSTEEL_ORE_BLOCK);
        });
    }
}
