package com.smithy.darcevo.items;

import com.smithy.darcevo.DarcEvolution;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SapphireItems {

    // helper method to more easily create and register items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DarcEvolution.MOD_ID, name), item);
    };

    

    public static void registerSapphireItems() {
        DarcEvolution.LOGGER.info("Sapphire items loaded.");
    }
}
