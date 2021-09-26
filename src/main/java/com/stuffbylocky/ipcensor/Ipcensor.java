package com.stuffbylocky.ipcensor;

import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public class Ipcensor implements ModInitializer {

    public static float VERSION = 1;

    @Override
    public void onInitialize() {

        Logger.getGlobal().info("IP Censor v"+VERSION+" Loaded");

    }





}