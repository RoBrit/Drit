package com.robrit.drit.blocks;

import com.robrit.drit.config.ConfigRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.ParametersAreNonnullByDefault;

public class DritBlock extends Block {
    private static final float DAMAGE_AMOUNT = ConfigRegistry.DAMAGE_AMOUNT.get().floatValue();
    private static final DamageSource DRIT_DAMAGE = new DamageSource("drit").bypassArmor();

    public DritBlock(Properties properties) {
        super(properties);
    }

    @Override
    @ParametersAreNonnullByDefault
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        if (entity instanceof LivingEntity) {
            entity.hurt(DritBlock.DRIT_DAMAGE, DritBlock.DAMAGE_AMOUNT);
        }
    }
}
