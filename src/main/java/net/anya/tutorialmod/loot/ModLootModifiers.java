package net.anya.tutorialmod.loot;

import com.mojang.serialization.Codec;
import net.anya.tutorialmod.TutorialMod;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS = DeferredRegister.
            create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, TutorialMod.MOD_ID);

    public static void register(IEventBus eventbus) {
        LOOT_MODIFIER_SERIALIZERS.register(eventbus);
    }
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM = LOOT_MODIFIER_SERIALIZERS.
            register("add_item", AddItemModifier.CODEC);
}
