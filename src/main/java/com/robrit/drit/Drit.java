package com.robrit.drit;

import com.robrit.drit.blocks.BlockRegistry;
import com.robrit.drit.config.ConfigRegistry;
import com.robrit.drit.items.ItemRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod("drit")
public class Drit {
    public static final String MOD_ID = "drit";

    public Drit() {
        ConfigRegistry.init();
        BlockRegistry.init();
        ItemRegistry.init();
    }
}
