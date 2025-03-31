package com.eseabsolute.apzfolia;

import com.eseabsolute.apzfolia.listeners.PiglinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class AntiPiglinZombification extends JavaPlugin {
    Logger logger;
    PluginManager pluginManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        logger = Bukkit.getLogger();
        pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PiglinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
