package com.simibubi.create.compat.rei.category;

import org.jetbrains.annotations.NotNull;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.rei.category.animations.AnimatedKinetics;
import com.simibubi.create.content.kinetics.fan.HauntingRecipe;
import com.simibubi.create.foundation.gui.AllGuiTextures;
import com.simibubi.create.foundation.gui.element.GuiGameElement;

import net.minecraft.world.level.block.Blocks;

public class FanHauntingCategory extends ProcessingViaFanCategory.MultiOutput<HauntingRecipe> {

	public FanHauntingCategory(Info<HauntingRecipe> info) {
		super(info);
	}

	@Override
	protected AllGuiTextures getBlockShadow() {
		return AllGuiTextures.JEI_LIGHT;
	}

	@Override
	protected void renderAttachedBlock(@NotNull PoseStack matrixStack) {
		GuiGameElement.of(Blocks.SOUL_FIRE.defaultBlockState())
			.scale(SCALE)
			.atLocal(0, 0, 2)
			.lighting(AnimatedKinetics.DEFAULT_LIGHTING)
			.render(matrixStack);
	}

}
