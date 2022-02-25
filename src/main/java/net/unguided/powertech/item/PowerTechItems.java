package net.unguided.powertech.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.unguided.powertech.PowerTech;

public class PowerTechItems {

    public static final Item TECHNETIUM_INGOT = registerItem("technetium_ingot",
        new Item(new FabricItemSettings().group(PowerTechGroup.POWERTECH)));

    public static final Item TECHNETIUM_NUGGET = registerItem("technetium_nugget",
            new Item(new FabricItemSettings().group(PowerTechGroup.POWERTECH)));

    public static final Item MOLYBDENUM_INGOT = registerItem("molybdenum_ingot",
            new Item(new FabricItemSettings().group(PowerTechGroup.POWERTECH)));

    public static final Item MOLYBDENUM_NUGGET = registerItem("molybdenum_nugget",
            new Item(new FabricItemSettings().group(PowerTechGroup.POWERTECH)));

    public static final Item RAW_MOLYBDENUM = registerItem("raw_molybdenum",
            new Item(new FabricItemSettings().group(PowerTechGroup.POWERTECH)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(PowerTech.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        PowerTech.LOGGER.info("Registering Mod items for " + PowerTech.MOD_ID);
    }

}
