package samebutdifferent.ecologics.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.EntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import samebutdifferent.ecologics.Ecologics;
import samebutdifferent.ecologics.entity.*;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Ecologics.MOD_ID, Registry.ENTITY_TYPE_KEY);

    public static final RegistrySupplier<EntityType<CoconutCrab>> COCONUT_CRAB = ENTITY_TYPES.register("coconut_crab", () -> EntityType.Builder.create(CoconutCrab::new, MobCategory.CREATURE).sized(1.0F, 1.0F).clientTrackingRange(10).build(new Identifier(Ecologics.MOD_ID, "coconut_crab").toString()));
    public static final RegistrySupplier<EntityType<Camel>> CAMEL = ENTITY_TYPES.register("camel", () -> EntityType.Builder.create(Camel::new, MobCategory.CREATURE).sized(1.6F, 2.1F).clientTrackingRange(10).build(new Identifier(Ecologics.MOD_ID, "camel").toString()));
    public static final RegistrySupplier<EntityType<ModBoat>> BOAT = ENTITY_TYPES.register("boat", () -> EntityType.Builder.<ModBoat>create(ModBoat::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build(new Identifier(Ecologics.MOD_ID, "boat").toString()));
    public static final RegistrySupplier<EntityType<Penguin>> PENGUIN = ENTITY_TYPES.register("penguin", () -> EntityType.Builder.create(Penguin::new, MobCategory.CREATURE).sized(0.7F, 0.9F).clientTrackingRange(10).build(new Identifier(Ecologics.MOD_ID, "penguin").toString()));
    public static final RegistrySupplier<EntityType<Squirrel>> SQUIRREL = ENTITY_TYPES.register("squirrel", () -> EntityType.Builder.create(Squirrel::new, MobCategory.CREATURE).sized(0.6F, 0.8F).clientTrackingRange(8).build(new Identifier(Ecologics.MOD_ID, "squirrel").toString()));
}
