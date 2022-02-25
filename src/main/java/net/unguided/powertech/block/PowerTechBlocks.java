package net.unguided.powertech.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.unguided.powertech.PowerTech;
import net.unguided.powertech.item.PowerTechGroup;
import org.lwjgl.system.CallbackI;

public class PowerTechBlocks {

    public static final Block MOLYBDENUM_BLOCK = registerBlock("molybdenum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), PowerTechGroup.POWERTECH);
    public static final Block MOLYBDENUM_ORE_BLOCK = registerBlock("molybdenum_ore_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), PowerTechGroup.POWERTECH);
    public static final Block TECHNETIUM_BLOCK = registerBlock("technetium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(8f).requiresTool()), PowerTechGroup.POWERTECH);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(PowerTech.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(PowerTech.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        PowerTech.LOGGER.info("Registering ModBlocks for " + PowerTech.MOD_ID);
    }
}
