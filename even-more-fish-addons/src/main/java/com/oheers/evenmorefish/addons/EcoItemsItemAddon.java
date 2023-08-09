package com.oheers.evenmorefish.addons;

import com.oheers.fish.EvenMoreFish;
import com.oheers.fish.addons.ItemAddon;
import com.willfp.ecoitems.items.EcoItem;
import com.willfp.ecoitems.items.EcoItems;
import org.apache.commons.lang3.JavaVersion;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class EcoItemsItemAddon extends ItemAddon {
    @Override
    public String getPrefix() {
        return "ecoitems";
    }

    @Override
    public String getPluginName() {
        return "EcoItems";
    }

    @Override
    public String getAuthor() {
        return "FireML";
    }

    @Override
    public ItemStack getItemStack(String id) {
        final EcoItem item = EcoItems.INSTANCE.getByID(id);

        if (item == null) {
            EvenMoreFish.logger.info(() -> String.format("Could not obtain EcoItems item %s", id));
            return new ItemStack(Material.COD);
        }
        return item.getItemStack();
    }

    @Override
    public JavaVersion getRequiredJavaVersion() {
        return JavaVersion.JAVA_17;
    }
}
