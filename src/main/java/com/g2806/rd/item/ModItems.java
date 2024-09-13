package com.g2806.rd.item;

import com.g2806.rd.Rduniverse;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RD_COIN = registerItem("rd_coin", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Rduniverse.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        Rduniverse.LOGGER.info("Registering Mod Items For " + Rduniverse.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RD_COIN);
        });
    }
}
