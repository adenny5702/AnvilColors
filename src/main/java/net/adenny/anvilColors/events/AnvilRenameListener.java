package net.adenny.anvilColors.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AnvilRenameListener implements Listener
{
    @EventHandler
    public void onAnvilRename(PrepareAnvilEvent event)
    {
        ItemStack result =  event.getResult();

        if (result == null || !result.hasItemMeta())
            return;

        ItemMeta meta = result.getItemMeta();

        if (meta.hasDisplayName())
        {
            String name = meta.getDisplayName();
            String newName = ChatColor.translateAlternateColorCodes('&', name);

            meta.setDisplayName(newName);
            result.setItemMeta(meta);
            event.setResult(result);
        }
    }
}
