package com.robrit.drit.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class ConfigRegistry {
    public static final ForgeConfigSpec CONFIG;
    public static final ForgeConfigSpec.DoubleValue DAMAGE_AMOUNT;

    static {
        final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

        DAMAGE_AMOUNT = BUILDER
                .comment("The multiplier for damage")
                .defineInRange("Damage Amount", 2.0, 1.0, 10.0);

        CONFIG = BUILDER.build();
    }

    public static void init() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CONFIG);
    }
}
