package net.hmidox.firstmod.item;

import net.hmidox.firstmod.FirstMod;
import net.hmidox.firstmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> BAALLA = ITEMS.register("baalla",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ABDELHAMID = ITEMS.register("abdelhamid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static void register(IEventBus enventBus) {
        ITEMS.register(enventBus);
    }
}
