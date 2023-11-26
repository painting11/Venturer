package net.venturer.cyber2000.core.registry.object;

import net.venturer.cyber2000.core.util.creative.CreativeTabAdder;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.venturer.cyber2000.core.util.creative.CreativeTabBuilder;

import java.util.List;

public class VenturerCreativeTabs {
    public static void register(BuildCreativeModeTabContentsEvent event) {
        CreativeTabAdder tabAdder = new CreativeTabAdder(event);
        new CreativeTabBuilder(tabAdder)
                .processIngredients(VenturerItems.FROZEN_NAUTILUS_SHELL, VenturerItems.FROZEN_COD, VenturerItems.FROZEN_EMERALD, VenturerItems.FROZEN_TRIDENT,
                        VenturerItems.FROZEN_SALMON, VenturerItems.FROZEN_PUFFERFISH, VenturerItems.FROZEN_IRON_HORSE_ARMOR,
                        VenturerItems.NETTLE_LEAVES, VenturerItems.CHILL_ARMOR_TRIM_SMITHING_TEMPLATE)
                .processTools(VenturerItems.MUSIC_DISC_THAW)
                .processFood(VenturerItems.NETTLE_SOUP)
                .processNaturalBlocks(VenturerBlocks.STINGING_NETTLE, VenturerBlocks.BAG_OF_NETTLE_LEAVES);
    }
}
