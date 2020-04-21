package me.caleb.UtilsAPI.utils;

import org.bukkit.plugin.java.JavaPlugin;

public class UtilsAPI extends JavaPlugin {

    private static UtilsAPI plugin;

    @Override
    public void onEnable(){
        this.plugin = this;
    }

    @Override
    public void onDisable() {

    }

    public static UtilsAPI getInstance(){
        return plugin;
    }
}
