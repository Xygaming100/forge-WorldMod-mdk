package net.xygaming.worldmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.xygaming.worldmod.WorldMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WorldMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WORLD_TAB = CREATIVE_MODE_TABS.register("worldmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DREAMDUST.get()))
                    .title(Component.translatable("creativetab.world_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DREAMDUST.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
