package com.sigma.sigmamc;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

public class SigmaMcClient implements ClientModInitializer {

    private static int ticks = 0;

    @Override
    public void onInitializeClient() {

        System.out.println("[Sigma_mc] Loaded");

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            ticks++;

            if (ticks >= 20) {
                ticks = 0;

                if (client.player != null) {
                    System.out.println(
                            "[Sigma_mc] Player: "
                                    + client.player.getName().getString()
                    );
                }
            }
        });
    }
}
