package net.venturer.temporal.core.util.properties;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.ComposterBlock;
import net.venturer.temporal.core.registry.object.VenturerBlocks;
import net.venturer.temporal.core.registry.object.VenturerItems;

public class CustomItemProperties {
    public static void addCustomItemProperties() {
        putCompostable(VenturerBlocks.STINGING_NETTLE.get().asItem(), 0.65f);
        makeBow(VenturerItems.ANCIENT_BOW.get());
    }

    private static void putCompostable(ItemLike itemLike, float value) {
        ComposterBlock.COMPOSTABLES.put(itemLike, value);
    }

    private static void makeBow(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (itemStack, clientLevel, livingEntity, number) -> {
            if (livingEntity == null) return 0.0F;
            else return livingEntity.getUseItem() != itemStack ? 0.0F : (float) (itemStack.getUseDuration() - livingEntity.getUseItemRemainingTicks()) / 20.0F;
        });

        ItemProperties.register(item, new ResourceLocation("pulling"), (itemStack, clientLevel, livingEntity, number) -> livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F);
    }

    private static void makeCrossbow(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (itemStack, level, entity, seed) -> {
            if (entity == null) return 0.0F;
            else return CrossbowItem.isCharged(itemStack) ? 0.0F : (float)(itemStack.getUseDuration() - entity.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(itemStack);
        });
        ItemProperties.register(item, new ResourceLocation("pulling"), (itemStack, level, entity, seed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == itemStack && !CrossbowItem.isCharged(itemStack) ? 1.0F : 0.0F);
        ItemProperties.register(item, new ResourceLocation("charged"), (itemStack, level, entity, seed) -> entity != null && CrossbowItem.isCharged(itemStack) ? 1.0F : 0.0F);
        ItemProperties.register(item, new ResourceLocation("firework"), (itemStack, level, entity, seed) -> entity != null && CrossbowItem.isCharged(itemStack) && CrossbowItem.containsChargedProjectile(itemStack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);
    }

    private static void makeShield(Item item) {
        ItemProperties.register(item, new ResourceLocation( "blocking"), (itemStack, clientLevel, livingEntity, number) -> livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F);
    }
}
