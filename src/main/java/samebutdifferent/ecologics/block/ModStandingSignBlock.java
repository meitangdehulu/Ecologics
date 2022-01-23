package samebutdifferent.ecologics.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import samebutdifferent.ecologics.block.entity.ModSignBlockEntity;

public class ModStandingSignBlock extends StandingSignBlock {
    public ModStandingSignBlock(Properties properties, WoodType type) {
        super(properties, type);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ModSignBlockEntity(pos, state);
    }
}
