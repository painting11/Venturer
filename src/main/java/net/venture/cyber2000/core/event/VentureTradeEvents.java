package net.venture.cyber2000.core.event;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.venture.cyber2000.Venture;
import net.venture.cyber2000.core.registry.object.VentureItems;

@Mod.EventBusSubscriber(modid = Venture.MOD_ID)
public class VentureTradeEvents {
    @SubscribeEvent
    public static void addCustomWandererTrade(WandererTradesEvent event) {
        customizeDefaultWandererTrade(event, 25, VentureItems.ANCIENT_BOW.get(), 1, 2, 13, 0.5f);
    }

    private static void customizeDefaultWandererTrade(WandererTradesEvent event, int emeraldCount, Item item, int itemCount, int maxUses, int XP, float priceMultiplier) {
        event.getRareTrades().add(((trader, random) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, emeraldCount),
                new ItemStack(item, itemCount), maxUses, XP, priceMultiplier
        )));
    }
}
