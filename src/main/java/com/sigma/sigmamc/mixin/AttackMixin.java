package com.sigma.sigmamc.mixin;

import net.minecraft.client.MinecraftClient;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class AttackMixin {

    @Inject(
            method = "doAttack",
            at = @At("HEAD")
    )
    private void sigma_onAttack(CallbackInfoReturnable<Boolean> cir) {

        System.out.println(
                "[Sigma_mc] LEFT CLICK DETECTED"
        );
    }
}
