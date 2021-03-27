package de.tomas;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AdminGui extends JavaPlugin {
    private static AdminGui instance;

    @Override
    public void onEnable() {
        instance = this;


    }

    public void register() {
        PluginManager m = Bukkit.getPluginManager();


    }

    public static AdminGui getInstance() {
        return instance;
    }
}
