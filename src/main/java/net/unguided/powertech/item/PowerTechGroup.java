package net.unguided.powertech.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.unguided.powertech.PowerTech;

public class PowerTechGroup {
    public static final ItemGroup POWERTECH = FabricItemGroupBuilder.build(new Identifier(PowerTech.MOD_ID, "technetium"),
            () -> new ItemStack(PowerTechItems.TECHNETIUM_INGOT));
}
