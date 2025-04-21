package com.smithy.darcevo.items;

import com.smithy.darcevo.DarcEvolution;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {

    public static final ItemGroup DARC_MAIN = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DarcEvolution.MOD_ID, "darc_main"),
            FabricItemGroup.builder().icon(() -> new ItemStack(TourmalineItems.TOURMALINE))
                    .displayName(Text.translatable("itemgroup.darcevo.darc_main"))
                    .entries((displayContext, entries) -> {
                        entries.add(TourmalineItems.TOURMALINE);
                    }).build());

    public static void registerItemGroups() {

        DarcEvolution.LOGGER.info("Darc Evo item Groups loaded.");
    }
}
