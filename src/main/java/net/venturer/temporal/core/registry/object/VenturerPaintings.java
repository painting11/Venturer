package net.venturer.temporal.core.registry.object;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.venturer.temporal.Venturer;
import net.venturer.temporal.core.registry.facade.VenturerPaintingFactoryFacade;

public class VenturerPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(Registries.PAINTING_VARIANT, Venturer.MOD_ID);
    public static final VenturerPaintingFactoryFacade PAINTING_FACTORY = VenturerPaintingFactoryFacade.getInstance();

    public static final RegistryObject<PaintingVariant> EARTH = PAINTING_FACTORY.create32x32("earth_planet");
    public static final RegistryObject<PaintingVariant> TURTLE = PAINTING_FACTORY.create32x16("turtle");
    public static final RegistryObject<PaintingVariant> BLACK_HEART = PAINTING_FACTORY.create16x16("black_heart");
    public static final RegistryObject<PaintingVariant> BLUE_HEART = PAINTING_FACTORY.create16x16("blue_heart");
    public static final RegistryObject<PaintingVariant> BROWN_HEART = PAINTING_FACTORY.create16x16("brown_heart");
    public static final RegistryObject<PaintingVariant> DARK_BLUE_HEART = PAINTING_FACTORY.create16x16("dark_blue_heart");
    public static final RegistryObject<PaintingVariant> GRAY_HEART = PAINTING_FACTORY.create16x16("gray_heart");
    public static final RegistryObject<PaintingVariant> GREEN_HEART = PAINTING_FACTORY.create16x16("green_heart");
    public static final RegistryObject<PaintingVariant> LIME_HEART = PAINTING_FACTORY.create16x16("lime_heart");
    public static final RegistryObject<PaintingVariant> ORANGE_HEART = PAINTING_FACTORY.create16x16("orange_heart");
    public static final RegistryObject<PaintingVariant> PINK_HEART = PAINTING_FACTORY.create16x16("pink_heart");
    public static final RegistryObject<PaintingVariant> PURPLE_HEART = PAINTING_FACTORY.create16x16("purple_heart");
    public static final RegistryObject<PaintingVariant> RED_HEART = PAINTING_FACTORY.create16x16("red_heart");
    public static final RegistryObject<PaintingVariant> WHITE_HEART = PAINTING_FACTORY.create16x16("white_heart");
    public static final RegistryObject<PaintingVariant> YELLOW_HEART = PAINTING_FACTORY.create16x16("yellow_heart");

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
