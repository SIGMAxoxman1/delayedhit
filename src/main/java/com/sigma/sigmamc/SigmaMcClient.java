package com.sigma.sigmamc;

import net.fabricmc.api.ClientModInitializer;

public class SigmaMcClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("[Sigma_mc] Loaded");
    }
}
