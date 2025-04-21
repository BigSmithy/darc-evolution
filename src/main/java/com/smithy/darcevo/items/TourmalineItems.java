package com.smithy.darcevo.items;

import com.smithy.darcevo.DarcEvolution;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class TourmalineItems {

    public static final Item TOURMALINE = registerItem("tourmaline", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DarcEvolution.MOD_ID, "tourmaline")))));

    // helper method to more easily create and register items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DarcEvolution.MOD_ID, name), item);
    };

    public static void registerTourmalineItems() {
        DarcEvolution.LOGGER.info("Tourmaline items loaded.");
    }
}
