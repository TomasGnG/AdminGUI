package de.tomas.utils;

import java.util.Arrays;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemBuilder {

    private ItemStack itemStack;
    private ItemMeta itemMeta;
    private ItemFlag[] itemFlag;

    public ItemBuilder(Material material) {
        this.itemStack = new ItemStack(material);
        this.itemMeta = this.itemStack.getItemMeta();
    }

    public ItemBuilder setDisplayName(String name) {
        this.itemMeta.displayName(Component.text(name));
        return this;
    }

    public ItemBuilder setDurability(short durability) {
        this.itemStack.setDurability(durability);
        return this;
    }

    public ItemBuilder setAmount(int amount) {
        this.itemStack.setAmount(amount);
        return this;
    }

    public ItemBuilder setUnbreakable(boolean bool) {
        this.itemMeta.setUnbreakable(bool);
        return this;
    }

    public ItemBuilder setItemFlag(ItemFlag... itemflag) {
        this.itemMeta.addItemFlags(itemflag);
        return this;
    }

    public ItemBuilder setLore(String... lore) {
        this.itemMeta.setLore(Arrays.asList(lore));
        return this;
    }

    public ItemBuilder addEnchantment(Enchantment enchantment, int level) {
        this.itemMeta.addEnchant(enchantment, level, false);
        return this;
    }

    public ItemStack build() {
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

}
