package de.tomas.utils;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.io.File;
import java.io.IOException;

public class GuiManager {

    File fileServerProperties = new File("server.properties");
    FileConfiguration serverProperties = Bukkit.spigot().getConfig();

    public void saveServerProperties() {
        try {
            serverProperties.save(fileServerProperties);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void openNormalInventory(Player player) {
        Inventory inventory = Bukkit.createInventory(null, 9, Component.text("§c§lAdminGui"));

        inventory.setItem(0, new ItemBuilder(Material.COMMAND_BLOCK).setDisplayName("§cServer Properties").setLore("§8-> §7edit the server.properties file").build());
        inventory.setItem(1, new ItemBuilder(Material.COMMAND_BLOCK).setDisplayName("§cGamerules").setLore("§8-> §7edit the game rules").build());
        inventory.setItem(2, new ItemBuilder(Material.COMMAND_BLOCK).setDisplayName("§cOP Manager").setLore("§8-> §7edit the ops on the server").build());
        for (int i = 3; i < 9; i++) {
            inventory.setItem(i, new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE).setDisplayName("§7").build());
        }

        player.openInventory(inventory);
    }

    public void openServerPropertiesInventory(Player player) {
        Inventory inventory = Bukkit.createInventory(null, 9, Component.text("§c§lServer Properties"));



        player.openInventory(inventory);
    }

}
