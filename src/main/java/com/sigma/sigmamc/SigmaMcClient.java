package com.sigma.sigmamc;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class SigmaMcClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        System.out.println("[Sigma_mc] Loaded");

        ClientTickEvents.END_CLIENT_TICK.register(client -> {

            if (client.player == null)
                return;

            if (client.crosshairTarget == null)
                return;

            switch (client.crosshairTarget.getType()) {

                case ENTITY -> {
                    System.out.println("[Sigma_mc] Entity Targeted");
                }

                case BLOCK -> {
                    // تجاهل البلوكات حالياً
                }

                case MISS -> {
                    // لا يوجد هدف
                }
            }
        });
    }
}
